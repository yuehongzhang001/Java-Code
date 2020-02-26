/**
 * Write a program named ‘SortedListGasPrices1994.java’ that reads the gas 
 * prices from the text file ‘1994_Weekly_Gas_Averages.txt’ and calculates
 *  the average gas price for each month.
 *  
 *  @author Yuehong Zhang 3109345
 *  @version 2019-02-10
 */
import java.io.*;
import java.util.Scanner;

public class SortedListGasPrices1994 {
	public static void main(String[] args) throws FileNotFoundException {

		//Declare an Scanner object for inputFile
		Scanner inputFile = new Scanner(new File("1994_Weekly_Gas_Averages.txt"));

		//Create an array to hold the values of weekly gas average prices.
		double[] weekAverage = new double[48];

		//Fill in values from the file.
		for (int i = 0; inputFile.hasNext() && i < weekAverage.length; i++) {
			weekAverage[i] = inputFile.nextDouble();
		}
		inputFile.close();

		//Create an array to hold the name strings of 12 months
		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		//Create an array to hold the values of monthly gas average prices.
		double[] monthAverage = new double[12];

		//Nested loop to calculates the average of the average weekly
		//prices for the month.
		int indexOfWeek = 0;
		for (int indexOfMonth = 0; indexOfMonth < monthAverage.length; indexOfMonth++) {
			double sum = 0;
			for (int index = 0; index < 4; index++) {
				sum += weekAverage[indexOfWeek];
				indexOfWeek++;
			}
			monthAverage[indexOfMonth] = sum / 4;
		}

		//Create another text file named ‘Sorted_Averages.txt’ to store 
		//the names of the months, and each month’s average gas price.
		PrintWriter outputFile = new PrintWriter(new File("Sorted_Averages.txt"));
		//Sort each month’s average gas price from lowest to highest,
		//and write them into the text file.
		int startScan, index, minIndex;
		String minMonthStr;
		double minValue;
		for (startScan = 0; startScan < monthAverage.length; startScan++) {
			minIndex = startScan;
			minValue = monthAverage[startScan];
			minMonthStr = months[startScan];
			for(index = startScan + 1; index < monthAverage.length; index++) {
				if (monthAverage[index] < minValue) {
					minValue = monthAverage[index];
					minIndex = index;
					minMonthStr = months[index];
				}
			}
			//print the month and its corresponding values in the file
			outputFile.printf("%s: %.3f\n", minMonthStr,minValue);
			monthAverage[minIndex] = monthAverage[startScan];
			months[minIndex] = months[startScan];
			monthAverage[startScan] = minValue;
			months[startScan]= minMonthStr;
		}
		outputFile.close();
		}
	}
