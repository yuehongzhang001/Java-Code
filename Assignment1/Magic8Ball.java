/**
 * This is a program that simulates the Magic 8 Ball, which is a 
 * fortunate-telling toy that displays a random response to a yes 
 * or no question.
 * 
 * @author Yuehong Zhang 3109345
 * @version 2019-02-10
 */
import java.util.Scanner;
import java.io.*;
import java.util.Random;

public class Magic8Ball {

	public static void main(String[] args) throws FileNotFoundException {
		String question, goOn;
		//declare a Random object for g
		Random generator = new Random();
		//declare an scanner object for keyboard
		Scanner keyboard = new Scanner(System.in);
		//read the responses from the file into an array or ArrayList object
		Scanner fileInput = new Scanner(new File("8_ball_responses.txt"));
		String[] responses = new String[12];
		for (int i = 0; i < responses.length; i++) {
			responses[i] = fileInput.nextLine();
		}
		
		//prompt the user to ask a question, and then display one of the responses, 
		//randomly selected from the array or ArrayList object.
		do {
			System.out.print("What is your question? ");
			question = keyboard.next();
			System.out.println(responses[generator.nextInt(12)]);
			System.out.println();
			//ask user whether or not to quit
			System.out.print("Do you have another question? (yes or no): ");
			goOn = keyboard.next();
		} while (goOn.equals("yes"));
		
		System.out.println("Good bye...");
	}
}
