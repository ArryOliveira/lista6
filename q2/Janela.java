package q2;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Janela extends JFrame{
	

		private JPanel painel;
		public Janela() {
			setSize(600,600);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			organizarLayout();
			setVisible(true);
		}
	public void organizarLayout() {
		setLayout(new BorderLayout());
		Display d=new Display();
		add(d,BorderLayout.NORTH);
		Teclado t=new Teclado(d);
		add(t,BorderLayout.CENTER);

	
	}
}
