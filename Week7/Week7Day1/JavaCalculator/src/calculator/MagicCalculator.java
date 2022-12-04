package calculator;

public abstract class MagicCalculator extends Calculator {

//	constructor
	public MagicCalculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
//	methods
	public int add() {
		return this.num1 + this.num2;
	}
	
	public int subtract() {
		return this.num1 - this.num2;
	}
	
	public int multiply() {
		return this.num1 * this.num2;
	}
	
	public int divide() {
		return this.num1 / this.num2;
	}
	
	public int square() {
		return this.num1 * this.num1;
}
