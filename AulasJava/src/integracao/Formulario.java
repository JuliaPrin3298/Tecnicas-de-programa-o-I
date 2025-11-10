package integracao;

import javax.swing.*;

public class Formulario extends JFrame {
	
	private static final long serialversionUID = 1L;
	public Formulario() {
		super();
		
		JTextField texto = new JTextField();
		JButton botao = new JButton("OKAY");
		JLabel mensagem = new JLabel("Inserindo Componentes");
		
		setLayout(null);
		
		add(texto);
		add(botao);
		add(mensagem);
		
		texto.setBounds(140, 20, 300, 20);
		botao.setBounds(140, 50, 150, 20);
		mensagem.setBounds(140, 80, 220, 20);
		setSize(800, 370);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new Formulario();
		
		
	}
}
