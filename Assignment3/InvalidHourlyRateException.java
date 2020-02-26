/**
 * InvalidHourlyRateException exceptions are thrown by the 
 * Payroll class when payRate is negative or greater than 25.
 * 
 * @author Yuehong Zhang 3109345.
 * @version 2019-03-29 Assignment3.
 *
 */
public class InvalidHourlyRateException extends Exception {

	/**
	 * This constructor specifies the bad pay rate in the error message.
	 * @param rate The bad pay rate.
	 */
	public InvalidHourlyRateException(double rate) {
		super("Error - Invalid hourly pay rate: "+rate);
	}
}
