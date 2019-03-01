/**
 * 
 */
package parkingGarage;

/**
 * @author Marloun_Bayari
 *
 */
public class GarageManager {

	/**
	 * @param args
	 */
	//Test Cars
	public static Car bil = new Car ("Silver","uWish","Nissan","GT-r");
	public static Car coche = new Car ("Red","ZoomZoom","Mazda","6");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParkingGarage G1 = new ParkingGarage(10);
		ParkingGarage G2 = new ParkingGarage(25);
		
		
		//Populate 1St Garage with Cars
		for (int i=0; i<G1.capacity; i++) {
			G1.park(bil, i);
		}
		G1.printInventory();
		
		//Attempting to Park coche in one of G1 spots should fail
		System.out.println("***Test - Attempt to park car already in slot");
		G1.park(coche, 3);
		
		//attempting to vacate spot, and part coche
		System.out.println("***Test - Remove car, and park car in vacated spot");
		G1.vacate(3);
		G1.printInventory();
		G1.park(coche, 3);
		G1.printInventory();
		
		//attempting to park car in invalid slot
		System.out.println("***Test if spot actually available");
		G1.park(coche, 11);
		
		// Test with empty garage
		System.out.println("*** Test - Empty Garage 2");
		G2.printInventory();
		
		// Insert car into 1st 5 slots
		System.out.println("*** Test - Parking 5 cars");
		for (int i=0; i<5; i++) {
			G2.park(coche, i);
		}
		G2.printInventory();
		
		//Parking car in empty spot(s)
		System.out.println("*** Test - Parking Cars in empty slots");
		G2.park(bil, 8);
		G2.park(coche, 12);
		G2.printInventory();
		
		// Removing Car in occupied slot then parking same car again
		System.out.println("*** Test Removing Car, and parking new car");
		G2.vacate(2);
		G2.printInventory();
		G2.park(bil, 2);
		G2.printInventory();	
		
		// Empty out both garage1
		
		System.out.println(" **** Test - Clear out garage 1");
		System.out.println(" *** Garage 1 - Before");
		G1.printInventory();
		for (int i=0; i<G1.capacity; i++) {
			G1.vacate(i);
		}
		System.out.println(" *** Garage 1 - After");
		G1.printInventory();

	}
	

}
