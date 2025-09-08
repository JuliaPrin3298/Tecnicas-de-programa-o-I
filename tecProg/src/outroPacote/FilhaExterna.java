package outroPacote;

import atv1.Encapsulamento;

public class FilhaExterna extends Encapsulamento {

    public FilhaExterna(String pacote, String privado, String protegido, String publico) {
        super(pacote, privado, protegido, publico);
    }

    public void mostrarAcessos() {
        System.out.println("Acessando public: " + nomePublico);   
        System.out.println("Acessando protected: " + nomeProtegido); 

        // Estes dão erro se descomentar:
       // System.out.println("Acessando private: " + nomePrivado);  // Não le
       // System.out.println("Acessando pacote: " + nomePacote);    // Não le
    }

    public static void main(String[] args) {
        FilhaExterna filha = new FilhaExterna("Pacote", "Privado", "Protegido", "Publico");
        filha.mostrarAcessos();
    }
}
