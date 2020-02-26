/**
 * This program asks the user to enter a string, and converts that
 * string to Morse code by calling a class called Morse.
 * @author Yuehong Zhang 3109345
 * @version 2019-03-11
 */
import java.util.Scanner;
public class MorseCodeConverter {

	public static void main(String[] args) {
		String str, goOn;
		Scanner keyboard = new Scanner(System.in);

		do {
			//prompt the user to enter a string.
			System.out.print("Enter a string and I will convert it to Morse code.\n>");
			str = keyboard.nextLine();// get the string
			//instantiate a new Morse object to input the string.
			Morse morse = new Morse(str);
			System.out.println(morse.getMorseCode());//print the morse code.
			//ask whether the user will continue or not.
			System.out.print("Do you want to convert another string to Morse code?");
			goOn = keyboard.nextLine();
		}
		while(goOn.toUpperCase().equals("Y"));//loop until the user enters N to exit

		//indicate the end of the program
		System.out.println("bye...");
	}
}
