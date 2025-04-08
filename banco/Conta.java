package Turma_B;

public class Conta {
	//Atributo
	private double saldo;
	
	//Construtor sem parametro
	Conta(){
		this(0);	
	}
	//Contrutor com parametro
	Conta(double saldo){
		this.saldo = saldo;
	}
	
	//Métodos
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getSaldo() {
		return saldo;
	}
	//Polimorfismo
	public void reajusteSaldo() {
		System.out.println("reajuste");
	}
	
	public void saque(double saque) {
		if(saldo > saque) {
			saldo -= saque;
		}else {
			System.out.println("valor do saque é superior ao saldo");
		}
	}
	
	public void deposito(double deposito) {
		saldo += deposito;
	}
	
	@Override
	public String toString() {
		return "Conta, Saldo: " + saldo;
	}
}
