import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Interface2 extends JFrame implements ActionListener{

	private JPanel pnDados, pnBotoes;
	private JLabel lbCodigo, lbNome;
	private JTextField tfCodigo, tfNome;
	private JButton btCriar, btMostrar, btSair;
	private Container tela;
	
	private Cadastro cliente;
	
	Interface2(){
		//Criação do container
		tela = this.getContentPane();
		tela.setLayout(new BorderLayout());//para usar o conceito de norte e sul para definir limite
		
		//configurar paineis
		pnDados = new JPanel();
		pnBotoes = new JPanel();
		tela.add(pnDados,BorderLayout.NORTH);
		tela.add(pnBotoes,BorderLayout.SOUTH);
		pnDados.setBackground(Color.cyan);
		pnBotoes.setBackground(Color.gray);
		
		//Configurando Componentes
		lbCodigo = new JLabel("Código do Cliente");
		lbNome = new JLabel("Nome do Cliente");
		tfCodigo = new JTextField(10);
		tfNome = new JTextField(30);
		btCriar = new JButton("Criar");
		btMostrar = new JButton("Mostrar");
		btSair = new JButton("Sair");
		
		//tfCodigo.setEditable(false);
		
		//adição dos componentes
		pnDados.setLayout(new GridLayout(2,2));//no painel 1 vai ter 2 linhas e 2 colunas
		pnDados.add(lbCodigo);pnDados.add(tfCodigo);
		pnDados.add(lbNome);pnDados.add(tfNome);
		
		pnBotoes.setLayout(new GridLayout(1,3));
		pnBotoes.add(btCriar);pnBotoes.add(btMostrar);pnBotoes.add(btSair);
		
		//eventos dos botoes
		btCriar.addActionListener(this);
		btMostrar.addActionListener(this);
		btSair.addActionListener(this);
		
		
		
		super.setTitle("Cadastro Clientes");//titulo da janela
		super.setSize(400,100);//tamanho da janela
		super.setLocationRelativeTo(null);//Centralizar a janela
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);//todas as vezes que clicar em fechar a janela, a janela será fechada
		super.setVisible(true);//deixar visivel a tela
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Quem Realiza a ação
		if(e.getSource() == btCriar) {
			cliente = new Cadastro(tfNome.getText());
			tfCodigo.setText(Integer.toString(cliente.getCodCliente()));
			JOptionPane.showMessageDialog(null,"Cadastro efetuado com sucesso!");
		}
		if(e.getSource() == btMostrar)
			JOptionPane.showMessageDialog(null,cliente);
		
		if(e.getSource() == btSair) System.exit(0);
		
	}
}
