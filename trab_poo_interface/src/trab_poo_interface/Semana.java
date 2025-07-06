import java.util.Scanner;

class Semana {
    Scanner scan = new Scanner(System.in);

    //Objeto "Cardápio" para cada dia da semana
    private Cardápio segunda;
    private Cardápio terca;
    private Cardápio quarta;
    private Cardápio quinta;
    private Cardápio sexta;

    //Construtuor "Semana", inicia um novo cardápio para cada dia da semana
    public Semana() {
        segunda = new Cardápio();
        terca = new Cardápio();
        quarta = new Cardápio();
        quinta = new Cardápio();
        sexta = new Cardápio();
    }

    //Construtor "obterCardapio", retorna um dia da semana (1,5)
    public Cardápio obterCardapio(int dia) {
        switch (dia) {
            case 1: return segunda;
            case 2: return terca;
            case 3: return quarta;
            case 4: return quinta;
            case 5: return sexta;
            default: return null;
        }
    }

    //Metódos Getter e Setter
    public Cardápio getSegunda() {
        return segunda;
    }
    public void setSegunda(Cardápio segunda) {
        this.segunda = segunda;
    }

    public Cardápio getTerca() {
        return terca;
    }
    public void setTerca(Cardápio terca) {
        this.terca = terca;
    }

    public Cardápio getQuarta() {
        return quarta;
    }
    public void setQuarta(Cardápio quarta) {
        this.quarta = quarta;
    }

    public Cardápio getQuinta() {
        return quinta;
    }
    public void setQuinta(Cardápio quinta) {
        this.quinta = quinta;
    }

    public Cardápio getSexta() {
        return sexta;
    }
    public void setSexta(Cardápio sexta) {
        this.sexta = sexta;
    }


}
