/**
 * @author Marloun_Bayari
 * @ProjectName Lesson6-Statistics
 * @DateSubmitted 02/06/2019
 */

import java.util.Scanner;

public class Statistics {

	public static void main(String[] args) {
		
		System.out.println("Enter in an array of number, delimited by comma(,).");
		System.out.println();
		Scanner reader = new Scanner(System.in);
		String setofNum = reader.nextLine();
		reader.close();
		
		String[] numArray = setofNum.split(","); // Convert a String to string array, delimited by commas
		Integer[] intArray = new Integer[numArray.length]; // Create an integer Array
		
		/**
		 * the following methods were called directly in the following sysout
		 * minNumber(String[] inNumArray, Integer[] inIntArray)
		 * maxNumber(String[] inNumArray, Integer[] inIntArray)
		 * numOfElements (Integer[] inArray)
		 * avgArray(Integer[] inArray)
		 * umArray(Integer[] inArray)
		 * 
		 * Instead of doing a sysout in each individual method, I chose to return the value back to main... for practice
		 * 
		 */
		
		System.out.println("Min Number in Array: " + minNumber(numArray, intArray)); 
		System.out.println("Max Number in Array: " + maxNumber(numArray, intArray));
		System.out.println("Number of Element in Array: " + numOfElements(intArray));
		System.out.println("Sum of Array: " + sumArray(intArray)); ;
		System.out.println("Average of Array: " + avgArray(intArray));		
	}
	
	// Methods

	// Determine mininum number
	public static int minNumber(String[] inNumArray, Integer[] inIntArray) {
		int minnum = Integer.parseInt(inNumArray[0]);
		for (int i = 0; i < inNumArray.length; i++ ) {
			Integer num = Integer.parseInt(inNumArray[i]);
			inIntArray[i] = num;
			
			if (inIntArray[i] < minnum) {
				minnum = inIntArray[i];
			}
		}
		return minnum;		
	}
	
	// Determine Maximum number
	public static int maxNumber(String[] inNumArray, Integer[] inIntArray) {
		int maxnum = Integer.parseInt(inNumArray[0]);
		for (int i = 0; i < inNumArray.length; i++ ) {
			Integer num = Integer.parseInt(inNumArray[i]);
			inIntArray[i] = num;
			
			if (inIntArray[i] > maxnum) {
				maxnum = inIntArray[i];
			}
		}
		return maxnum;		
	}
	
	// Determine the number of elements in array
	public static int numOfElements (Integer[] inArray) {
		int arrayLen = inArray.length;

		return arrayLen;
	};
	
	// Determine average number of elements in Array, calling on elements that determine sumArray & numOfElements
	public static float avgArray(Integer[] inArray) {
		
		// Scenario 1: for Ease of understanding I declared variable to the return from the methods
		float sum = sumArray(inArray); //Used sumArray Method, as the function of the average is to divide the sum of the total number in array, to amount of elements in array
		int elements = numOfElements(inArray);
		float average = sum/elements;
		
		// Scenario 1: Consolidated Scenario 1 into 1 line for efficiency. Though it does make it harder to read.
		float average2 = (float)sumArray(inArray)/numOfElements(inArray);	
		
		// Test both, and returned same valuess.  Decided to stick with Scenario 1 for logical understanding.
		return average;
	}
	
	// Determine the sum of the sum of all elements in array
	
	public static int sumArray(Integer[] inArray) {
		int i = 0;
		int sum = 0;
		while (i < inArray.length) {
			sum = sum + inArray[i];
			i++;
		}
		
		//System.out.println("Sum of Array: " + sum);
		return sum;
		
	};
	
}
