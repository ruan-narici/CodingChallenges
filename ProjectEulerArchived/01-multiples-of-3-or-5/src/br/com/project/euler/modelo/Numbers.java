package br.com.project.euler.modelo;

public class Numbers {

	private int numberOne;
	private int numberTwo;
	private int resultAll;
	
	public void setNumberOne(int number) {
		this.numberOne = number;
	}
	
	public void setNumberTwo(int number) {
		this.numberTwo = number;
	}
	
	public int getNumberOne() {
		return this.numberOne;
	}
	
	public int getNumberTwo() {
		return this.numberTwo;
	}
	
	public void setSumNumbers(int number) {
		this.resultAll = number;
	}
	
	public int getSumNumbers() {
		return this.resultAll;
	}
}
