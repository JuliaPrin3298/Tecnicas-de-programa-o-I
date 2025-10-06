package abstracao;

public class Automovel extends Transporte {

	public Automovel(String veiculo) {
		super(veiculo);
	}

	@Override
	public void locomoverOnde() {
		System.out.println("Se locomove na terra");
		
	}
	
	
	
}
