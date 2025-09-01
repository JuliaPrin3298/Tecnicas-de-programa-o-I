package Aula1;

public class Main {

	public static void main(String[] args) {
		// Instanciar o objeto cachorro
		Cachorro objCachorro1 = new Cachorro();
		Cachorro objCachorro2 = new Cachorro();
		objCachorro1.nome = "Rex";
		objCachorro1.idade = 2;
		objCachorro1.raca = "Labrador";
		objCachorro1.pelagem = "Longo";
		
		objCachorro2.nome = "Princípe";
		objCachorro2.idade = 9;
		objCachorro2.raca = "Lhasa-Apso";
		objCachorro2.pelagem = "Longo";
		
		objCachorro1.latir();
		objCachorro2.latir();
		
		System.out.println("Dados dos Cachorros: ");//Syso+ctrl+ espaço+ enter
		System.out.println("nome: "+objCachorro1.nome+ 
				"\nIdade: "+objCachorro1.idade+
				"\nRaça: "+ objCachorro1.raca +
				"\nPelagem: "+objCachorro1.pelagem);
		System.out.println("=================================");
		
		System.out.println("nome: "+objCachorro2.nome+ 
				"\nIdade: "+objCachorro2.idade+
				"\nRaça: "+ objCachorro2.raca +
				"\nPelagem: "+objCachorro2.pelagem);
	}

}
