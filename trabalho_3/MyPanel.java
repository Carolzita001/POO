import javax.swing.*;
import java.awt.*;
// Classe representando cada painel do grid
public class MyPanel extends JPanel {
    private ImageIcon icon; // Imagem do bloco atual
    private boolean isAvatar; // Indica se o avatar está neste painel 

    public MyPanel() {
        this.icon = BlocoTipo.FUNDO.getImagem(); // Inicializa com o fundo padrão
        this.isAvatar = false;
    }

    public void setIcon(BlocoTipo bloco) {
        this.icon = bloco.getImagem(); // Define o ícone do painel com base no tipo de bloco
        this.isAvatar = false;
        repaint(); // Repaint para atualizar a visualização
    }

    public void setAvatar(boolean isAvatar) { // Mostra ou esconde o avatar neste painel
        this.isAvatar = isAvatar;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) { // Desenha o bloco ou o avatar
        super.paintComponent(g);
        if (isAvatar) {
            g.drawImage(BlocoTipo.AVATAR.getImagem().getImage(), 0, 0, getWidth(), getHeight(), null);
        } else {
            g.drawImage(icon.getImage(), 0, 0, getWidth(), getHeight(), null);
        }
    }
}