/**
 * The program will ask the user for a person’s name and social security number, 
 * then check to see if the social security number is valid. An exception will 
 * be thrown if an invalid SSN is entered.
 * @author Yuehong Zhang 3109345
 * @version 2019-03-15
 */
import java.util.*;

public class SocSecProcessor {

	public static void main(String[] args) {
		String name, ssn, goOn;
		Scanner kb = new Scanner(System.in);
		do {
			//prompt user to enter a name.
			System.out.print("Name? ");
			name = kb.nextLine();//get the value of name.
			System.out.print("SSN? ");
			//prompt user to enter a SSN.
			ssn = kb.nextLine();//get the value of SSN
			try {
				
				//print out name and SSN if SSN if valid.
				if(isValid(ssn))
					System.out.println(name+" "+ssn+" is valid");
			}
			catch(SocSecException e) {
				//display error message.
				System.out.println(e.getMessage());
			}
			//ask user whether to continue.
			System.out.print("Continue?");
			goOn = kb.nextLine();//get user's choice.
		}
		while(goOn.toUpperCase().equals("Y"));
	}

	/**
	 * The isValid method returns true if the social security 
	 * number is valid, false otherwise.
	 * @param ssn social security number
	 * @return true if ssn is valid, false otherwise.
	 * @exception SocSecException when number of characters 
	 * 			  not equal to 11, dashes in the wrong spots
	 * 			  and any non-digits in the SSN.
	 */
	public static boolean isValid(String ssn) 
			throws SocSecException
	{
		boolean valid = true;
		//check if number of characters is not equal to 11.
		if(ssn.length() != 11)
		{
			valid = false;
			throw new SocSecException("wrong number of characters");
		}

		for(int i=0; i<ssn.length(); i++) {
			char ch = ssn.charAt(i);
			//check if dashes are in the wrong spots.
			if(i==3 || i==6) {
				if(ch!='-') {
					valid = false;
					throw new SocSecException("dashes at wrong positions");
				}
			}
			else {
				//check any non-digits in the SSN.
				if(!Character.isDigit(ch)) {
					valid = false;
					throw new SocSecException("contains a character that is not a digit");
				}	
			}
		}
		return valid;
	}
}
