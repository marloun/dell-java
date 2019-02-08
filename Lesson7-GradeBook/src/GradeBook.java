
/**
 * @author Marloun_Bayari
 * @Title - Lesson7-GradeBook
 * @Revision - Final
 *
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradeBook {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Creating the 2 hashmaps as per HW reqirement
		HashMap<String, String> studentGradesStore = new HashMap<String, String>();
		HashMap<String, Double> studentGradesAvg = new HashMap<String, Double>();

		
		Scanner reader = new Scanner(System.in); // Create Scanner to recieve User input for Name, and grades array.		
		
		int numStudents = getNumStudents(); // Prompt user for amount of students to enter
		
		for (int i = 0; i < numStudents; i++) {
			System.out.println("Enter student #" + i + "s, name");
			String name = reader.nextLine();
			
			System.out.println("Enter the Grades for Student: " + name);
			String grades = reader.nextLine();
			studentGradesStore.put(name,grades);
			
		}
		
		ArrayList<String> names = new ArrayList<String>(studentGradesStore.keySet());
		
		for(int i=0; i < names.size(); i++) {
			Double avgGrades = getGradesAverage(studentGradesStore.get(names.get(i)));
			String inName = names.get(i);
			studentGradesAvg.put(inName, avgGrades);		
		}
		
		ArrayList<String> studentNames = new ArrayList<String>(studentGradesAvg.keySet());
		
		System.out.println("Student 		| Grade Average");
		System.out.println("------------------------|-----------------------");
		
		// Output of values from studentGradesAvg HashMap
		for (int i=0; i < studentNames.size(); i++) {
			System.out.println(studentNames.get(i) + "			| " + studentGradesAvg.get(studentNames.get(i)));
			
		}
		
		

	}
	
	/**
	 * 
	 * @return - Number of students to size the HasMap
	 * Method to determine how many students to enter in data far.  Used in a loop
	 */

	public static int getNumStudents() {
		System.out.println("Enter the amount of students to enter grades");
		Scanner getNum = new Scanner(System.in);
		int inStudentNum = getNum.nextInt();
		return inStudentNum;
	}
	
	/**Method to take in a String, convert to Array, then parse the values of each value in array to a Double
	 * 
	 * @param inGrades
	 * @return - double value to be inserted to new Hashmap
	 * 
	 */
	public static Double getGradesAverage(String inGrades) {
		String[] numArray = inGrades.split(",");
		Double[] doubleArray = new Double[numArray.length];
		Double sum = 0.0;
		
		for (int i = 0; i<numArray.length; i++) {
			doubleArray[i] = Double.parseDouble(numArray[i]);
			sum = sum + Double.parseDouble(numArray[i]);
		}
		return sum/numArray.length;
		
	}


}
