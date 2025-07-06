import javax.swing.*;

public class Janela extends JFrame {
    janela(){
        this.add(new Desenho());
        this.setUndecorated();
        this.setSize(80,80);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
