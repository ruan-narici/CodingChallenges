package br.com.project.euler.teste;

import br.com.project.euler.modelo.Logic;

public class ExecuteAction {
	
	public static void main(String[] args) {
		
		Logic number = new Logic();
		
		number.setNumber(600851475143L);
		number.primeNumber();
		System.out.println("Resultado: " + number.getResult());
	}

}
