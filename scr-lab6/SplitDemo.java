/**
 * This program will process the tokens in a text file in order 
 * to decode a secret message. use the first letter of every 5th 
 * token read in from a file to reveal the secret message.
 * 
 * @author Yuehong Zhang 3109345
 * @version 2019-02-15
 */
import java.util.Scanner;
import java.io.*;

public class SplitDemo{
	public static void main(String[] args)
	throws FileNotFoundException{
		//Declare a Scanner object to read the text file.
		Scanner fileInput = new Scanner(new File("secret.txt"));
		String text = fileInput.nextLine();
		
		//Separate text into words tokens.
		String[] tokens = text.split(" ");
	
		//Process the tokens by taking the first letter of every fifth word. 
		//Convert these letters to uppercase and append them to StringBuilder 
		//object str.
		StringBuilder str = new StringBuilder();
		for(int i=0; i<tokens.length; i+=5) {
				str.append(Character.toUpperCase(tokens[i].charAt(0)));
		}
		
		//Display the secret message.
		System.out.println(str);
	}
}
