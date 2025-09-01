package AtvTv;

import java.util.Scanner;

public class TV {
	String status;
	int nvl_volume;
	float n_canal;
	
	public void mudar_canal() {
		System.out.println("Você está no canal: "+n_canal);
		System.out.println("Você gostaria de mudar de canal (S - N): ");
		String m_canal = scanner.nextLine();
				if(m_canal = "S") {
					n_canal + 1;
					System.out.println("Voce está no canal "+n_canal);
				}else {
					System.out.println("Você está no SBT");
				}
	}
}
