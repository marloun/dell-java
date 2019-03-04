
public class Truck extends Vehicle{
	
	public int bedSize;

	public Truck(String licenseNumber, String make, String model, int price, int bedSize) {
		super(licenseNumber, make, model, price);
		this.bedSize = bedSize;
	}

	/**
	 * @return the bedSize
	 */
	public int getBedSize() {
		return bedSize;
	}

	/**
	 * @param bedSize the bedSize to set
	 */
	public void setBedSize(int bedSize) {
		this.bedSize = bedSize;
	}
	
	

}
