package estrutura_elseif;
import java.util.Scanner;

public class Ex03_desvio_composto {


	public static void main(String[] args) {
		
		int A, B, R;
		Scanner s = new Scanner(System.in);
		System.out.println("Entre com o valor de A: ");
		A = s.nextInt();
		System.out.println("Entre com o valor de B: ");
		B = s.nextInt();
		R = A + B;
		if (R > 0) {
			System.out.println("O Resultado "+ R+ " é Positivo.");
		}else if(R < 0) {
			System.out.println("O Resultado "+ R+ " é Negativo.");
		}else {
			System.out.println("O Resultado "+ R+" é neutro");
		}
		

	}

}
