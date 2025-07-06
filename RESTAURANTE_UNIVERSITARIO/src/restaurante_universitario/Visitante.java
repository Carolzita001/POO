package restaurante_universitario;

public class Visitante extends Pessoa {
	//Contrutor
	public Visitante (String nome) {
		super(nome);
	}
	
	//Método pagarRfeição
	@Override
	public void pagarRefeicao() {
		System.out.println(getNome() + "pagou o valor integral da refeição como visitante.");
	}
}
