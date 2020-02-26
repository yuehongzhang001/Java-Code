/**
 * The Payroll class simulates a payroll. 
 * 
 * @author Yuehong Zhang 3109345
 * @version 2019-03-29 Assignment3.
 */
public class Payroll {

	private String name;//employee's name.
	private int idNumber;//employees's ID number.
	private double payRate;//hourly pay rate.
	private double hoursWorked;//numbers of hours worked.
	
	/**
	 * The constructor sets the employee's name and ID number. 
	 * @param n Employee's name.
	 * @param i Employees's ID number.
	 * @exception InvalidNameException when name string is empty.
	 * @exception InvalidIDException when idNumber is negative or zero.
	 */
	public Payroll(String n, int i) 
			throws InvalidNameException, InvalidIDException{
		if(n=="")
			throw new InvalidNameException();
		if(i<=0)
			throw new InvalidIDException(i);
		name = n;
		idNumber = i;
	}
	
	/**
	 * The setName method sets employee's name.
	 * @param n The value to store in name.
	 * @exception InvalidNameException when name is empty.
	 */
	public void setName(String n) 
			throws InvalidNameException{
		if(n=="")
			throw new InvalidNameException();
		name = n;
	}
	
	/**
	 * The setNumber method sets employees's ID number.
	 * @param i The value to store in idNumber.
	 * @exception InvalidIDException when idNumber is negative or zero.
	 */
	public void setNumber(int i) 
			throws InvalidIDException{
		if(i<=0)
			throw new InvalidIDException(i);
		idNumber = i;
	}
	
	/**
	 * The setPayRate method sets payRate.
	 * @param p The value to store in payRate.
	 * @exception InvalidHourlyRateException when payRate is negative or greater than 25.
	 */
	public void setPayRate(double p) throws InvalidHourlyRateException{
		if(p<0 || p>25)
			throw new InvalidHourlyRateException(p);
		payRate = p;
	}
	
	/**
	 * The setHoursWorked method sets hoursWorked.
	 * @param h The value to store in hoursWorked.
	 * @throws InvalidHoursException when hoursWorked is negative or greater than 84.
	 */
	public void setHoursWorked(double h) 
			throws InvalidHoursException{
		if(h<0 || h>84)
			throw new InvalidHoursException(h);
		hoursWorked = h;
	}
	
	/**
	 * The getName method return name.
	 * @return name Employee's name.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * The getIdNumber method return idNumber.
	 * @return idNumber Employees's ID number.
	 */
	public int getIdNumber() {
		return idNumber;
	}
	
	/**
	 * The getPayRate method returns payRate.
	 * @return payRate The hourly pay rate.
	 */
	public double getPayRate() {
		return payRate;
	}
	
	/**
	 * The getHoursWorked method returns hoursWorked.
	 * @return hoursWorked The numbers of hours worked.
	 */
	public double getHoursWorked() {
		return hoursWorked;
	}
	
	/**
	 * The getGrossPay method returns gross pay.
	 * @return The gross pay that equals to 
	 * 			payRate multiply hoursWorked.
	 */
	public double getGrossPay() {
		return payRate * hoursWorked;
	}
	
}
