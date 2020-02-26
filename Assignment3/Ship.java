/**
 * A class that holds name and build year of the ship.
 * 
 * @author Yuehong Zhang 3109345
 * @version 2019-3-29 Assignment3.
 *
 */
public class Ship {

	private String name;//name of the ship
	private String year;//the year the ship was built
	
	/**
	 * The constructor sets the name and the year of the ship.
	 * @param n The name of the ship.
	 * @param y The year the ship was built.
	 */
	public Ship(String n, String y) {
		 name = n;
		 year = y;
	}
	
	/**
	 * The getName method that returns the name of the ship.
	 * @return name The name of the ship.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * The getYear method that returns year the ship was built. 
	 * @return The year the ship was built.
	 */
	public String getYear() {
		return year;
	}
	
	/**
	 * The setName method stores a value to name field.
	 * @param newName The value to store in name.
	 */
	public void setName(String newName) {
		name = newName;
	}
	
	/**
	 * The setYear method stores a value to year field.
	 * @param newYear The value to store in year.
	 */
	public void setYear(String newYear) {
		year = newYear;
	}
	
	/**
	 * The toString method returns a string containing the 
	 * ship's data.
	 * @return A reference to a String.
	 */
	public String toString() {
		return "Name: "+name+"\nYear built: "+year;
	}
}
