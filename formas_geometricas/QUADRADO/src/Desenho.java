import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class Desenho extends JComponent {

    private int tipoForma;
    private int tipoCor;

    public Desenho(int tipoForma, int tipoCor) {
        this.tipoForma = tipoForma;
        this.tipoCor = tipoCor;
    }

    public int getTipoForma() {
        return tipoForma;
    }

    public int getTipoCor() {
        return tipoCor;
    }

    public void setTipoForma(int tipoForma) {
        this.tipoForma = tipoForma;
        repaint();
    }

    public void setTipoCor(int tipoCor) {
        this.tipoCor = tipoCor;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Definindo a cor
        switch (tipoCor) {
            case 1:
                g.setColor(Color.BLACK);
                break;
            case 2:
                g.setColor(Color.RED);
                break;
            case 3:
                g.setColor(Color.BLUE);
                break;
            default:
                g.setColor(Color.BLACK);
                break;
        }

        int largura = getWidth();
        int altura = getHeight();

        // Desenhando conforme o tipo de forma
        switch (tipoForma) {
            case 1: // Retângulo
                g.fillRect(largura / 4, altura / 4, largura / 2, altura / 2);
                break;
            case 2: // Círculo
                g.fillOval(largura / 4, altura / 4, largura / 2, altura / 2);
                break;
            case 3: // Triângulo
                int[] xPoints = { largura / 2, largura / 4, 3 * largura / 4 };
                int[] yPoints = { altura / 4, 3 * altura / 4, 3 * altura / 4 };
                g.fillPolygon(xPoints, yPoints, 3);
                break;
            default:

                break;
        }
    }
}