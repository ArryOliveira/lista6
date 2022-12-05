package q5;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Painel extends JPanel implements ActionListener {
	JLabel label=new JLabel();
	JTextField texto=new JTextField();
	ComboBox combo=new ComboBox();
	public Painel() {
		setLayout(new GridLayout(2,3));
		add(new JLabel("Valores:"));
		add(texto);
		add(label);
		add(new JLabel(" "));
		add(combo);
		Botao botao=new Botao();
		add(botao);
		botao.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String exemplo=null;
		if(combo.getSelectedItem()=="Somar") {
			exemplo=texto.getText();
			int numero=Integer.parseInt(exemplo);
			int n1=(int)numero/10;
			int n2=(int)numero%10;
			int soma=n2+n1;
			label.setText(" "+soma);
			
		}
		if(combo.getSelectedItem()=="Multiplicar") {
			exemplo=texto.getText();
			int numero=Integer.parseInt(exemplo);
			int n1=(int)numero/10;
			int n2=(int)numero%10;
			int produto=n2*n1;
			label.setText(" "+produto);
		}
		
	}

}
