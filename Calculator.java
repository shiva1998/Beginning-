// Shiva Rithwick Anem
// This program will let you multiply, divide,
// add and subtract 2 number.

import java.util.*;

public class Calculator {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your first number: ");
		double firstNumber = input.nextDouble();
		System.out.print("Enter yout second number: ");
		double secondNumber = input.nextDouble();
		System.out.print("Would you like to multiple, divide, add or subtract these numbers? ");
		String operation = input.next();
		
		if (operation.charAt(0) == 'm' || operation.charAt(0) == 'M') {
			multiply(firstNumber, secondNumber);
		} else if (operation.charAt(0) == 'd' || operation.charAt(0) == 'D') {
			divide(firstNumber, secondNumber);
		} else if (operation.charAt(0) == 's' || operation.charAt(0) == 'S') {
			subtract(firstNumber, secondNumber);
		} else if (operation.charAt(0) == 'a' || operation.charAt(0) == 'A') {
			add(firstNumber, secondNumber);
		}
	}
	
	// Calculates and displays the multiplication of two numbers
	public static void multiply(double firstNumber, double secondNumber) {
		double ans = firstNumber * secondNumber;
		System.out.println("Your Answer is: " + ans);	 
	}
	
	// Calculates and displays the division of two numbers
	public static void divide(double firstNumber, double secondNumber) {
		double ans = firstNumber / secondNumber;
		System.out.println("Your Answer is: " + ans);
	}
	
	// Calculates and displays the sum of two numbers
	public static void add(double firstNumber, double secondNumber) {
		double ans = firstNumber + secondNumber;
		System.out.println("Your Answer is: " + ans);
	}
	
	// Calculates and displays the subtraction of two numbers
	public static void subtract(double firstNumber, double secondNumber) {
		double ans = firstNumber - secondNumber;
		System.out.println("Your Answer is: " + ans);
	}
}
