import java.util.ArrayList;
import java.util.Scanner;

public class MenuDrivenCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int option;
		System.out.println("Please enter a number: ");
		int num1 = scanner.nextInt();
		System.out.println("Please enter a mathematical operation. (+, -, *, /): ");
		String operation = scanner.next();
		System.out.println("Please enter another number: ");
		int num2 = scanner.nextInt();
			
			switch (operation) {
				case "+": {
					Add(num1, num2);
					break;
				}
				case "-": {
					Subtraction(num1, num2);
					break;
				}
				case "*": {
					Multiplication(num1, num2);
					break;
				}
				case "/": {
					Division(num1, num2);
					break;
				}
				default: {
					System.out.println("Invalid option!");
				}
			}
	}
	
	public static void Add(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("" + num1 + " + " + "" + num2 + " = " + sum );
	}
	
	public static void Subtraction(int num1, int num2) {
		int subtraction = num1 - num2;
		System.out.println(num1  + " - " + num2 + " = " + subtraction );
	}
	public static void Multiplication(int num1, int num2) {
		int multiplication = num1 * num2;
		System.out.println(num1 + " * " + num2 + " = " + multiplication );
	}
	
	public static void Division(int num1, int num2) {
		try {
			int division = num1 / num2;
			System.out.println(num1 + " / " + num2 + " = " + division);
		} catch (ArithmeticException e) {
			System.out.println("Error occured. Tried dividing by 0!");
		}
	}

}
