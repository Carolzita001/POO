import java.util.ArrayList;
import java.util.List;
public class Contador {
    private int valor = 0;
    private List<Observador> obseervadores = new ArrayList<>();

    public void adicionaObservador(Observador o){
        obseervadores.add(o);
    }

    public void incrementar(){
        valor++;
        notificarTodos();
    }
    private void notificarTodos(){
        for (Observador o: obseervadores){
            o.atualizar(valor);
        }
    }
}

