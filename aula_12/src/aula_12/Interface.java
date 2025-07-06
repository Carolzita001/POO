package aula_12;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Interface extends JFrame{
	private JPanel pnDados, pnBotoes;
	private JLabel lbCodigo, lbNome;
	private JTextField tfCodigo, tfNome;
	private JButton btCriar, btMostrar, btSair;
	private Container tela;
	private Cadastro cliente;
	
	Interface(){
		//Container
		tela = this.getContentPane();
		tela.setLayout(new BorderLayout());
		//configurar paineis
		pnDados = new JPanel();
		pnBotoes = new JPanel();
		tela.add(pnDados,BorderLayout.NORTH);
		tela.add(pnBotoes,BorderLayout.SOUTH);
		pnDados.setBackground(Color.cyan);
		pnBotoes.setBackground(Color.cyan);
		
		
		
		super.setTitle("Cadastro Clientes");
		super.setSize(400,100);
		super.setLocationRelativeTo(null);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setVisible(true);
	}
}
