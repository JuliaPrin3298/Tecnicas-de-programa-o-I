package tama;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener; // Importar para os botões
import java.io.InputStream;           // Importar para carregar fontes (se necessário)

public class Interface extends JFrame {

    // ======= CONSTANTES DE ESTILO E DIMENSÃO =======
    private static final int JANELA_LARGURA = 600;
    private static final int JANELA_ALTURA = 700;
    private static final Dimension CONTAINER_DIMENSAO = new Dimension(500, 500);
    private static final Color COR_FUNDO_CONTAINER = new Color(0xFFF5F5); // Quase branco
    private static final Color COR_BOTAO_NORMAL = new Color(0xCA88EB);   // Lilás
    private static final Color COR_BOTAO_HOVER = new Color(0x9760B3);    // Lilás escuro

    // Elemento onde a imagem será exibida
    private final JLabel imagemLabel;

    public Interface() {
        // ======= 1. CONFIG JANELA PRINCIPAL =======
        setTitle("Tamagotchi");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(JANELA_LARGURA, JANELA_ALTURA);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout()); 
        setResizable(false);
        
        // Inicializa o JLabel que será usado para exibir a imagem
        imagemLabel = new JLabel();
        imagemLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // ======= 2. FUNDO COM GRADIENTE =======
        JPanel background = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                // Gradiente do azul (topo) para o rosa (base)
                GradientPaint gradiente = new GradientPaint(
                        0, 0, new Color(34, 133, 195),
                        getWidth(), getHeight(), new Color(232, 45, 253)
                );
                g2d.setPaint(gradiente);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        background.setLayout(new GridBagLayout()); // Mantém o container centralizado

        // ======= 3. CONTAINER CENTRAL (O "Tamagotchi") =======
        JPanel container = new JPanel(new BorderLayout(10, 20));
        container.setPreferredSize(CONTAINER_DIMENSAO);
        container.setBackground(COR_FUNDO_CONTAINER);
        container.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1, true),
                BorderFactory.createEmptyBorder(20, 20, 20, 20)
        ));

        // Tenta carregar a fonte 'DynaPuff', caso contrário, usa SansSerif
        Font fonteTitulo = getCustomFont("DynaPuff", Font.BOLD, 36);
        Font fonteSubtitulo = getCustomFont("DynaPuff", Font.PLAIN, 20);
        Font fonteBotao = getCustomFont("DynaPuff", Font.PLAIN, 14);


        // ======= 4. TÍTULO E SUBTÍTULO =======
        JPanel topo = new JPanel(new GridLayout(2, 1));
        topo.setBackground(COR_FUNDO_CONTAINER);

        JLabel titulo = new JLabel("Tamagotchi", SwingConstants.CENTER);
        titulo.setFont(fonteTitulo);
        titulo.setForeground(Color.BLACK);

        JLabel subtitulo = new JLabel("Escolha o seu animal", SwingConstants.CENTER);
        subtitulo.setFont(fonteSubtitulo);
        subtitulo.setForeground(Color.DARK_GRAY);

        topo.add(titulo);
        topo.add(subtitulo);

        // ======= 5. TELA PRETA =======
        JPanel tela = new JPanel(new GridBagLayout());
        tela.setPreferredSize(new Dimension(300, 300));
        tela.setBackground(Color.BLACK);
        tela.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 1));

        tela.add(imagemLabel); // Adiciona o label da imagem no centro da tela preta

        // ======= 6. BOTÕES (COM LÓGICA DE AÇÃO) =======
        JPanel botoes = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 15));
        botoes.setBackground(COR_FUNDO_CONTAINER);

        String[] nomes = {"Cachorro", "Gato", "Panda", "Corvo"};
        for (String nome : nomes) {
            JButton btn = new JButton(nome);
            btn.setFocusPainted(false);
            btn.setFont(fonteBotao);
            btn.setBackground(COR_BOTAO_NORMAL);
            btn.setForeground(Color.BLACK);
            btn.setBorder(BorderFactory.createLineBorder(COR_BOTAO_NORMAL, 2, true));
            btn.setPreferredSize(new Dimension(90, 40));
            btn.setCursor(new Cursor(Cursor.HAND_CURSOR));

            // Lógica de HOVER (MouseListener)
            btn.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    btn.setBackground(COR_BOTAO_HOVER);
                    btn.setBorder(BorderFactory.createLineBorder(COR_BOTAO_HOVER, 2, true));
                }

                @Override
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    btn.setBackground(COR_BOTAO_NORMAL);
                    btn.setBorder(BorderFactory.createLineBorder(COR_BOTAO_NORMAL, 2, true));
                }
            });

            // Lógica de AÇÃO (ActionListener)
            btn.addActionListener(e -> selecionarAnimal(nome));

            botoes.add(btn);
        }

        // ======= 7. MONTAGEM FINAL =======
        container.add(topo, BorderLayout.NORTH);
        container.add(tela, BorderLayout.CENTER);
        container.add(botoes, BorderLayout.SOUTH);

        background.add(container);
        add(background, BorderLayout.CENTER);

        setVisible(true);
    }

    /**
     * Tenta carregar uma fonte customizada, se não conseguir, retorna uma fonte padrão.
     * @param nome Nome da fonte (ex: "DynaPuff")
     * @param estilo Estilo (ex: Font.BOLD)
     * @param tamanho Tamanho da fonte
     * @return A fonte carregada ou uma fonte SansSerif como fallback.
     */
    private Font getCustomFont(String nome, int estilo, int tamanho) {
        // Nota: Idealmente, você carregaria a fonte a partir de um arquivo .ttf.
        // Como não temos o arquivo, tentamos o nome e usamos um fallback.
        try {
            return new Font(nome, estilo, tamanho);
        } catch (Exception e) {
            System.err.println("Aviso: Fonte '" + nome + "' não encontrada. Usando SansSerif.");
            return new Font("SansSerif", estilo, tamanho);
        }
    }


    /**
     * Método para lidar com a seleção do animal.
     * Deve carregar a imagem correspondente e exibi-la na tela.
     * @param nomeAnimal O nome do animal selecionado (ex: "Cachorro").
     */
    private void selecionarAnimal(String nomeAnimal) {
        System.out.println("Animal selecionado: " + nomeAnimal);

        // --- Lógica de Carregamento de Imagem ---
        // Aqui você deve usar o nomeAnimal para buscar o arquivo de imagem correto.
        // Exemplo: "Cachorro" -> "cachorro.png".

        // SIMULAÇÃO: Usaremos um placeholder de imagem.
        // Substitua esta parte pelo carregamento real da sua imagem.
        String caminhoImagemSimulado = "/caminho/para/" + nomeAnimal.toLowerCase() + ".png"; 

        try {
            // Exemplo de como você carregaria uma imagem de verdade:
            // URL url = getClass().getResource(caminhoImagemSimulado);
            // ImageIcon originalIcon = new ImageIcon(url);
            
            // Placeholder: Cria uma imagem temporária para demonstração
            // No seu projeto real, você usará as linhas comentadas acima.
            ImageIcon originalIcon = createPlaceholderImage(nomeAnimal);
            
            Image originalImage = originalIcon.getImage();
            
            // Redimensiona a imagem para caber no label (ajuste as dimensões conforme o necessário)
            int telaLargura = 280; // Largura ligeiramente menor que a tela preta (300)
            int telaAltura = 280; // Altura ligeiramente menor que a tela preta (300)

            Image resizedImage = originalImage.getScaledInstance(
                telaLargura, telaAltura, Image.SCALE_SMOOTH
            );

            // Define o novo ícone redimensionado no label
            imagemLabel.setIcon(new ImageIcon(resizedImage));

        } catch (Exception e) {
            imagemLabel.setIcon(null); // Remove qualquer imagem anterior
            imagemLabel.setText("Erro ao carregar imagem de " + nomeAnimal);
            imagemLabel.setForeground(Color.RED);
            System.err.println("Erro ao carregar imagem para " + nomeAnimal + ": " + e.getMessage());
        }
    }
    
    /**
     * Cria uma imagem placeholder para simular o carregamento de imagens.
     * REMOVA este método quando você tiver suas imagens reais.
     */
    private ImageIcon createPlaceholderImage(String nome) {
        // Cria uma imagem simples para fins de demonstração
        Image img = new java.awt.image.BufferedImage(200, 200, java.awt.image.BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = (Graphics2D) img.getGraphics();
        
        g.setColor(new Color(0xFFFFFF)); // Fundo branco
        g.fillRect(0, 0, 200, 200);
        
        g.setColor(new Color(0x33CCFF)); // Cor do animal
        g.fillOval(30, 30, 140, 140);
        
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.drawString(nome, 60, 100);
        
        g.dispose();
        return new ImageIcon(img);
    }

    public static void main(String[] args) {
        // Garantir que a criação da GUI ocorra na Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(Interface::new);
    }
}