package graficot1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;// JFrame é a janela principal
import javax.swing.JMenu;// JMenu é o menu
import javax.swing.JMenuItem;// JMenuItem é o item do menu
import javax.swing.JPopupMenu;// JPopupMenu é o menu de contexto

public class Janela extends JFrame implements ActionListener, MouseListener{

	private JPopupMenu popup;// JPopupMenu é o menu de contexto que aparece ao clicar com o botão direito do mouse
	
	private JMenu menuForma;// JMenu é o menu que contém as opções de forma
	private JMenu menuCor;// JMenu é o menu que contém as opções de cor
	
	private JMenuItem menuForma1;// JMenuItem é o item do menu que representa a forma retângulo
	private JMenuItem menuForma2;
	private JMenuItem menuForma3;
	
	private JMenuItem menuCor1;// JMenuItem é o item do menu que representa a cor preto
	private JMenuItem menuCor2;
	private JMenuItem menuCor3;
	
	private Desenho desenho;// Desenho é a classe que representa a área de desenho onde as formas serão desenhadas
	private int tipoForma=1;// tipoForma é um inteiro que representa o tipo de forma selecionada (1: retângulo, 2: círculo, 3: triângulo)
	private int tipoCor=1;// tipoCor é um inteiro que representa a cor selecionada (1: preto, 2: vermelho, 3: azul)
	
	Janela(){// Construtor da classe Janela, que inicializa a janela e seus componentes
		popup = new JPopupMenu();// Cria um novo menu de contexto
		menuForma = new JMenu("Forma");// Cria um novo menu para as formas
		menuCor = new JMenu("Cor");// Cria um novo menu para as cores
		
		menuForma1 = new JMenuItem("Retângulo");// Cria um novo item de menu para a forma retângulo
		menuForma2 = new JMenuItem("Círculo");
		menuForma3 = new JMenuItem("Triângulo");
		
		menuCor1 = new JMenuItem("Preto");// Cria um novo item de menu para a cor preto
		menuCor2 = new JMenuItem("Vermelho");
		menuCor3 = new JMenuItem("Azul");
		
		menuForma.add(menuForma1);// Adiciona o item de menu retângulo ao menu de formas
		menuForma.add(menuForma2);
		menuForma.add(menuForma3);
		
		menuCor.add(menuCor1);// Adiciona o item de menu preto ao menu de cores
		menuCor.add(menuCor2);
		menuCor.add(menuCor3);
		
		popup.add(menuForma);// Adiciona o menu de formas ao menu de contexto
		popup.add(menuCor);// Adiciona o menu de cores ao menu de contexto
		
		this.addMouseListener(this);// Adiciona o listener de mouse à janela para detectar cliques do mouse
		
		menuForma1.addActionListener(this);// Adiciona o listener de ação ao item de menu retângulo
		menuForma2.addActionListener(this);
		menuForma3.addActionListener(this);
		menuCor1.addActionListener(this);// Adiciona o listener de ação ao item de menu preto
		menuCor2.addActionListener(this);
		menuCor3.addActionListener(this);
		
		desenho = new Desenho(tipoForma, tipoCor);// Cria uma nova instância da classe Desenho, passando os tipos de forma e cor selecionados
		this.add(desenho);// Adiciona a área de desenho à janela
		
		this.setTitle("Desenhando");
		this.setSize(300,200);
		this.setLocationRelativeTo(null);// Centraliza a janela na tela
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);// Define a operação de fechamento da janela para sair do programa quando a janela for fechada
		this.setVisible(true);// Torna a janela visível
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == menuForma1) // Verifica qual item de menu foi selecionado e atualiza o tipo de forma e cor
			tipoForma = 1;
		else if(e.getSource() == menuForma2) 
			tipoForma = 2;
		else if(e.getSource() == menuForma3) 
			tipoForma = 3;		
		
		if(e.getSource() == menuCor1) 
			tipoCor = 1;
		else if(e.getSource() == menuCor2) 
			tipoCor = 2;
		else if(e.getSource() == menuCor3) 
			tipoCor = 3;	
		
		desenho.setTipoForma(tipoForma);// Atualiza o tipo de forma no objeto desenho
		desenho.setTipoCor(tipoCor);// Atualiza o tipo de cor no objeto desenho
	}
	

	@Override
	public void mouseClicked(MouseEvent e) {// Método chamado quando o mouse é clicado
		if(e.getButton() == MouseEvent.BUTTON3) {// Verifica se o botão direito do mouse foi clicado
			popup.show(this, 50, 50);//this é a janela
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {// Método chamado quando o botão do mouse é pressionado

	}

	@Override
	public void mouseReleased(MouseEvent e) {// Método chamado quando o botão do mouse é solto

	}

	@Override
	public void mouseEntered(MouseEvent e) {// Método chamado quando o mouse entra na área da janela

	}

	@Override
	public void mouseExited(MouseEvent e) {// Método chamado quando o mouse sai da área da janela
		
	}
}
