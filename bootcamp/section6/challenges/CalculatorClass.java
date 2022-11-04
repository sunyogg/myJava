package java.bootcamp.section6.challenges;

public class CalculatorClass {

	private double firstNumber = 0;
	private double secondNumber = 0;


	public void setFirstNumber(double num) {
		this.firstNumber = num;
	}

	public void setSecondNumber(double num) {
		this.secondNumber = num;
	}

	public double getFirstNumber() {
		return this.firstNumber;
	}

	public double getSecondNumber() {
		return this.secondNumber;
	}

	public double getAddition() {
		return this.firstNumber + this.secondNumber;
	}

	public double getSubtraction() {
		return this.firstNumber - this.secondNumber;
	}

	public double getMultiplication() {
		return this.firstNumber * this.secondNumber;
	}

	public double getDivision() {
		if (this.secondNumber != 0) {
			return this.firstNumber / this.secondNumber;
		} 
		else {
			return 0.0;
		}
	}

}