
/**
 * @author Marloun_Bayari
 *
 */

import java.time.*;

public class DriversLicenseProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		DriversLicense dl1 = new DriversLicense();
		DriversLicense dl2 = new DriversLicense();
		DriversLicense dl3 = new DriversLicense();
		
		/**
		 * Setting Static information to Classes
		 * parameters to set
		 * public String firstName;
		 * public String lastName;
		 * public String DOB;
		 * public int height;
		 * public String gender;
		 */
		
		//Driver 1
		dl1.setFirstName("Marloun");
		dl1.setLastName("Bayari");
		dl1.setGender("Male");
		dl1.setHeight(70);
		dl1.setMM(04);
		dl1.setDD(15);
		dl1.setYYYY(1973);
		
		//Driver 2
		dl2.setFirstName("Lewis");
		dl2.setLastName("Hamilton");
		dl2.setGender("Male");
		dl2.setHeight(68);
		dl2.setMM(01);
		dl2.setDD(7);
		dl2.setYYYY(1985);
		
		//Driver 3
		dl3.setFirstName("Danica");
		dl3.setLastName("Patrick");
		dl3.setGender("Female");
		dl3.setHeight(62);
		dl3.setMM(03);
		dl3.setDD(25);
		dl3.setYYYY(1982);
		
		//Printout Driver 1
		System.out.println("Drivers Name: " + dl1.getFullName());
		System.out.println("Drivers Height: " + dl1.getHeight() + '"');
		System.out.println("Drivers Biological Gender: " + dl1.getGender());
		System.out.println(dl1.getAge());
		System.out.println();
		
		//Printout Driver 1
		System.out.println("Drivers Name: " + dl2.getFullName());
		System.out.println("Drivers Height: " + dl2.getHeight() + '"');
		System.out.println("Drivers Biological Gender: " + dl2.getGender());
		System.out.println(dl2.getAge());
		System.out.println();
				
		//Printout Driver 1
		System.out.println("Drivers Name: " + dl3.getFullName());
		System.out.println("Drivers Height: " + dl3.getHeight() + '"');
		System.out.println("Drivers Biological Gender: " + dl3.getGender());	
		System.out.println(dl2.getAge());
		System.out.println();
		
		

		
		}
}