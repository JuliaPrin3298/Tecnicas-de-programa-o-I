package Atvaula2;
import java.util.Scanner;

public class Pedido {
	private int numero;
	private String nome;
	private String descricao;
	
public Pedido( int numero, String nome){
	this.numero = numero;
	this.nome = nome;
}


public void DadosCli() {
	System.out.println("\n==========================");
	System.out.println("\n Dados do Cliente: ");
	System.out.println("\n Número: "+numero +
			"\n Nome: "+nome);
}

public void alterarCliente() {
	System.out.println("\n==========================");
	System.out.println("Nome Cadastrado "+ nome+ ".");
	nome = "Camilo";
	System.out.println("Nome Atualizado " + nome+"!");
	
}

public void alterarDescricao() {
	System.out.println("\n==========================");
	System.out.println("Descrição Cadastrado "+ descricao+ ".");
	descricao = "Amaciante Ype - 500ml - 30 reais";
	System.out.println("Descrição atualizada, \n"+ descricao );
	
}

public void retornarCliente() {
	System.out.println("\n==========================");
	System.out.println("Nome Cadastrado "+ nome+ ".");
}

public void retornarDescricao() {
	System.out.println("\n==========================");
	System.out.println("Nome Cadastrado "+ descricao+ ".");
}

public void dadosPedido() {
	System.out.println("\n==========================");
	System.out.println("\n Dados do Pedido: ");
	System.out.println("\n Número: "+numero +
			"\n Nome: "+nome+
			"\n Descrição: "+descricao);
}
}

