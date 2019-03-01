import java.util.*;

public class CarLot {
	private String name;
	private List<Vehicle> vlist = new ArrayList<Vehicle>();
	
	
	//Constructor
	public CarLot (String name) {
		this.name = name;
	}
	
	
	
	
	//Getters and Setters
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the vlist
	 */
	public List<Vehicle> getVlist() {
		return vlist;
	}
	/**
	 * @param vlist the vlist to set
	 */
	public void setVlist(List<Vehicle> vlist) {
		this.vlist = vlist;
	}
	
	//Methods
	//Add Vehicle
	public void addVehicle(Vehicle inVehicle) {
		this.vlist.add(inVehicle);
	}
	
	//Print inventory
	public void printvlist() {
		
		for (int i=0; i<vlist.size(); i++) {

			System.out.println("Make: " + vlist.get(i).getMake());
			System.out.println("Model: "+ vlist.get(i).getModel());
			System.out.println("Price: $" + vlist.get(i).getPrice());
			System.out.println("License: " + vlist.get(i).getLicenseNumber());
			System.out.println("");
			
		}
		
	}

	

}
