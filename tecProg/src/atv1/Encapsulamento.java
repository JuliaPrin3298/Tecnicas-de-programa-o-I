package atv1;

public class Encapsulamento {
    public String nomePublico;       // acessado de qualquer lugar
    private String nomePrivado;      // só dentro dessa classe
    protected String nomeProtegido;  // acessado nessa classe e em subclasses
    String nomePacote;               // default: só dentro do mesmo pacote

    // Construtor
    public Encapsulamento(String nomePacote, String nomePrivado, String nomeProtegido, String nomePublico) {
        this.nomePacote = nomePacote;
        this.nomePrivado = nomePrivado;
        this.nomeProtegido = nomeProtegido;
        this.nomePublico = nomePublico;
    }

    // Método para mostrar dados
    public void mostrarNome() {
        System.out.println("Nome público: " + nomePublico);
        System.out.println("Nome privado: " + nomePrivado);
        System.out.println("Nome protegido: " + nomeProtegido);
        System.out.println("Nome pacote: " + nomePacote);
    }
}
