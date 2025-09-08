package outroPacote;

import atv1.Encapsulamento;

public class TesteExterno {
    public static void main(String[] args) {
        Encapsulamento obj = new Encapsulamento("Pacote", "Privado", "Protegido", "Publico");

        System.out.println("Acessando public: " + obj.nomePublico); 

        // Se descomentar, vai dar erro de compilação:
       // System.out.println("Acessando private: " + obj.nomePrivado);   // Não le
       // System.out.println("Acessando protected: " + obj.nomeProtegido); // Não le
       // System.out.println("Acessando pacote: " + obj.nomePacote);     // Não le
    }
}
