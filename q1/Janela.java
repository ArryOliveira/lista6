package q1;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Janela extends JFrame {
	private JPanel painel;
	public Janela(JPanel painel) {
		setSize(300,600);
		this.painel=painel;
		add(painel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
