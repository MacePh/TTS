package calculator;

public class Main {

	public static void main(String[] args) {
		
			Calculator calculator = new Calculator(11, 13);
			System.out.println(calculator.add());
			System.out.println(calculator.subtract());
			System.out.println(calculator.multiply());
			System.out.println(calculator.divide());
			System.out.println(calculator.square());
	}

}
