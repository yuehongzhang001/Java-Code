/**
 * InvalidIDExceptions are thrown when the employee's ID number is
 * negative or zero.
 * 
 * @author Yuehong Zhang 3109345
 * @version 2019-03-29 Assignment3.
 *
 */
public class InvalidIDException extends Exception{

	/**
	 * The constructor specifies the bad ID number in the error message..
	 * @param number The bad ID number.
	 */
	public InvalidIDException(int number) {
		super("Error - Invalid ID number: "+number);
	}
}
