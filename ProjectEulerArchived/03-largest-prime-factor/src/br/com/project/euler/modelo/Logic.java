package br.com.project.euler.modelo;

public class Logic extends Number{

	public void primeNumber() {
		for (long i = 2; i <= super.getNumber(); i++) {
			if (super.getNumber() % i == 0) {
				System.out.println(i);
				super.setResult(i);
				super.setNumber(super.getNumber() / i);
			} 
		}
	}
}
