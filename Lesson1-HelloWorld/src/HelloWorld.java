import java.util.*;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hola="Hello World!";
		System.out.println("Enter tu nombre, mi amigo!");
		Scanner nombre = new Scanner(System.in);
		String input = nombre.nextLine();
		
		System.out.println(hola);
		System.out.println("Hello there..." + input);

	}

}
