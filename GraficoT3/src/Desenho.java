import java.awt.Color;
import java.awt.Graphics;//serve para desenhar na tela


import javax.swing.JComponent;//serve para criar componentes gráficos

public class Desenho extends JComponent implements Runnable{
	private int forma;
	private Color cor;
	private int px = 5, py=5;// Posições iniciais do desenho
	private int dir = 1;// Direção do movimento: 1 para direita, 2 para esquerda
	
	public Desenho(int forma, Color cor) {
		this.forma = forma;
		this.cor = cor;
		new Thread(this).start();// Inicia uma nova thread para executar o método run
	}

	public void setForma(int forma) {
		this.forma = forma;
	}
	
	public Color getCor() {
		return cor;
	}

	public void setCor(Color cor) {
		this.cor = cor;
	}
	
	public void setPx(int px) {
		this.px = px;
	}

	public void setPy(int py) {
		this.py = py;
	}
	
	@Override
	public void paint(Graphics g) {
		g.setColor(cor);
		if(forma == 1)//verifica a forma selecionada
			g.fillRect(px, py, 20, 20);// Desenha um retângulo
		else if(forma == 2)
			g.fillOval(px, py, 20, 20);// Desenha um círculo
	}

	@Override
	public void run() {// Método que será executado na nova thread
		while(true) {// Loop infinito para atualizar a posição do desenho
			try {
				Thread.sleep(10);// Pausa a execução por 10 milissegundos para controlar a velocidade do movimento
				move();// Chama o método move para atualizar a posição do desenho
				repaint();// Repaint para atualizar a tela com a nova posição do desenho
			} catch (InterruptedException e) {// Trata a exceção caso a thread seja interrompida
				e.printStackTrace();// Imprime a pilha de chamadas para depuração
			}
		}
		
	}
	private void move() {// Método para mover o desenho
		if(px < 6)// Verifica se o desenho está próximo da borda esquerda
			dir = 1;// Se estiver, define a direção para direita
		else if(px > this.getWidth() -25)// Verifica se o desenho está próximo da borda direita
			dir = 2;// Se estiver, define a direção para esquerda
		
		if(dir == 1)// Verifica a direção do movimento
			px += 1;// Se for direita, incrementa a posição x
		else if(dir == 2)// Verifica a direção do movimento
			px -= 1;// Se for esquerda, decrementa a posição x
		
		}
}