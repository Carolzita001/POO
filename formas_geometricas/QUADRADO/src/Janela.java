import java.awt.event.*;
import javax.swing.*;

public class Janela extends JFrame implements ActionListener, MouseListener {

    private JPopupMenu popup;

    private JMenu menuForma;
    private JMenu menuCor;

    private JMenuItem menuForma1;
    private JMenuItem menuForma2;
    private JMenuItem menuForma3;

    private JMenuItem menuCor1;
    private JMenuItem menuCor2;
    private JMenuItem menuCor3;

    private Desenho desenho;

    private int tipoForma = 1;
    private int tipoCor = 1;

    Janela() {
        popup = new JPopupMenu();
        menuForma = new JMenu("Forma");
        menuCor = new JMenu("Cor");

        menuForma1 = new JMenuItem("Retângulo");
        menuForma2 = new JMenuItem("Círculo");
        menuForma3 = new JMenuItem("Triângulo");

        menuCor1 = new JMenuItem("Preto");
        menuCor2 = new JMenuItem("Vermelho");
        menuCor3 = new JMenuItem("Azul");

        menuForma.add(menuForma1);
        menuForma.add(menuForma2);
        menuForma.add(menuForma3);

        menuCor.add(menuCor1);
        menuCor.add(menuCor2);
        menuCor.add(menuCor3);

        popup.add(menuForma);
        popup.add(menuCor);

        this.addMouseListener(this);

        menuForma1.addActionListener(this);
        menuForma2.addActionListener(this);
        menuForma3.addActionListener(this);

        menuCor1.addActionListener(this);
        menuCor2.addActionListener(this);
        menuCor3.addActionListener(this);


        desenho = new Desenho(tipoForma, tipoCor);
        desenho.setPreferredSize(new java.awt.Dimension(300, 200));

        this.add(desenho);  // Adiciona Desenho à janela

        this.setTitle("Desenhando");
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src == menuForma1) {
            tipoForma = 1;
            desenho.setTipoForma(tipoForma);
        } else if (src == menuForma2) {
            tipoForma = 2;
            desenho.setTipoForma(tipoForma);
        } else if (src == menuForma3) {
            tipoForma = 3;
            desenho.setTipoForma(tipoForma);
        } else if (src == menuCor1) {
            tipoCor = 1;
            desenho.setTipoCor(tipoCor);
        } else if (src == menuCor2) {
            tipoCor = 2;
            desenho.setTipoCor(tipoCor);
        } else if (src == menuCor3) {
            tipoCor = 3;
            desenho.setTipoCor(tipoCor);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.isPopupTrigger() || SwingUtilities.isRightMouseButton(e)) {
            popup.show(this, e.getX(), e.getY());
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        mouseClicked(e);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        mouseClicked(e);
    }

    @Override
    public void mouseEntered(MouseEvent e) { }

    @Override
    public void mouseExited(MouseEvent e) { }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Janela());
    }
}