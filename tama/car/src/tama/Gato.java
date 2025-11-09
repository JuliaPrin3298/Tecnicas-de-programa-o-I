package tama;

public class Gato extends Animal {
    public String raca;
    public String cor;
    public String pelagem;

    public String EmetirSom() {
        return "Miau Miau";
    }

    public void pegarRato() {
        System.out.println("Correndo atras do rato!");
    }
}
