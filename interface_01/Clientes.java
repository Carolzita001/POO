import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Clientes {
	static List<Cadastro> clientes = new ArrayList<Cadastro>();

	static void inserirClientes(String nome) {
		Cadastro c = new Cadastro(nome);
		clientes.add(c);
	}

	public static void main(String[] args) {
		Cadastro c1 = new Cadastro("Walter");
		Cadastro c2 = new Cadastro("Pedro");
		Cadastro c3 = new Cadastro("José");
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		new Interface();
		/*
		if(!c1.equals(c3))
			System.out.println("Diferentes");
		
		Cadastro[] c = new Cadastro[10];
		for(int i = 0; i < c.length; i++)
			c[i] = new Cadastro("Amigo"+i);
		
		Cadastro c4 = new Cadastro("Matheus", c);
		System.out.println(c4);
	*/
	}

}
