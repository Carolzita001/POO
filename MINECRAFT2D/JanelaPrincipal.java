import javax.swing.*;
import java.awt.*;

public class JanelaPrincipal extends JFrame {
    public JanelaPrincipal() {
        setTitle("MyCraft 2D");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(20, 20));

        MyPanel[] grid = new MyPanel[400];
        for (int i = 0; i < 400; i++) {
            grid[i] = new MyPanel(BlocoTipo.FUNDO);
            add(grid[i]);
        }

        ControleAvatar controle = new ControleAvatar(grid);
        addKeyListener(controle);
        setFocusable(true);
        setVisible(true);
    }
}