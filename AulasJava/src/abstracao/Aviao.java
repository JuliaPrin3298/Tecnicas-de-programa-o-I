package abstracao;

public class Aviao extends Transporte {

	public Aviao(String veiculo) {
		super(veiculo);
		
	}

	@Override
	public void locomoverOnde() {
		System.out.println("Se locomove no ar");
		
	}

	

	
}
