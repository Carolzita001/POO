package aviario;
import java.util.List;
import java.util.ArrayList;

public class Aviario {
    private List<Ave> aves;

    //Método pra inicializar a lista de aves ao aviario
    public Aviario(){
        this.aves = new ArrayList<>();
    }

    //Método pra adicionar aves a lista
    public void adicionarAve(Ave ave){
        aves.add(ave);
    }

    //Método para listar todos os veículos
    public void listarAves(){
        for(Ave a : aves){
            System.out.println(a.toString());
            System.out.println("------------------------------");
        }
    }
}

