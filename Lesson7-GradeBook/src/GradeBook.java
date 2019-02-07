/**
 * 
 */

/**
 * @author Marloun_Bayari
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
		
		ArrayList<String> names = new ArrayList(studentGradesStore.keySet());
		
		for(int i=0; i < names.size(); i++) {
			Double avgGrades = getGradesAverage(studentGradesStore.get(names.get(i)));
			String inName = names.get(i);
			studentGradesAvg.put(inName, avgGrades);		
		}
		
		ArrayList<String> studentNames = new ArrayList(studentGradesAvg.keySet());
		
		System.out.println("Student 	| Grade Average");
		System.out.println("----------------|----------------");
		
		for (int i=0; i < studentNames.size(); i++) {
			System.out.println(studentNames.get(i) + "		| " + studentGradesAvg.get(studentNames.get(i)));
			
		}
		
		

	}
	
	public static int getNumStudents() {
		System.out.println("Enter the amount of students to enter grades");
		Scanner getNum = new Scanner(System.in);
		int inStudentNum = getNum.nextInt();
		return inStudentNum;
	}
	
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
