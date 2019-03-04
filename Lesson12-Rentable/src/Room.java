/**
 * 
 */

/**
 * @author Marloun_Bayari
 *
 */
public class Room implements Rentable{
	
	double dailyRate;
	String name;
	
	//Constructor
	public Room (String name, double dailyRate) {
		
		this.name = name;
		this.dailyRate = dailyRate;
		
	}
	
	

	public double getDailyRate() {
		return dailyRate;
	}

	public String getDescription() {
		return name;
	}
	
	public double getprice(double days) {
		return dailyRate*days;
	}

	
	

}
