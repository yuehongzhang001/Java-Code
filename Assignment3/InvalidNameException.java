/**
 * InvalidNameExceptions are thrown when the name string is empty. 
 * 
 * @author Yuehong Zhang 3109345
 * @version 2019-03-29 Assignment3.
 *
 */
public class InvalidNameException extends Exception{

	/**
	 * The constructor uses a generic error message.
	 */
	public InvalidNameException() {
		super("Error - Invalid name");
	}
}
