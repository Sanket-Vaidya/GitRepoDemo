package demo;

public class Calculator {
	public void add(int a, int b) {
		System.out.println(a + b);
	}
	
	public void subtract(int a, int b) {
		System.out.println(a - b);
	}
	
	public void multiply(int a, int b) {
		System.out.println(a * b);
	}
	
	public void divide(int a, int b) {
		System.out.println(a / b);
	}

	public static void main(String[] args) {
		Calculator newCalculator = new Calculator();
		newCalculator.add(5, 2);
		newCalculator.subtract(5, 2);
		newCalculator.multiply(5, 2);
		newCalculator.divide(5,2);
		System.out.println(5%2);
	}

}
