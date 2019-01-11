import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class Statistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println();
		Scanner reader = new Scanner(System.in);
		String setofNum = reader.nextLine();
		reader.close();
		
		//validation
		//System.out.println(setofNum);
		
		int minnum = 0;
		int maxnum = 0;
		String[] numArray = setofNum.split(",");
		Integer[] intArray = new Integer[numArray.length];
		for (int i = 0; i < numArray.length; i++ ) {
			Integer num = Integer.parseInt(numArray[i]);
			intArray[i] = num;
			//System.out.println(intArray[i]);
			
			//Get Mininum Number
			if (intArray[i] < minnum) {
				minnum = intArray[i];
			};
			
			//Get Maximum Number
			if (intArray[i] > maxnum) {
				maxnum = intArray[i];
			};
		};
		System.out.println("Minimum Number = " + minnum);
		System.out.println("Minimum Number = " + maxnum);
		System.out.println("Number of Elements = " + intArray.length);
		

		
	}
	public static void minNumber() {};
	public static void maxNumber() {};
	public static void numOfElements (int[] inArray) {
		int arrayLen = inArray.length;
		System.out.println("There are " + arrayLen + " elements in the array.");
	};
	public static void avgArray() {};
	public static void sumArray() {};
	
	
		

}
