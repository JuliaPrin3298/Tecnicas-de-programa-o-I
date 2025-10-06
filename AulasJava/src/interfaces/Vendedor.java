package interfaces;

public class Vendedor implements Loja {
	int id;
	String vendedor;
	
	public Vendedor(String vendedor) {
		this.vendedor = vendedor;
	}
	
	@Override
	public void inseir() {
		System.out.println("Inserindo Vendedor: " + vendedor);
		
	}

	@Override
	public void excluir() {
		System.out.println("Excluir Vendedor: "+ vendedor);
		
	}

	@Override
	public void localizar() {
		System.out.println("Localizando Vendedor ...");
		System.out.println(vendedor +".");
		
	}

}
