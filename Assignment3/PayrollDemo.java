/**
 * This program demonstrates how the Payroll class 
 * throws different exceptions.
 * @author Yuehong Zhang 3109345
 * @version 2019-03-29 Assignment3.
 */
public class PayrollDemo {

	public static void main(String[] args) {
		//create first object with no error.
		try {
			System.out.println("> Creating Payroll(\"Bill Jenkins\", 123)");
			Payroll payroll1 = new Payroll("Bill Jenkins", 123);
			System.out.println("Done!");
		}
		catch(InvalidNameException e) {
			System.out.println(e.getMessage());
		}
		catch(InvalidIDException e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		
		//create second object that will throw an InvalidNameException.
		try {
			System.out.println("> Creating Payroll(\"\", 123)");
			Payroll payroll2 = new Payroll("", 123);
		}
		catch(InvalidNameException e) {
			System.out.println(e.getMessage());
		}
		catch(InvalidIDException e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		
		//create third object that will throw an InvalidIDException.
		try {
			System.out.println("> Creating Payroll(\"Bill Jenkins\", -99)");
			Payroll payroll3 = new Payroll("Bill Jenkins", -99);
		}
		catch(InvalidNameException e) {
			System.out.println(e.getMessage());
		}
		catch(InvalidIDException e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		
		//create fourth object that will throw an InvalidHourlyRateException.
		try {
			System.out.println("> Creating Payroll(\"Bill Jenkins\", 123)"+
								"\t\t<-- and then setting payRate to 150");
			Payroll payroll4 = new Payroll("Bill Jenkins", 123);
			payroll4.setPayRate(150);
		}
		catch(InvalidNameException e) {
			System.out.println(e.getMessage());
		}
		catch(InvalidIDException e) {
			System.out.println(e.getMessage());
		}
		catch(InvalidHourlyRateException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		
		//create fifth object that will throw an InvalidHoursException.
		try {
			System.out.println("> Creating Payroll(\"Bill Jenkins\", 123)"+
								"\t\t<-- and then setting hoursWorked to -10");
			Payroll payroll5 = new Payroll("Bill Jenkins", 123);
			payroll5.setHoursWorked(-10);;
		}
		catch(InvalidNameException e) {
			System.out.println(e.getMessage());
		}
		catch(InvalidIDException e) {
			System.out.println(e.getMessage());
		}
		catch(InvalidHoursException e) {
			System.out.println(e.getMessage());
		}
		
		//end of the program.
		System.out.println("\n> bye...");
	}
}
