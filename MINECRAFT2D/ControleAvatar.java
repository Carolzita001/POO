import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ControleAvatar extends KeyAdapter {
    private final MyPanel[] grid;
    private int posAv;

    public ControleAvatar(MyPanel[] grid) {
        this.grid = grid;
        this.posAv = 0;
        grid[posAv].setTipo(BlocoTipo.BLOCO1); // Inicializa com o avatar
    }

    @Override
    public void keyPressed(KeyEvent e) {
        grid[posAv].setTipo(BlocoTipo.FUNDO);

        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP -> posAv = (posAv - 20 + 400) % 400;
            case KeyEvent.VK_DOWN -> posAv = (posAv + 20) % 400;
            case KeyEvent.VK_LEFT -> posAv = (posAv - 1 + 400) % 400;
            case KeyEvent.VK_RIGHT -> posAv = (posAv + 1) % 400;
            case KeyEvent.VK_1 -> grid[posAv].setTipo(BlocoTipo.BLOCO1);
            case KeyEvent.VK_2 -> grid[posAv].setTipo(BlocoTipo.BLOCO2);
            case KeyEvent.VK_3 -> grid[posAv].setTipo(BlocoTipo.BLOCO3);
            case KeyEvent.VK_4 -> grid[posAv].setTipo(BlocoTipo.BLOCO4);
            case KeyEvent.VK_SPACE -> grid[posAv].setTipo(BlocoTipo.FUNDO);
        }

        grid[posAv].setTipo(BlocoTipo.BLOCO1);
    }
}