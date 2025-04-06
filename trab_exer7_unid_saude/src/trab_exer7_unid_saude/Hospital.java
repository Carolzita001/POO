package trab_exer7_unid_saude;

public class Hospital extends UnidadeSaude{
	private int leitosUTI;
	
	public Hospital(String nome, String endereco, int capacidade, int leitosUTI) {
		super(nome, endereco, capacidade);
		this.leitosUTI = leitosUTI;
	}
	
	public void alocarLeitosUTI(int quantidade) {
		leitosUTI += quantidade;
		System.out.println(quantidade + "leitos de UTI alocados.");
	}
	
	@Override
	public void exibirInfo() {
		super.exibirInfo();
		System.out.println("Leitos de UTI: " + leitosUTI);
	}
}
