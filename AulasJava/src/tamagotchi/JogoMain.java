package tamagotchi;

public class JogoMain {
	int tempoJogo ;
	boolean ativo;
	
	public void iniciar() {
		System.out.println("Inicializando Tamagotchi");
		ativo = true;
	}
	
	public void getTempoDeJogo() {
		System.out.println("Tempo de Jogo: 00:00 ");
	}
	
	public void atualizarTempo() {
		System.out.println("Tempo de Jogo: 02:34 ");
	}
	
	public void desligar() {
		System.out.println("Desligando sistema");
		ativo = false ;
	}

	public static void main(String[] args) {
		

	}

}
