import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Classe principal
public class MyCraft2D extends JFrame implements KeyListener {
    private static final int GRID_SIZE = 20;
    private MyPanel[][] grid; // Matriz de painéis representando o mundo
    private Avatar avatar;

    public MyCraft2D() { // Inicializa a janela e a grade
        super("MyCraft 2D");

        avatar = new Avatar();
        grid = new MyPanel[GRID_SIZE][GRID_SIZE];
        setLayout(new GridLayout(GRID_SIZE, GRID_SIZE));//Define um layout em tabela com linhas e colunas

        // Inicializar a grade
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                grid[i][j] = new MyPanel();
                add(grid[i][j]);
            }
        }

        // Colocar o avatar na posição inicial
        atualizarAvatar();

        // Configurações da janela
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        addKeyListener(this);
    }

    private void atualizarAvatar() { // Atualiza visualmente a posição do avatar na grade
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                grid[i][j].setAvatar(false);
            }
        }
        grid[avatar.getPosLinha()][avatar.getPosColuna()].setAvatar(true); // Define o painel do avatar como verdadeiro
    }

    private void moverAvatar(int novaLinha, int novaColuna) { // Move o avatar se a posição for válida
        if (novaLinha >= 0 && novaLinha < GRID_SIZE && novaColuna >= 0 && novaColuna < GRID_SIZE) {
            avatar.mover(novaLinha, novaColuna);
            atualizarAvatar();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) { // Controlam movimento do avatar e troca de blocos com o teclado.
        int key = e.getKeyCode();
        int linhaAtual = avatar.getPosLinha();
        int colunaAtual = avatar.getPosColuna();

        switch (key) {
            case KeyEvent.VK_UP -> moverAvatar(linhaAtual - 1, colunaAtual);
            case KeyEvent.VK_DOWN -> moverAvatar(linhaAtual + 1, colunaAtual);
            case KeyEvent.VK_LEFT -> moverAvatar(linhaAtual, colunaAtual - 1);
            case KeyEvent.VK_RIGHT -> moverAvatar(linhaAtual, colunaAtual + 1);
            case KeyEvent.VK_1 -> grid[linhaAtual][colunaAtual].setIcon(BlocoTipo.BLOCO1);
            case KeyEvent.VK_2 -> grid[linhaAtual][colunaAtual].setIcon(BlocoTipo.BLOCO2);
            case KeyEvent.VK_3 -> grid[linhaAtual][colunaAtual].setIcon(BlocoTipo.BLOCO3);
            case KeyEvent.VK_4 -> grid[linhaAtual][colunaAtual].setIcon(BlocoTipo.BLOCO4);
            case KeyEvent.VK_SPACE -> grid[linhaAtual][colunaAtual].setIcon(BlocoTipo.FUNDO); // Adiciona fundo ao bloco
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MyCraft2D::new); // Cria uma instância da classe MyCraft2D na thread de eventos do Swing
    }
}
