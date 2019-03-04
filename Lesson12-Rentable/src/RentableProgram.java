/**
 * 
 */

/**
 * @author Marloun_Bayari
 *
 */
public class RentableProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rentable[] rentalList = new Rentable[3];
		Room room1 = new Room ("Best Western", 45.99);
		Room room2 = new Room ("Hilton", 125.00);
		Room room3 = new Room ("Red Roof Inn", 78.00);
		
		rentalList[1]=room1;
		rentalList[2]=room2;
		rentalList[3]=room3;
		
		for (int i=0; i < rentalList.length; i++) {
			System.out.println(rentalList[i].getDescription());
		}
		

	}

}
