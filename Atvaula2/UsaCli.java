package Atvaula2;
import java.util.Scanner;
public class UsaCli {

	public static void main(String[] args) {
		Pedido objCliente = new Pedido(32 , "Julia");
		objCliente.DadosCli();
		objCliente.alterarCliente();
		objCliente.alterarDescricao();
		objCliente.retornarCliente();
		objCliente.retornarDescricao();
		objCliente.dadosPedido();
		
		//objCliente.menu(objCliente);

	}

}
