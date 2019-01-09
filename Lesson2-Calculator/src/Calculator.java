import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
	    System.out.println("Please type a number to the console.");

	    //input for 1st Number
		Scanner reader = new Scanner(System.in);
		int num1 = reader.nextInt();
		System.out.println("You typed: " + num1);

	    //Input for 2nd Number
	    System.out.println("Please type a second number to the console.");
		Scanner reader2 = new Scanner(System.in);
		int num2 = reader2.nextInt();
		System.out.println("You typed: " + num2);
		
		//Output results
		intSum(num1, num2);
		intDifference(num1, num2);
		intProduct(num1, num2);
		intQuotient(num1, num2);
		
		reader.close();
	}
	
	public static void intSum(int input, int input2) {
		int result = input + input2;
		System.out.println("The sum of " + input + " and " + input2 + " is " + result);
	}
	
	public static void intDifference(int input, int input2) {
		int result = input - input2;
		System.out.println("The Difference of " + input + " and " + input2 + " is " + result);
	}

	public static void intProduct(int input, int input2) {
		int result = input * input2;
		System.out.println("The Product of " + input + " and " + input2 + " is " + result);
	}

	public static void intQuotient(int input, int input2) {
		int result = input / input2;
		System.out.println("The Quotient of " + input + " and " + input2 + " is " + result);
	}	
	

}