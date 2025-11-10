package integracao;

import java.awt.BorderLayout;
import java.awt.*;

import javax.swing.*;

public class Mensagem {

	public static void main(String[] args) {
		JFrame janela = new JFrame("Mensagem");
		JLabel texto  = new JLabel("Interface gráfica em Java");
		janela.getContentPane().setBackground(new Color (213, 244, 232));
		//Adicionando o rótulo (LABEL) a frame (janela)
		janela.getContentPane().add(texto);
		
		janela.setLayout(null);//Define o layout nulo
		
		texto.setBounds(70,50,200,20);//Define o tamanho do rótulo
		janela.add(texto, BorderLayout.CENTER);
		//janela.getContentPane().setBackground(Color.RED); //cor de fundo
		texto.setForeground(Color.BLUE);
		janela.setSize(300, 150);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
