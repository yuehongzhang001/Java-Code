/**
 * The program uses the method call charCount(…) that uses recursion to count the 
 * number of times a specific character occurs in an array of characters. 
 * 
 * @author Yuehong Zhang 3109345
 * @versio 2019-04-05 Lab12.
 *
 */
public class CharacterCounter
{
	public static void main(String[] args)
	{
		// Create an array of chars to test.
		// The character 'a appears 6 times.
		char[] test = {'a', 'b', 'a', 'c', 'd', 'a', 'e',
				'a', 'f', 'g', 'h', 'a', 'i', 'a'};
		System.out.println("The character 'a' appears " +
				charCount(test, 0, 'a') + " times.");
	}

	/**
 The charCount method counts the number of
 times a specified character appears in the
 portion of an array starting at a specified
 subscript.
 @param array The array being searched.
 @param start The starting subscript of the
 part of the array being searched.
 @param ch The character to search for.
 @return The number of times the character
 appears in the specified part of
 the array.
	 */

	public static int charCount(char[] array, int start, char ch)
	{

		// TASK #1
		// Complete the recursive method to count the number of times
		// the character in parameter ch occurs in the array of characters in
		// parameter array
		int count;
		if(array[start]==ch)
			count=1;
		else
			count=0;

		if(start == array.length-1)
			return count;
		else
			return count + charCount(array, start+1, ch);

	}
}