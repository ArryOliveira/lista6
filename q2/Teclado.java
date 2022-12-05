package q2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import q1.Botao;

public class Teclado extends JPanel {
	public JLabel label;
	public Display display;
	public Teclado(Display display) {
		this.display=display;
	setBackground(Color.PINK);
	/*label = new JLabel();
	label.setForeground(Color.WHITE);
	label.setText("olá");
	label.setFont(new Font("courier", Font.ITALIC, 20 ));
	label.setLayout(new BorderLayout());
	add(label);*/
	setLayout(new FlowLayout());
	criarBotoes("jisoo", Color.yellow);
	criarBotoes("ling ling", Color.CYAN);
	criarBotoes("jao", Color.GREEN);
	criarBotoes("bts",Color.RED);
	criarBotoes("red velvet",Color.RED);
	criarBotoes("blackpink",Color.DARK_GRAY);
	
	
	
}




	public void criarBotoes(String texto, Color cor) {
		Botao b = new Botao(texto, cor);
		add(b);
		b.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//label.setText(b.getText());	
				display.label.setText(b.getText());
			}
		});
	}


		
}
