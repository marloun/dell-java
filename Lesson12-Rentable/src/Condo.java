/**
 * 
 */

/**
 * @author Marloun_Bayari
 *
 */
public class Condo implements Rentable {
	
	String name;
	int weeklyRate;
	
	public Condo (int weeklyRate) {
		this.weeklyRate = weeklyRate;			
	}
	
	public String getDescription() {
		return name;
	}

	public double getDailyRate();
	public double getPrice(double days);

}
