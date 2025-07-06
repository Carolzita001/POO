import java.awt.*;
import java.awt.Graphics;
import javax.swing.*;

public class Desenho extends JComponent implements Runnable{
    private int forma;
    private Color cor:
    private int px = 5, py = 5;
    private int dir;

    Desenho(int forma, Color cor){
        this.forma = forma;
        this.cor = cor;
        //new Thread(this).start();
    }

    public int getForma() {
        return forma;
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

    public int getPy() {
        return py;
    }

    public void setPy(int py) {
        this.py = py;
    }

    public int getPx() {
        return px;
    }

    public void setPx(int px) {
        this.px = px;
    }

    public int getDir() {
        return dir;
    }

    public void setDir(int dir) {
        this.dir = dir;
    }

    public void print(Graphics g){
        g.setColor(cor);
        if(forma == 1)
            g.fillRact(px, py, 20, 20);
            else if(forma == 2)
                g.fillOval(px, py, 20, 20);
    }

    @Override
    public void run() {
        white(true){
            try{
                Thread.sleep(1);
                move();
                repaint();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    private void move(){
        if(px < 6)
            dir = 1;
        else if(px > this.getwigth() - 35)
            dir = 2;

        if(dir == 1)
            px +=1;
        else if (dir == 2)
        px -=1;

        }
    }
}
