// Classe controlando a posição do avatar no grid
class Avatar {
    private int px;
    private int py;

    public Avatar() { // Inicializa o avatar na posição (0, 0)
        this.px = 0;
        this.py = 0;
    }

    public int getPosLinha() {
        return px;
    }

    public int getPosColuna() {
        return py;
    }

    public void mover(int novaLinha, int novaColuna) { // Atualiza a posição do avatar
        this.px = novaLinha;
        this.py = novaColuna;
    }
}