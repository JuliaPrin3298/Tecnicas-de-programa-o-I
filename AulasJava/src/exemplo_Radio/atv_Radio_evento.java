package exemplo_Radio;
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;
public class atv_Radio_evento extends JFrame{

	private static final long serialVersionUID = 1L;
	JTextField input1; 
	JRadioButton radio1 = new JRadioButton("Masculino", true); 
	JRadioButton radio2 = new JRadioButton("Feminino");
	public atv_Radio_evento() { 
		super("Cliente");
		
		Container CONT = getContentPane(); 
		ButtonGroup GRUPO = new ButtonGroup();
		JLabel p1 = new JLabel("Entre seu nome:"); 
		JLabel p2 = new JLabel("Selecione seu sexo:"); 
		input1 = new JTextField(); 
		JButton BOTAO = new JButton("OK");
		
		setLayout(null);
		
		GRUPO.add(radio1); 
		GRUPO.add(radio2);
		
		CONT.add(p1); 
		CONT.add(input1); 
		CONT.add(p2); 
		CONT.add(radio1); 
		CONT.add(radio2); 
		CONT.add(BOTAO);
		
		p1.setBounds(30,30,110,20); 
		input1.setBounds(160,30,100,20);
		
		p2.setBounds(30,60,130,20); 
		radio1.setBounds(160,60,100,20); 
		radio2.setBounds(160,80,100,20);
		
		BOTAO.setBounds(120,120,70,20);
		
		AcionaBotao eve = new AcionaBotao(); 
		BOTAO.addActionListener(eve);
		
		setSize(310, 200); 
		setLocationRelativeTo(null);
		setVisible(true);
		
		}
	
	private class AcionaBotao implements ActionListener { 
		public void actionPerformed(ActionEvent ae) {
		String text;
		if (radio1.isSelected() == true) { 
			text = "Olá, Senhor \n" + input1.getText(); 
			JOptionPane.showMessageDialog( null, text, "Saudação para homem", 1); 
			}
		if (radio2.isSelected() == true) { 
			text = "Olá, Senhora \n" + input1.getText();
			JOptionPane.showMessageDialog( null, text, "Saudação para mulher", 1); 
			}
			input1.setText(""); input1.requestFocus();
				} 
			}
			public static void main(String args[]) { 
				javax.swing.SwingUtilities.invokeLater( 
					new Runnable() { 
						public void run() { 
							JFrame.setDefaultLookAndFeelDecorated(true); 
							JDialog.setDefaultLookAndFeelDecorated(true); 
							atv_Radio_evento page = new atv_Radio_evento(); 
							page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}
			} 
		);
	}

}
