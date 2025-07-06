import java.util.ArrayList;
import java.util.List;

public class Cliente {
    List<Cadastro> clientes = new ArrayList<Cadastro>();

    public void inserirCliente(String nome) {
        Cadastro c = new Cadastro(nome);
        clientes.add(c);
    }

    public static void main(String args[]) {
		/*Cadastro c1 = new Cadastro("Mário");
		Cadastro c2 = new Cadastro("João");
		Cadastro c3 = new Cadastro("Muleer");

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);*/

        new Interface();
    }

}
