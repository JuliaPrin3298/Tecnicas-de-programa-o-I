package tamagotchi;

public class Jogador {
	private	int id;
	public	String nome;
	public	String animais: List Animal;
	
	public void escolherAnimal() {
		System.out.println("Escolha Algum dos animais");
	}
	
	public void trocarAnimal() {
		System.out.println("Deseja Trocar de Animal?");
	}
	
	public void interagirAnimal() {
		System.out.println("Escolha Alguma Ação:");
	}
	
	public void assistirAnimal() {
		System.out.println("Gif Ação escolhida");
	}
	
	public void desligar() {
		System.out.println("Desligando Sistema");
	}
	
}
