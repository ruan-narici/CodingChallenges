package br.com.project.euler.modelo;

public class Multiples extends Numbers{
	
	public void Multiply(int times) {
		
		int result = 0;
		for (int i = 0; i < times; i++) {
			if (i % super.getNumberOne() == 0 
					|| i % super.getNumberTwo() == 0) {
				result += i;
			}
		}
		super.setSumNumbers(result);
	}
	

}
