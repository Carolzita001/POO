package Grafico_turmaB;

import javax.swing.JComponent;

public class Desenho extends JComponent{
	private int TipoForma;
	private int tipoCor;
	
	public Desenho(int tipoForma, int tipoCor) {
		this.TipoForma = tipoForma;
		this.tipoCor = tipoCor;
	}

	public int getTipoForma() {
		return TipoForma;
	}

	public void setTipoForma(int tipoForma) {
		TipoForma = tipoForma;
	}

	public int getTipoCor() {
		return tipoCor;
	}

	public void setTipoCor(int tipoCor) {
		this.tipoCor = tipoCor;
	}
	
	@Override
	public void paint(Graphics g) {
		switch(this.tipoCor) {
		case 1:
			g.setColor(Color.black);
			break;
		case 2:
			g.setColor(Color.red);
			break;
		case 3:
			g.setColor(Color.blue);
			break;
		default:
			break;
		}
		
	switch (this.TipoForma) {
	case 1:
		g.fillRact(10, 10, 30, 30);
		break;
	case 2:
		g.fillOval(10, 10, 30)
	}
	}
}
