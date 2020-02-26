/**
 * The CargoShip class extends the Ship class.
 * 
 * @author Yuehong Zhang 3109345
 * @version 2019-3-29 Assignment3.
 */
public class CargoShip extends Ship{

	private int capacityInTon;//cargo capacity in tonnage.
	
	/**
	 * The constructor sets the name, year and capacity of the CargoShip.
	 * @param name The name of the CargoShip.
	 * @param year The year the CargoShip was built.
	 * @param capacity The cargo capacity in tonnage.
	 */
	public CargoShip(String name, String year, int capacity) {
		super(name,year);
		capacityInTon = capacity;
	}
	
	/**
	 * The getCapacity method that returns cargo capacity in tonnage.
	 * @return capacityInTon The cargo capacity in tonnage.
	 */
	public int getCapacity() {
		return capacityInTon;
	}
	
	/**
	 * The setCapacity method stores a value to capacityInTon field.
	 * @param newCapacity The value stored to capacityInTon field.
	 */
	public void setCapacity(int newCapacity) {
		capacityInTon = newCapacity;
	}
	
	/**
	 * The toString method returns a string containing the 
	 * cargo ship's data.
	 * @return A reference to a String.
	 */
	
	@Override
	public String toString() {
		return "Name: "+super.getName()+"\nCargo capacity: "+capacityInTon+" tons";
	}
}
