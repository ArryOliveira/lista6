package q4;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Display2 extends JPanel {
	public Display display;
	public Display2(Display display) {
		this.display=display;
	 JLabel l1= new JLabel();
	 JLabel l2= new JLabel();
	 JLabel l3= new JLabel();
	 JLabel l4= new JLabel();
	 JLabel l5= new JLabel();
	 JLabel l6= new JLabel();
	 setLayout(new GridLayout(4,3));
	 l1.setForeground(Color.GREEN);
	 l1.setText(">>maior");
	 l3.setForeground(Color.GREEN);
	 l3.setText(">>maior");
	 l5.setForeground(Color.GREEN);
	 l5.setText(">>maior");
	 add(l1);
	 add(l2);
	 add(l3);
	 add(l4);
	 add(l5);
	 add(l6);
	 JButton b=new JButton();
	 b.setText("EXIBIR");
	 add(b);
	b.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				l2.setText("maior:"+display.maior(display.numeros));
				l2.setForeground(Color.BLACK);
				l4.setText("menor"+display.menor(display.numeros));
				l4.setForeground(Color.BLACK);
				l6.setText("media"+display.media(display.numeros));
				l6.setForeground(Color.BLACK);
				
			}
		});
	 
			
		

}
}
	