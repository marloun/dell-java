import java.time.*;

public class DriversLicense {
	
	//Attributes
	public String firstName;
	public String lastName;
	public int height;  // in inches
	public String gender;
	
	public int MM;
	public int YYYY;
	public int DD;
	
	//Constructors
	public DriversLicense() {
		
	}
	
	// Getters and Setters
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	//Method to concatenate firstname and last name to a full name
	
	public String getFullName() {
		return firstName + " " + lastName;
	}
	

	/**
	 * @return the mM
	 */
	public int getMM() {
		return MM;
	}
	/**
	 * @param mM the mM to set
	 */
	public void setMM(int mM) {
		MM = mM;
	}
	/**
	 * @return the yYYY
	 */
	public int getYYYY() {
		return YYYY;
	}
	/**
	 * @param yYYY the yYYY to set
	 */
	public void setYYYY(int yYYY) {
		YYYY = yYYY;
	}
	/**
	 * @return the dD
	 */
	public int getDD() {
		return DD;
	}
	/**
	 * @param dD the dD to set
	 */
	public void setDD(int dD) {
		DD = dD;
	}
	
	
	/**Return Age
	 * 
	 * @return Age based on input provided by user, and
	 * using Java Time Package to determine age from Date of Birthday, and today's date.
	 */
	public int getAge() {

		LocalDate today = LocalDate.now(); // today's date
		LocalDate birthday = LocalDate.of(YYYY, MM, DD); // date of birth

		Period period = Period.between(birthday, today);

		int age = period.getYears(); // calculate the period between DOB and today in years
		return age;
	}
	
}
