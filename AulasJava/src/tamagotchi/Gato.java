import Tamagotchi.Animal;

public class Cachorro extends Animal{
    public String raca;
    public String cor;
    public String pelagem;

    public String EmetirSom(){
		return  "Miau";
    }

    public void  passear(){
        System.out.println("Correndo atrás de um rato");
    }
}
