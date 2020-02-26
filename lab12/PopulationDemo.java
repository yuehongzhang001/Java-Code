/**
 * The program connects to the CityDB database, and allows the user 
 * to select any of the following operations (which are implemented 
 * in 3 different methods) and displays the results in the console.
 * 
 * @author Yuehong Zhang 3109345
 * @versio 2019-04-05 Lab12.
 */
import java.sql.*;
import java.util.*;

public class PopulationDemo {

	public static void main(String[] args) 
	{
		// Create a named constant for the URL
		final String DB_URL = "jdbc:derby:CityDB";
		Connection conn;
		try {
			// Create a connection to the database
			conn = DriverManager.getConnection(DB_URL);
			char choice;
			Scanner keyboard = new Scanner(System.in);
			//print the menu
			printMenu();
			choice = Character.toLowerCase(keyboard.nextLine().charAt(0));//get user's choice.
			//do the opertation depending on user's choice.
			switch(choice) {
			case 'a':
				displaySorted(conn); break;
			case 'b':
				displayTotal(conn); break;
			case 'c':
				displayLowest(conn); break;
			}
		}
		catch(Exception ex) {
			System.out.println("ERROR: "+ex.getMessage());
		}
	}

	/**
	 * The printMenu method displays the menu.
	 */
	public static void printMenu() {
		System.out.println("Select from the following options:");
		System.out.println("a) Sort the list of cities by population, in ascending order");
		System.out.println("b) Get the total population of all the cities");
		System.out.println("c) Get the lowest population");
	}

	/**
	 * The displaySorted method sorts the list of cities by population, in ascending order
	 * @param conn A connection to the database.
	 */
	public static void displaySorted(Connection conn) 
	{
		try {
			Statement stmt = conn.createStatement();
			String sqlStatement = "SELECT * FROM City ORDER BY Population";
			ResultSet result = stmt.executeQuery(sqlStatement);
			System.out.printf("%-15s %21s\n", "CityName", "Population");
			while(result.next()) {
				System.out.printf("%-15s %11.2f\n",
						result.getString("CityName"),
						result.getDouble("Population"));
			}
		}
		catch(Exception ex) {
			System.out.println("ERROR: " + ex.getMessage());
		}
	}

	/**
	 * The displayLowest method gets the total population of all the cities and display it.
	 * @param conn A connection to the database.
	 */
	public static void displayTotal(Connection conn) 
	{
		double total=0;
		try {
			Statement stmt = conn.createStatement();
			String sqlStatement = "SELECT * FROM City";
			ResultSet result = stmt.executeQuery(sqlStatement);
			while(result.next()) 
			{
				total += result.getDouble("Population");
			}
			System.out.printf("The total population of all the cities: %.2f", total);
		}
		catch(Exception ex) {
			System.out.println("ERROR: " + ex.getMessage());
		}
	}

	/**
	 * The displayLowest method gets the lowest of the population and display it.
	 * @param conn A connection to the database.
	 */
	public static void displayLowest(Connection conn) 
	{
		try {
			Statement stmt = conn.createStatement();
			String sqlStatement = "SELECT * FROM City";
			ResultSet result = stmt.executeQuery(sqlStatement);
			result.next();
			double lowest = result.getDouble("Population");
			while(result.next()) 
			{	
				if(lowest>result.getDouble("Population"))
					lowest = result.getDouble("Population");
			}
			System.out.printf("The lowest population is %.2f", lowest);
		}
		catch(Exception ex) 
		{
			System.out.println("ERROR: "+ex.getMessage());
		}
	}

}
