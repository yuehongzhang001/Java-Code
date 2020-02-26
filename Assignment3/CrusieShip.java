/**
 * The CrusieShip class extends the Ship class.
 * 
 * @author Yuehong Zhang 3109345
 * @version 2019-3-29 Assignment3.
 *
 */
public class CrusieShip extends Ship{

	private int maxNumber;//The maximum number of passengers.
	
	/**
	 * The constructor sets the name, year and maximum passenger number of the CrusieShip.
	 * @param name The name of the crusie ship.
	 * @param year The year the crusie ship was built.
	 * @param number The maximum number of passengers.
	 */
	public CrusieShip(String name, String year, int number) {
		super(name,year);
		maxNumber = number;
	}
	
	/**
	 * The getMaxNumber method that returns maximum number of the crusie ship.
	 * @return maxNumber The maximum number of passengers.
	 */
	public int getMaxNumber() {
		return maxNumber;
	}
	
	/**
	 * The setMaxtNumber method stores a value to maxNumber field.
	 * @param newNumber The value to store in maxNumber.
	 */
	public void setMaxtNumber(int newNumber) {
		maxNumber = newNumber;
	}
	
	/**
	 * The toString method returns a string containing the 
	 * crusie ship's data.
	 * @return A reference to a String.
	 */
	
	@Override 
	public String toString() {
		return "Name: "+super.getName()+"\nMaximum passengers: "+maxNumber;
	}
}
