package interfaces;

public class Cliente implements Loja {
	int id;
	String cliente;
	
	public Cliente(String cliente) {
		this.cliente = cliente;
	}
	
	@Override
	public void inseir() {
		System.out.println("Inserindo Cliente");
		
	}

	@Override
	public void excluir() {
		System.out.println("Excluindo Cliente");
		
	}

	@Override
	public void localizar() {
		System.out.println("Localizando Cliente ...");
		
	}

}
