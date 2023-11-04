package br.com.project.euler.teste;

import br.com.project.euler.modelo.*;

public class ExecuteAdds {

	public static void main(String[] args) {
		
		long startTime = System.nanoTime();
		
		AddNumbers add = new AddNumbers();
		add.setNumbers(1,2);
		add.addNum();
		
		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
		
		System.out.println("Resultado: " + add.getSum());
		System.out.println();
		System.out.println("nanoseconds: " + timeElapsed);
	}
}
