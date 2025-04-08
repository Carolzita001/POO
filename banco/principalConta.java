package Turma_B;

public class principalConta {

	public static void main(String[] args) {
		Conta c = new Conta(500);
		System.out.println(c);
		
		c.deposito(100);
		System.out.println(c);
		
		c.saque(40);
		System.out.println(c);
		
		ContaPoupanca cp = new ContaPoupanca(c.getSaldo());
		
		cp.reajusteSaldo();
		System.out.println(cp);
		
		ContaCorrente cc = new ContaCorrente(c.getSaldo());
		System.out.println(cc);
	}
}
