package br.com.project.euler.modelo;

public class AddNumbers {
	
	private int numberOne;
	private int numberTwo;
	private int result;
	private int sumNumberPar;
	
	public void setNumbers(int numberOne, int numberTwo) {
		this.numberOne = numberOne;
		this.numberTwo = numberTwo;
	}
	
	public void addNum() {
		for (int i = 0; i < 300; i++) {
			if (this.numberOne % 2 == 0) {
				System.out.println(this.numberOne);
				this.sumNumberPar += this.numberOne;
			} 
			if (this.numberTwo % 2 == 0) {
				System.out.println(this.numberTwo);
				this.sumNumberPar += this.numberTwo;
			}
			this.result = this.numberOne + this.numberTwo;
			if (this.result >= 4000000) {
				break;
			} else {
				if (this.result % 2 == 0) {
					System.out.println(this.getResult());
					this.sumNumberPar += this.result;
				}
				this.numberOne = this.numberTwo + this.result;
				this.numberTwo = this.result + this.numberOne;
			}
		}
		System.out.println(this.getSum());
	}
	
	public int getResult() {
		return this.result;
	}
	
	public int getSum() {
		return this.sumNumberPar;
	}

}
