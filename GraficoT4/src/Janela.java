import java.awt.Color;

import javax.swing.*;

public class Janela extends JFrame {
    public Janela() {
    	this.setTitle("Animação");
        this.setSize(500, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.add(new Animacao());
        this.setVisible(true);
        this.getContentPane().setBackground(Color.BLACK);
    }
}
