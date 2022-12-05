package q1;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Painel extends JPanel {
	public Painel(){
		this.setBackground(Color.white);
		setLayout(new FlowLayout());
		Botao y=new Botao("yellow",Color.yellow);
		Botao b=new Botao("blue",Color.blue);
		Botao r=new Botao("red",Color.red);
		y.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.yellow);
				
			}
		});
r.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.red);	
				
			}
		});
b.addActionListener(new ActionListener() {
	
	public void actionPerformed(ActionEvent e) {
		setBackground(Color.blue);	
		
	}
});

		
		add(y);
		add(b);
		add(r);
	}
}
