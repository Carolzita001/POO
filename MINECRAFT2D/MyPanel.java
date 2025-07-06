import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    private ImageIcon icon;

    public MyPanel(BlocoTipo tipo) {
        setTipo(tipo);
    }

    public void setTipo(BlocoTipo tipo) {
        this.icon = new ImageIcon("imgs/" + tipo.getImagePath());
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (icon != null) {
            g.drawImage(icon.getImage(), 0, 0, getWidth(), getHeight(), null);
        }
    }
}