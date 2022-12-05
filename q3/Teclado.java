package q3;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import q1.Botao;

public class Teclado extends JPanel {
	public Display display;
	public Teclado(Display display) {
		this.display=display;
		criarBotoes("enviar",Color.RED);
		
	}
	
	
	
	public void criarBotoes(String texto, Color cor) {
		Botao b = new Botao(texto, cor);
		add(b);
		b.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, display.label.getText());
			}
		});
	}

}
