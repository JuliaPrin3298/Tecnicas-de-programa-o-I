package Ex02_Desvio_composto;
import java.util.Scanner;

public class Ex02_desvio_composto {

	public static void main(String[] args) {
		
		int A, B, R;
		Scanner s = new Scanner(System.in);
		System.out.println("Entre com o valor de A: ");
		A = s.nextInt();
		System.out.println("Entre com o valor de B: ");
		B = s.nextInt();
		R = A + B;
		if (R >= 10) {
			System.out.println("O Resultado "+ R+ " é maior que 10.");
		}else {
			System.out.println("O Resultado "+ R+ " é menor que 10.");
		}
		

	}

}
