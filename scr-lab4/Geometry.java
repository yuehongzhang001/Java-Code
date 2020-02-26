import java.util.Scanner;
/**
* This program demonstrates static methods
* @author Yuehong Zhang 3109345 
* @version 2019-02-01
*/
public class Geometry {
	public static void main(String[] args) {
		int choice; // The user's choice
		double value = 0; // The method's return value
		char letter; // The user's Y or N decision
		double radius; // The radius of the circle
		double length; // The length of the rectangle
		double width; // The width of the rectangle
		double height; // The height of the triangle
		double base; // The base of the triangle
		double side1; // The first side of the triangle
		double side2; // The second side of the triangle
		double side3; // The third side of the triangle
		// Create a scanner object to read from the keyboard
		Scanner keyboard = new Scanner(System.in);
		// The do loop allows the menu to be displayed first
		do {
			// TASK #1 Call the printMenu method
			printMenu();
			choice = keyboard.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter the radius of " +
						"the circle: ");
				radius = keyboard.nextDouble();
				// TASK #3 Call the circleArea method and
				// store the result in the value variable
				value = circleArea(radius);
				System.out.println("The area of the " +
						"circle is " + value);
				break;
			case 2:
				System.out.print("Enter the length of " +
						"the rectangle: ");
				length = keyboard.nextDouble();
				System.out.print("Enter the width of " +
						"the rectangle: ");
				width = keyboard.nextDouble();
				//TASK #3 Call the rectangleArea method and
				//store the result in the value variable
				value = rectangleArea(length, width);
				System.out.println("The area of the " +
						"rectangle is " + value);
				break;
			case 3:
				System.out.print("Enter the height of " +
						"the triangle: ");
				height = keyboard.nextDouble();
				System.out.print("Enter the base of " +
						"the triangle: ");
				base = keyboard.nextDouble();
				//TASK #3 Call the triangleArea method and
				//store the result in the value variable
				value = triangleArea(height, base);
				System.out.println("The area of the " +
						"triangle is " + value);
				break;
			case 4:
				System.out.print("Enter the radius of " +
						"the circle: ");
				radius = keyboard.nextDouble();
				//TASK #3 Call the circumference method and
				//store the result in the value variable
				value = circleCircumference(radius);
				System.out.println("The circumference " +
						"of the circle is " +
						value);
				break;
			case 5:
				System.out.print("Enter the length of " +
						"the rectangle: ");
				length = keyboard.nextDouble();
				System.out.print("Enter the width of " +
						"the rectangle: ");
				width = keyboard.nextDouble();
				//TASK #3 Call the perimeter method and
				//store the result in the value variable
				value = rectanglePerimeter(length, width);
				System.out.println("The perimeter of " +
						"the rectangle is " +
						value);
				break;
			case 6:
				System.out.print("Enter the length of " +
						"side 1 of the " +
						"triangle: ");
				side1 = keyboard.nextDouble();
				System.out.print("Enter the length of " +
						"side 2 of the " +
						"triangle: ");
				side2 = keyboard.nextDouble();
				System.out.print("Enter the length of " +
						"side 3 of the " +
						"triangle: ");
				side3 = keyboard.nextDouble();
				// TASK #3 Call the perimeter method and
				// store the result in the value variable
				value = trianglePerimeter(side1, side2, side3);
				System.out.println("The perimeter of " +
						"the triangle is " +
						value);
				break;
			default:
				System.out.println("You did not enter " +
						"a valid choice.");
			}
			keyboard.nextLine(); // Consume the new line
			System.out.println("Do you want to exit " +
					"the program (Y/N)?: ");
			String answer = keyboard.nextLine();
			letter = answer.charAt(0);
		} while(letter != 'Y' && letter != 'y');
	}
	// TASK #1 Create the printMenu method here
	/**
	   The printMenu method prints a menu and prompts user to enter a choice.
	   The printMenu method prints out instructions for the user with 
	   a menu of options for the user to choose from.
	 */
	public static void printMenu() {
		System.out.print("This is a geometry calculator\n" + 
				"Choose what you would like to calculate\n" + 
				"1. Find the area of a circle\n" + 
				"2. Find the area of a rectangle\n" + 
				"3. Find the area of a triangle\n" + 
				"4. Find the circumference of a circle\n" + 
				"5. Find the perimeter of a rectangle\n" + 
				"6. Find the perimeter of a triangle\n" + 
				"Enter the number of your choice:");
	}
	
	// TASK #2 Create the value-returning methods here
	//takes in the radius of the circle and returns the area using the formula
	/**
	   The circleArea method returns the value of circle area.
	   This method is called to calculate the area of a circle, 
	   it takes in the radius of the circle and uses the formula 
	   A = π r r, then returns the value of area.
	   @param r The radius.
	   @return A The area of the circle.
	 */
	public static double circleArea(double r) {
		double A;
		A = Math.PI*r*r;
		return A;
	}
	
	/**
	   The rectangleArea method returns the value of rectangle area.
       This method is called to calculate the area of a rectangle, 
	   it takes in the length and width of the circle and uses the 
	   formula A = l*w, then returns the value of area.
	   @param l The length.
	   @param w The width.
	   @return A The area of the rectangle
	 */
	public static double rectangleArea(double l, double w) {
		double A;
		A = l*w;
		return A;
	}
	
	/**
	   The triangleArea method returns the value of triangle area.
	   This method is called to calculate the area of a triangle, 
	   it takes in the height and base of the triangle and uses the 
	   formula A = 1/2bh, then returns the value of area.
	   @param h The height.
	   @param b The base.
	   @return A The area of the triangle.
	 */
	public static double triangleArea(double h, double b) {
		double A;
		A = 1.0/2.0*b*h;
		return A;
	}
	
	/**
	   The circleCircumference method returns the value of circle circumference.
	   This method is called to calculate the circumference of a circle, 
	   it takes in the radius of the circle and uses the formula C = 2πr, 
	   then returns the value of circumference.
	   @param r The radius.
	   @return C The circumference of the circle.
	 */
	public static double circleCircumference(double r) {
		double C;
		C = 2*Math.PI*r;
		return C;
	}
	
	/**
	   The rectanglePerimeter method returns the value of rectangle perimeter.
	   This method is called to calculate the perimeter of a rectangle, it 
	   takes in the length and width of the rectangle and uses the formula 
	   P = 2l+2w, then returns the value of perimeter.
	   @param l The length.
	   @param w The width.
	   @return P The perimeter of the rectangle.
	 */
	public static double rectanglePerimeter(double l,double w) {
		double P;
		P = 2*l + 2*w;
		return P;
	}
	
	/**
	   The trianglePerimeter method returns the value of triangle perimeter.
	   This method is called to calculate the perimeter of a triangle, it 
	   takes in the the lengths of the three sides of the triangle and adds 
	   up the three sides, then returns the value of perimeter.
	   @param side1 The length of side 1.
	   @param side2 The length of side 2.
	   @param side3 The length of side 3.
	   @return P The perimeter of the triangle.
	 */
	public static double trianglePerimeter(double side1, double side2, double side3) {
		double P;
		P = side1 + side2 + side3;
		return P;
	}
	
	// TASK #4 Write javadoc comments for each method
}