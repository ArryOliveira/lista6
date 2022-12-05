package q4;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Janela extends JFrame {
	public Janela() {
		setSize(600,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		organizar();
		setVisible(true);
	
		
	}
	public void organizar() {
		setLayout(new BorderLayout());
		Display d=new Display();
		add(d,BorderLayout.NORTH);
		Display2 d2=new Display2(d);
		add(d2,BorderLayout.CENTER);
	}
}
