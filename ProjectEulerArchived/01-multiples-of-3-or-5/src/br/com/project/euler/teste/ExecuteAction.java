package br.com.project.euler.teste;

import br.com.project.euler.modelo.*;

public class ExecuteAction {

	public static void main(String[] args) {
		
		Multiples n = new Multiples();
		
		n.setNumberOne(3);
		n.setNumberTwo(5);
		n.Multiply(1000);
		System.out.println("Resultado: " + n.getSumNumbers());
	}
}
