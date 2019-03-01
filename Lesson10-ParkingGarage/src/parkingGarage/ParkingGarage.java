/**
 * 
 */
package parkingGarage;

/**
 * @author Marloun_Bayari
 *
 */
public class ParkingGarage {
	
	public Car[] parkingSlot;
	public int capacity;
	
	public ParkingGarage(int capacity) {
		this.capacity = capacity;
		this.parkingSlot = new Car[capacity];
		
	}
	
	// Check if spot is in array, then throws exception if not.
	void validSpotCheck(int spot) {
		if (spot<0 || spot>capacity) {
			throw new IllegalArgumentException();
		} return;
	}
	
	void park(Car car, int spot) {
		try {
		validSpotCheck(spot);
		if(parkingSlot[spot]==null) {
			parkingSlot[spot]=car;
			return;
		}
		else {
			System.out.println("There is already another car in slot." + spot);
			return;
		}
		
		}catch(Exception e) {
			System.out.println("This spot is invalid");
		}
		
	}
	
	void vacate (int spot) {
		try {
		validSpotCheck(spot);
		if(parkingSlot[spot]==null) {
			System.out.println("There is no car to vacate");
			return;	
		}
		else {
			parkingSlot[spot]=null;
		}
		}catch (Exception e) {
			System.out.println("This spot is invalid");
			
		}
	}
	
	void printInventory() {
		System.out.println("Garage Inventory: ");
		for (int i=0; i<parkingSlot.length; i++) {
			if (parkingSlot[i]==null) {
				System.out.println("Parking Slot " + i + " is free");
				}
			else {
				System.out.println("Slot " + i + "  " + parkingSlot[i].getMake() + "  " +  parkingSlot[i].getModel() + "  " +  parkingSlot[i].getColor() + "  " +  parkingSlot[i].getLicenseNumber());
			}
		}
	}

}
