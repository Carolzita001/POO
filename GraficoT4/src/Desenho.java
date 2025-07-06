import java.awt.*;
import java.util.Random;

public class Desenho {
    private int x, y;
    private int diametro;
    private int dirX, dirY;
    private int passo;
    private Color cor;

    public Desenho(int larguraPainel, int alturaPainel) {
        diametro = 20 + (int)(Math.random() * 20);
        x = (int)(Math.random() * (larguraPainel - diametro)); //garante que a bolinha não comece fora da tela
        y = (int)(Math.random() * (alturaPainel - diametro));
        dirX = Math.random() < 0.5 ? 1 : 2;//Se o número aleatório for menor que 0.5 entao dirX = 1
        dirY = Math.random() < 0.5 ? 1 : 2;
        passo = 2 + (int)(Math.random() * 3); // Define a velocidade entre 2 e 4 
        cor = new Color((int)(Math.random() * 256),
                        (int)(Math.random() * 256),
                        (int)(Math.random() * 256));
    }


    public void mover(int larguraPainel, int alturaPainel) {
        // não passar na horizontal
        if (x <= 0)
            dirX = 1;
        else if (x >= larguraPainel - diametro)
            dirX = 2;

        // não passar na vertical
        if (y <= 0)
            dirY = 1;
        else if (y >= alturaPainel - diametro)
            dirY = 2;

        // Movimento conforme direção
        if (dirX == 1)
            x += passo;
        else
            x -= passo;

        if (dirY == 1)
            y += passo;
        else
            y -= passo;
    }
    public void desenhar(Graphics g) {
        g.setColor(cor);
        g.fillOval(x, y, diametro, diametro);
    }
}
