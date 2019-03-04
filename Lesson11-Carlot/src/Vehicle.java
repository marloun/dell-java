
public abstract class Vehicle {
	private String licenseNumber;
	private String make;
	private String model;
	private int price;
	
	// Constructor
	
	public Vehicle (String licenseNumber, String make, String model, int price) {
		this.licenseNumber = licenseNumber;
		this.make = make;
		this.model = model;
		this.price = price;
	}
	
	
	// Getters & Setters

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}	

	
	public void printDescription() {
		System.out.println("Make:" + make);
		System.out.println("Model: "  + model);
		System.out.println("License Number: " + licenseNumber);
		System.out.println("Price: " + price);
		
	}

}
