package q4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Display extends JPanel {
	public ArrayList<Integer>numeros=new ArrayList<Integer>();
	public JLabel label=new JLabel();
	public int somei;
	public Display(){
		setLayout(new FlowLayout());
		label.setForeground(Color.black);
		label.setText(">>digite um número");
		add(label);
		JTextField texto = new JTextField(null,5);
		add(texto);
		JButton b = new JButton("OK");
		add(b);
		b.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				 int num = Integer.parseInt(texto.getText());
				 numeros.add(num);
			}
		});
	
		
		
		
		
		
	}
	public double media(ArrayList<Integer>lista) {
		int soma=0;
		double media=0;
		for(int numero : lista) {
			soma=soma+numero;
		}
		media=soma/lista.size();
		return media;
	}
	public int maior(ArrayList<Integer>lista) {
		int maior=0;
		for(int numero:lista) {
			if(numero>maior) {
				maior=numero;
			}
		}
		return maior;
	}
	public int menor(ArrayList<Integer>lista) {
		int menor=lista.get(0);
		for(int numero:lista) {
			if(menor>numero) {
			menor=numero;
			}
		}
		return menor;
	}
}
	
