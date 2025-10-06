package abstracao;

public abstract class Transporte {
	String veiculo;
	
	// método construtor
	//para inicializar a variavel veiculo na classe aviao
	public Transporte(String veiculo) {
		this.veiculo = veiculo;
	}
	
	public abstract void locomoverOnde();
	
	public void acelerar() {
		System.out.println(veiculo +" está se acelerando!");
	}
	
	
}
