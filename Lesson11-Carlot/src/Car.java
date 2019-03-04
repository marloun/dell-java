
public class Car extends Vehicle{
	
	public String type;
	public int numOfDoors;

	
	// Constructors
	public Car(String licenseNumber, String make, String model, int price, String type, int numOfDoors ) {		
		super(licenseNumber, make, model, price);
		this.type = type;
		this.numOfDoors = numOfDoors;
		
	}
	
	//Getters and Setters
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNumOfDoors() {
		return numOfDoors;
	}

	public void setNumOfDoors(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}
	
	
	
	

}
