/**
 * 
 */

/**
 * @author Marloun_Bayari
 *
 */
public class CarLotProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarLot lot1 = new CarLot ("Purple");
		CarLot lot2 = new CarLot ("Green");
		
		//Create Test Truck	// Parameters to pass (licenseNumber,make,model,price,bedSize)	
		Truck kamion = new Truck ("ABCS1234","Ford","F-150", 35000, 80);
		Truck trakk = new Truck ("123ABCD","Chevrolet","Silverado",33500, 75);
		
		//Create Test Car
		// Parameters to pass (licenseNumber,make,model,price,type,doors)
		Car godzilla = new Car ("UWISH","Nissan","GT-r",99500,"coupe",2);
		Car prancinghorse = new Car ("1TA71AN","Ferrari","488 Pista",22500,"coupe",2);
		Car tyrdan = new Car ("BZZBZZ","Porsche","Mission-E",120000,"Sedan",4);
		
		
		//Adding Vehicle to Lots
		lot1.addVehicle(godzilla);
		lot1.addVehicle(trakk);
		lot2.addVehicle(kamion);
		lot2.addVehicle(prancinghorse);
		
		//Print Inventory
		System.out.println("Printing inventory list for: " + lot1.getName());
		lot1.printvlist();
		System.out.println("Printing inventory list for: " + lot2.getName());
		lot2.printvlist();		
		
		//Adding car to Lot 1
		lot1.addVehicle(tyrdan);
		System.out.println("Printing inventory list for: " + lot1.getName());
		lot1.printvlist();

	}

}
