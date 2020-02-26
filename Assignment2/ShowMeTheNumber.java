/**
 * The program asks the user to enter a 10-character telephone number 
 * and then displays the phone number with any alphabetic characters 
 * that apeared in the original translated to their numeric equivalent.
 * @author Yuehong Zhang 3109345
 * @version 2019-03-11
 */
import java.util.Scanner;

public class ShowMeTheNumber {

	public static void main(String[] args) {
		String goOn;//string to store the user's choice.
		Scanner keyboard = new Scanner(System.in);
		//two arrays to store the map from letters to numbers.
		char[] letters = {'A','B','C','D','E','F',
				'G','H','I','J','K','L',
				'M','N','O','P','Q','R','S',
				'T','U','V','W','X','Y','Z'};
		int[] numbers = {2,2,2,3,3,3,
				4,4,4,5,5,5,
				6,6,6,7,7,7,7,
				8,8,8,9,9,9,9};
		do {
			//prompt the user to enter a phone number with alphabetic.
			System.out.print("Enter a phone number containing alphabetic characters: ");
			//get the phone number and converts it to uppercase.
			String str = keyboard.nextLine().toUpperCase();
			//declare a StringBuilder object for alphabeticNum.
			StringBuilder alphabeticNum = new StringBuilder(str);

			//use a loop to translate alphabetic characters to numeric numbers.
			for(int i=0; i<alphabeticNum.length(); i++) {
				String numStr = "";//translated number.
				char letter = ' ';//the char to store a letter.
				//if the char is a letter, replace it with its mapped number.
				if(Character.isLetter(alphabeticNum.charAt(i))) {
					letter = alphabeticNum.charAt(i);//get the alphabetic letter.
					//use a loop to search through the arrays to translate 
					//an alphabetic character to numeric number.
					for(int mapIndex=0; mapIndex<letters.length; mapIndex++) {
						if(letter == letters[mapIndex]) {
							//find the numeric number and convert it to string.
							numStr = String.valueOf(numbers[mapIndex]);
							//replace the alphabetic characters with numeric number
							//in the StringBuilder object.
							alphabeticNum.replace(i,i+1,numStr);
						}
					}
				}
			}
			//display the translated number.
			System.out.println("The numeric version of that number is "+alphabeticNum);
			System.out.println();
			//ask user whether to continue.
			System.out.print("Do you want to translate another phone number?");
			goOn = keyboard.nextLine();//get user's choice.
		}
		while(goOn.toUpperCase().equals("Y"));//loop until user enters N.
		//display bye to indicate the end of program.
		System.out.println("bye...");
	}
}

