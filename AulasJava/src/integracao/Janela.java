package integracao;

import javax.swing.*;

public class Janela {

	public static void main(String[] args) {
		JFrame janela = new JFrame("Minha Janela");//Cria o Componente Janela
		
		janela.setSize(300,150); //Define o tamanho da janela
		janela.setVisible(true);//Torna a Janela Visível
		//janela.setExtendedState(JFrame.MAXIMIZED_BOTH);//Maximizizar a Janela
		
		//Encerra o programa ao fechar a janela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//janela.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

	}

}
