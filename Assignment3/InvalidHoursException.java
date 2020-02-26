/**
 * The InvalidHoursExceptions are thrown by Payroll class 
 * when hoursWorked is negative or greater than 84.
 * 
 * @author Yuehong Zhang 3109345
 * @version 2019-03-29 Assignment3.
 *
 */
public class InvalidHoursException extends Exception{

	/**
	 * The constructor specifies the bad hours worked in the error message.
	 * @param hours The bad hours worked.
	 */
	public InvalidHoursException(double hours) {
		super("Error - Invalid number of hours: "+hours);
	}
}
