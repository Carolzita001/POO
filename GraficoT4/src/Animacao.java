import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Animacao extends JComponent implements Runnable {
    private ArrayList<Desenho> desenhos;
    private int NUM_DESENHOS = 10;

    public Animacao() {
        desenhos = new ArrayList<>();
        for (int i = 0; i < NUM_DESENHOS; i++) {
            desenhos.add(new Desenho(500, 400));
        }
        new Thread(this).start();
    }

    @Override
    public void paint(Graphics g) {
        for (Desenho d : desenhos) {
            d.desenhar(g);
        }
    }
    

    @Override
    public void run() {
        while (true) {
            int w = getWidth();
            int h = getHeight();
            for (Desenho d : desenhos) {
                d.mover(w, h);
            }
            
            repaint();
            try {
                Thread.sleep(16);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
