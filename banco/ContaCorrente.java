package Turma_B;

public class ContaCorrente extends Conta{
	//Contrutor sem parametro
	ContaCorrente(){
		this(0);
	}
	//Contrutor com parametro
	ContaCorrente(double saldo){
		super(saldo);
	}
	@Override
	public void reajusteSaldo() {
		double reajuste = super.getSaldo() * 0.2;
		setSaldo(getSaldo() - reajuste);
		System.out.println("Tarifa ajustada");
	}
	
	
	@Override
	public String toString() {
		return "Conta Corrente, Saldo " + super.getSaldo();
	}
}
