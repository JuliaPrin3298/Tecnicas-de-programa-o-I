package tama;

public class Panda extends Animal {
    public String raca;
    public String cor;
    public String pelagem;

    public String EmetirSom() {
        return "GRRR GRR";
    }

    public void Passear() {
        System.out.println("Subindo na árvore!");
    }
}
