/**
 * The Morse class converts a string to Mosrse code.
 * @author Yuehong Zhang 3109345
 *@version 2019-03-11
 */
public class Morse {

	public static int NUM_CHARS=40;//Maxium chars for input string
	private String original;//input string
	private String mcode="";//converted morse code

	//Two arrays to keep the morse code table
	private char[] regular = {'A','B','C','D','E','F',
			'G','H','I','J','K','L','M',
			'N','O','P','Q','R','S','T',
			'U','V','W','X','Y','Z','1',
			'2','3','4','5','6','7','8',
			'9','0',' '};
	private String[] morse = {".-","-...","-.-.","-..",".","..-.",
			"--.","....","..",".---","-.-",".-..","--",
			"-.","---",".--.","--.-",".-.","...","-",
			"..-","...-",".--","-..-","-.--","--..",".----",
			"..---","...--","....-",".....","-....","--...","---..",
			"----.","-----",""};

	/**
	 * The constructor that converts the input string to morse code.
	 * @param input input string.
	 */
	public Morse(String input) {
		if(input.length() <= NUM_CHARS) 
		{
			original = input;
			for(int i=0; i<original.length(); i++)
				mcode += (toMorse(original.charAt(i))+"\n");
		}
		else {
			System.out.println("More than 40 chars are not permitted for input string!");
		}

	}

	/**
	 * The toMorse method that converts char to morse code.
	 * @param ch the character.
	 * @return code the converted morse code.
	 */
	public String toMorse(char ch) {
		String code = "";
		for(int i=0; i<regular.length; i++)
			if(regular[i] == Character.toUpperCase(ch))
				code = morse[i];
		return code;
	}

	/**
	 * The getMorseCode method that return the morse code.
	 * @return mcode the whole morse code.
	 */
	public String getMorseCode() {
		return mcode;
	}

	/**
	 * The getOriginal method that return the original input string.
	 * @return original the input string.
	 */
	public String getOriginal() {
		return original;
	}
}
