/**
 * This is an exception class that will be thrown when an invalid 
 * social security number is entered.
 * @author Yuehong Zhang 3109345
 * @version 2019-03-15
 */
public class SocSecException extends Exception
{

	/**
	 * This constructor specifies “Invalid social security number” 
	 * concatenated with the error string in the error message.
	 * @param error erro string
	 */
	public SocSecException(String error) 
	{
		super("Invalid social security number, "+error);
	}
}
