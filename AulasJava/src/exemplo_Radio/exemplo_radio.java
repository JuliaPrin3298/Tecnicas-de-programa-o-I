package exemplo_Radio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class exemplo_radio extends JFrame {

    private static final long serialVersionUID = 1L;
    JRadioButton radio1 = new JRadioButton("Manhã");
    JRadioButton radio2 = new JRadioButton("Tarde");
    JRadioButton radio3 = new JRadioButton("Noite");

    public exemplo_radio(){
        super("Horário");
        Container cont = getContentPane();
        
        //permite que crie um grupo e o radio dos botões só selecione um
        ButtonGroup grupo = new ButtonGroup();
        
        JLabel rotulo = new JLabel("Selecione um período:");
        JButton botao = new JButton("Verificar");
        setLayout(null);
        
        grupo.add(radio1);
        grupo.add(radio2);
        grupo.add(radio3);
        
        cont.add(rotulo);
        cont.add(radio1);
        cont.add(radio2);
        cont.add(radio3);
        cont.add(botao);
        
        
        rotulo.setBounds(50,20,200,20);
        radio1.setBounds(60, 50, 100, 20);
        radio2.setBounds(60, 70, 100, 20);
        radio3.setBounds(60, 90, 100, 20);
        botao.setBounds(50, 120, 100, 20);
        
        ClicaBotao evento = new ClicaBotao();
        botao.addActionListener(evento);
       
        setSize(310, 200);
        setVisible(true);
    }
    
    public class ClicaBotao implements ActionListener{
    	public void actionPerformed(ActionEvent e) {
    		String texto;
    		if(radio1.isSelected()== true) {
    			texto = "Período Selecionado: Manhã";
    			JOptionPane.showMessageDialog(null, texto);
    			
    		} else if(radio2.isSelected()== true ) {
    			texto = "Período Selecionado: Tarde";
    			JOptionPane.showMessageDialog(null, texto);
    			
    		} else if(radio3.isSelected()== true ) {
    			texto = "Período Selecionado: Noite";
    			JOptionPane.showMessageDialog(null, texto);
    		}
    	}
    		
    }

    public static void main (String ards[]){
        new exemplo_radio();
    }
}
