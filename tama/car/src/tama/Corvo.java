package tama;

public class Corvo extends Animal {
    public String raca;
    public String cor;
    public String inteligencia;

    public String EmetirSom() {
        return "caw caw";
    }

    public void Sobrevoar() {
        System.out.println("Voando!");
    }
}
