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
		System.out.println("Lot: " + this.name);
		for(Vehicle inVehicle : vlist) {
			System.out.println(inVehicle);
		}
	}

	

}
