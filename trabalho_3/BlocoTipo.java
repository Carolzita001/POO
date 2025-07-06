import javax.swing.*;
// Enum representando os tipos de blocos com imagens associadas
public enum BlocoTipo {
    FUNDO("imagens/fundo.png"),
    BLOCO1("imagens/terra.png"),
    BLOCO2("imagens/tijolo.png"),
    BLOCO3("imagens/grama_flor.png"),
    BLOCO4("imagens/grama.png"),
    AVATAR("imagens/avatar.png"); // Avatar como imagem

    private final String caminhoImagem;

    BlocoTipo(String caminhoImagem) {
        this.caminhoImagem = caminhoImagem;
    }

    public ImageIcon getImagem() {
        return new ImageIcon(caminhoImagem); // Carrega a imagem do caminho especificado
    }
}
