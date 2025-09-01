package AtvEscola;

public class UsaAluno {

	public static void main(String[] args) {
		Aluno objAluno1 = new Aluno();
		Aluno objAluno2 = new Aluno();
		
		
		objAluno1.ra = 12345;
		objAluno1.nome = "Carlos";
		objAluno1.curso = "DSM";
		objAluno1.mostrar();
		
		objAluno2.ra = 54321;
		objAluno2.nome = "Roberto";
		objAluno2.curso = "ADS";
		objAluno2.mostrar();

	}

}

