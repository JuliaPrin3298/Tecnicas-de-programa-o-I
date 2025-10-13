package tama;

public class Cachorro extends Animal {
    public String raca;
    public String cor;
    public String pelagem;

    public String EmetirSom() {
        return "AuAuAu";
    }

    public void Passear() {
        System.out.println("Passeando pela rua!");
    }
}
