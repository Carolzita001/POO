
public enum BlocoTipo {
    FUNDO("fundo.jpg"),
    BLOCO1("terra.jpg"),
    BLOCO2("grama.png"),
    BLOCO3("pedra.png"),
    BLOCO4("madeira.jpg");

    private final String imagePath;

    BlocoTipo(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getImagePath() {
        return imagePath;
    }
}

