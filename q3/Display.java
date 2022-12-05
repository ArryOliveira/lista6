package q3;

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

public class Display extends JPanel {
	public JLabel label;
	public Display(){
		this.setBackground(Color.PINK);
		label = new JLabel();
		label.setForeground(Color.WHITE);
		label.setText("ZA WARUDO!!!");
		label.setFont(new Font("courier", Font.ITALIC, 20 ));
		add(label);
	
	}



}