import javax.swing.*;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import  javax.swing.JFrame;

public class Janela extends JFrame implements KeyListener {
    private Desenho desenho;

    Janela(){
        desenho = new Desenho (1, Color.green);
        this.add(desenho);

        this.addKeyListener(this);

        this.setVisible(true);
        this.setTitle("Desenhos");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(300, 300);
    }
    @Override
    public void keyPressed(KeyEvent e){
        if()
    }
}
