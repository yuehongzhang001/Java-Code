package lab;
import java.util.Scanner;
/**
 * Use a two-dimensional array to solve the problem,read all information
 * from the console for last week’s sales and summarize the total sales 
 * by salesperson and by product.Display the results in tabular format.
 * 
 * @author Yuehong Zhang 3109345
 * @version 2019-02-10
 */
public class Sales {
	public static void main(String[] args) {
		
		final int PRODUCTS = 5;//5 products
		final int PERSONS = 4;//4 salesperson
		int salespersonNum, productNum;
		double salesAmount;
		double totalOfPerson;
		double totalOfProduct;
		
		
		//Create an array to hold the sales for each product,
		//for each person.
		double[][] sales = new double[PRODUCTS][PERSONS];
		
		//Create a Scanner for keyboard input.
		Scanner keyboard = new Scanner(System.in);
		
		//prompt user for a salesperson number.
		System.out.print("Enter salesperson number (-1 to end): ");
		salespersonNum = keyboard.nextInt();//get salesperson number

		//continue to prompt for slip information until user
		//enters -1 for salesperson number to quit.
		while(salespersonNum != -1) {
			System.out.print("Enter product number: ");
			productNum = keyboard.nextInt();//get the product number
			System.out.print("Enter sales amount: ");
			salesAmount = keyboard.nextDouble();//get the sales amount
			//hold the sales amount value in the array.
			sales[productNum-1][salespersonNum-1] += salesAmount;
			System.out.print("Enter salesperson number (-1 to end): ");
			salespersonNum = keyboard.nextInt();//get the salesperson number
		}

		//Display the results in a Summary Sales Table.
		System.out.println("Summary Sales Table:\n");
		System.out.printf("Product\tSalesperson 1\tSalesperson 2"
				+ "\tSalesperson 3\tSalesperson 4\tTotal\n");//head of the table
		
		// Nested loops to display the array with each salesperson's
		// sales figures for each product and the total
		for(int product=0; product<PRODUCTS; product++) {
			System.out.printf("%7d", product+1);
			totalOfProduct = 0;
			for(int person=0; person<PERSONS; person++) {
				System.out.printf("\t%13.2f", sales[product][person]);
				totalOfProduct += sales[product][person];
			}
			//Display the total sales of each product
			System.out.printf("\t%5.2f\n",totalOfProduct);
		}
		
		//Display the total sales of each person
		System.out.print("  Total");
		for(int person=0; person<PERSONS; person++) {
			totalOfPerson = 0;
			for(int product=0; product<PRODUCTS; product++)
				totalOfPerson += sales[product][person];
			System.out.printf("\t%13.2f",totalOfPerson );
		}
	}
}
