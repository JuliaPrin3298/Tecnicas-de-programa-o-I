package interfaces;

public class Main {

	public static void main(String[] args) {
		Vendedor vend = new Vendedor("Carlos");
		System.out.println(vend.vendedor);
		vend.inseir();
		vend.localizar();
		vend.excluir();
		
		
		Cliente cli = new Cliente("Pedro");
		System.out.println(cli.cliente);
		cli.inseir();
		cli.localizar();
		cli.excluir();
		

	}

}
