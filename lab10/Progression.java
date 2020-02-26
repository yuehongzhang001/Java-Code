import java.util.Scanner;
/**
This program calculates the geometric and
harmonic progression for a number entered
by the user.
@author Yuehong Zhang 3109345
@version 2019-03-22 Task #2
 */
public class Progression {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		System.out.println("This program will calculate " +
				"the geometric and harmonic " +
				"progression for the number " +
				"you enter.");
		System.out.print("Enter an integer that is " +
				"greater than or equal to 1: ");
		int input = keyboard.nextInt();
		// Match the method calls with the methods you write
		int geomAnswer = geometricRecursive(input);
		double harmAnswer = harmonicRecursive(input);
		System.out.println("Using recursion:");
		System.out.println("The geometric progression of " +
				input + " is " + geomAnswer);
		System.out.println("The harmonic progression of " +
				input + " is " + harmAnswer);
		// Match the method calls with the methods you write
		geomAnswer = geometricIterative(input);
		harmAnswer = harmonicIterative(input);
		System.out.println("Using iteration:");
		System.out.println("The geometric progression of " +
				input + " is " + geomAnswer);
		System.out.println("The harmonic progression of " +
				input + " is " + harmAnswer);
	}
	// ADD LINES FOR TASK #2 HERE
	// Write the geometricRecursive method
	/**
	 * The geometricRecursive method uses a recursion to calculate the geometric
	 * progression for a number. 
	 * @param n The number entered by user.
	 * @return result The result of geometric progression.
	 */
	public static int geometricRecursive(int n) {
		if(n==1)
			return 1;
		else
			return n*geometricRecursive(n-1);
	}
	
	// Write the geometricIterative method
	/**
	 * The geometricIterative method uses a loop to calculate the geometric
	 * progression for a number. 
	 * @param n  The number entered by user.
	 * @return result The result of geometric progression.
	 */
	public static int geometricIterative(int n) {
		int result=1;
		for(int i=1; i<=n; i++)
			result *= i;
		return result;
	}
	
	// Write the harmonicRecursive method
	/**
	 * The harmonicRecursive method uses recursion to calculate the harmonic 
	 * progression for a number.
	 * @param n The number entered by user.
	 * @return result The result of harmonic progression.
	 */
	public static double harmonicRecursive(int n) {
		if(n==1)
			return 1;
		else
			return (double)1/n*harmonicRecursive(n-1);
	}
	// Write the harmonicIterative method
	/**
	 * The harmonicIterative method uses a loop to calculate the harmonic 
	 * progression for a number.
	 * @param n The number entered by user.
	 * @return result The result of harmonic progression.
	 */
	public static double harmonicIterative(int n) {
		double result=1;
		for(int i=1; i<=n; i++)
			result *= (double)1/i;
		return result;
	}
}