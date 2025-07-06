package aviario;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Aviario a = new Aviario();

        a.adicionarAve(new Ave_voa("Pardal", "Marrom", "fêmea", "Voo", "Não silvestre"));
        a.adicionarAve(new Ave_voa("Arara", "Amarela", "Macho", "Voo e bico", "Silvestre"));
        a.adicionarAve(new Ave_n_voa("Avetruz", "Preto", "Fêmea", "Não", "Não"));
        a.adicionarAve(new Ave_n_voa("Galinha", "Carijo", "Fêmea", "Sim", "Sim"));

        a.listarAves();

        scanner.close();
    }
}

