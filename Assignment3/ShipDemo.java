/**
 * This is a program to demonstrate classed of Ship, CrusieShip and
 * CargoShip. assign various Ship, CrusieShip and CargoShip objects 
 * to the array elements, then step through the array, calling each 
 * objects' toString method.
 * 
 * @author Yuehong Zhang 3109345
 * @version 2019-3-29 Assignment3.
 *
 */
public class ShipDemo {

	public static void main(String[] args) {
		Ship ships[] = new Ship[3];
		
		System.out.println("> Creating Ship object");
		//assign Ship object to the array elements.
		ships[0] = new Ship("Lolipop","1960");
		//call the object's toString method.
		System.out.println(ships[0].toString()+"\n----------------------------\n");
		
		//assign CrusieShip object to the array elements.
		ships[1] = new CrusieShip("Disney Magic", "1988",2400);
		//call the object's toString method.
		System.out.println(ships[1].toString()+"\n----------------------------\n");
				
		//assign CargoShip object to the array elements.
		ships[2] = new CargoShip("Black Pearl", "1990", 50000);
		//call the object's toString method.
		System.out.println(ships[2].toString()+"\n----------------------------\n");
		//step through the array, calling each objects' toString method.

		//end of the program.
		System.out.println("> bye...");
	}
}
