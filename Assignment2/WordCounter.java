/**
 * This program asks the user for the name of a file, and display the
 * number of words the file contains.
 * @author Yuehong Zhang 3109345
 * @version 2019-03-11
 */
import java.util.Scanner;
import java.io.*;

public class WordCounter {
	public static void main(String[] args) throws FileNotFoundException{
		String goOn;//string to store user's choice
		do {
			//declare a Scanner object for keyboard.
			Scanner keyboard = new Scanner(System.in);
			//promt user to enter the name of a file.
			System.out.print("Enter the name of a file: ");
			String file = keyboard.nextLine();//get the name of the file.
			//declare a Scanner object for fileInput.
			Scanner fileInput = new Scanner(new File(file));
			int number = 0;//number of the words in the file.
			while(fileInput.hasNext()) {
				String word = fileInput.next();
				number++;//number increase by 1 if file has next word.
			}
			//display the number of words
			System.out.println("That file has "+number+" words in it.");
			System.out.println();
			//ask the user whether to continue.
			System.out.print("Do you want to count words in another file?");
			goOn = keyboard.nextLine();//get the choice.
		}while(goOn.toUpperCase().equals("Y"));//loop until user says N.
		//display bye to indicate the end of program.
		System.out.println("bye...");
	}
}
