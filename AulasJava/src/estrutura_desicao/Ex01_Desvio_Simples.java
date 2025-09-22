package estrutura_desicao;
import java.util.Scanner;

public class Ex01_Desvio_Simples {

	public static void main(String[] args) {
		 int A, B, R;
		    Scanner s = new Scanner(System.in);
		    System.out.println();
		    System.out.println("Entre com o valor <A>: ");
		    A = s.nextInt();
		    System.out.println("Entre com o valor <B>: ");
		    B = s.nextInt();
		    R = A + B;
		    System.out.println();
		    if (R > 10){
		        System.out.println("Resultado = "+ R);
		    }
		    s.close();
	}

}
