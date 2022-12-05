package q5;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Frame extends JFrame {
	public Frame() {
		setSize(600,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Painel painel=new Painel();
		add(painel);
		setVisible(true);
	
	}

	
}
