package carro_ok;

public class carro {
	public static void main(String args[]) {
		obj1_carro c1 = new obj1_carro();
		obj1_carro c2 = new obj1_carro(2024,"preto","fusca");
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}
