package Turma_B;

public class ContaPoupanca extends Conta{
	//Contrutor sem parametro
	ContaPoupanca(){
		this(0);
	}
	//Construtor com paramentro
	ContaPoupanca(double saldo){
		super(saldo);
	}
	//Polimorfismo

	@Override
	public void reajusteSaldo() {
		double reajuste = getSaldo() * 0.1; 
		setSaldo(getSaldo() - reajuste);
	}
	
	@Override
	public String toString() {
		return "Conta Poupança, Saldo " + super.getSaldo();
	}
}
