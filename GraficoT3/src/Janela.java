import java.awt.Color;
import java.awt.event.KeyEvent;//serve para capturar eventos de teclado
import java.awt.event.KeyListener;//serve para capturar eventos de teclado

import javax.swing.JFrame;//cria uma janela

public class Janela extends JFrame implements KeyListener{
	private Desenho desenho;
	
	Janela(){
		desenho = new Desenho(1, Color.red);
		
		this.add(desenho);// Adiciona o painel de desenho à janela
		
		this.addKeyListener(this);// Adiciona o listener de teclado à janela	
		
		this.setVisible(true);
		this.setTitle("Desenhos...");
		this.setSize(300,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Stub de método gerado automaticamente
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP) // Verifica se a tecla pressionada é a seta para cima
			desenho.setForma(2);// Altera a forma para um triângulo
		else if(e.getKeyCode() == KeyEvent.VK_DOWN) // Verifica se a tecla pressionada é a seta para baixo
			desenho.setForma(1);// Altera a forma para um círculo

		if(e.getKeyCode() == KeyEvent.VK_RIGHT) // Verifica se a tecla pressionada é a seta para a direita
			desenho.setCor(Color.blue);
		else if(e.getKeyCode() == KeyEvent.VK_LEFT) 
			desenho.setCor(Color.red);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Stub de método gerado automaticamente
		
	}
}