package q3;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Janela extends JFrame {
	public Janela() {
		setSize(600,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		organiza();
		
	}
	public void organiza() {
		setLayout(new BorderLayout());
		Display display=new Display();
		add(display,BorderLayout.NORTH);
		Teclado t=new Teclado(display);
		add(t,BorderLayout.CENTER);
		
	}
}
