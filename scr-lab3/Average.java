/**
 * This class will allow a user to enter 5 scores into an array. 
 * It will then rearrange the data in descending order and calculate 
 * the mean for the data set.
 * @author Yuehong Zhang 3109345 2019-01-25
*/
import java.util.Scanner;

public class Average {
	//
	private int[] data;
	private double mean;

	/**
	   The constructor will allocate memory for the array.
	   prompt user for numbers, then call the selectionSort
	   to sort array and the calculateMean methods to calculate
	   the mean of numbers in array.
	 */
	public Average() {
		// Create a Scanner object to read from the keyboard
		Scanner keyboard = new Scanner(System.in);
		data = new int[5];
		// prompt the user to enter score numbers,
		// and fill them in the array
		for (int index = 0; index < data.length; index++) {
			System.out.print("Enter score number " + (index + 1) + ": ");
			data[index] = keyboard.nextInt();
		}
		// use a method to sort array
		selectionSort(data);
		// use a method to calculate the mean of numbers in array
		mean = calculateMean(data);
	}

	/**
	 *  The calculateMean method calculate the mean of numbers in array. 
	   @return the mean value of numbers in array.
	 */
	public double calculateMean(int[] array) {
		double total = 0;
		for (int index = 0; index < array.length; index++) {
			total += array[index];
		}
		mean = total / array.length;
		return mean;
	}

	/**
	 *  toString method
	 * @return A String object containing data in descending order and the mean.
	 */
	public String toString() {
		String dataString = "";
		for (int score : data)
			dataString += score + " ";
		return "Data in descending order: " + 
					dataString + "\nthe mean is " + mean;
	}

	/**
	 * The selectionSort method uses the selection sort algorithm 
	 * to rearrange the data set from highest to lowest.
	 * @param array The array to sort.
	 */
	public void selectionSort(int[] array) {
		   
		int startScan, index, maxIndex, maxValue;

		for (startScan = 0; startScan < (array.length-1); startScan++) {
			maxIndex = startScan;
			maxValue = array[startScan];
			for(index = startScan + 1; index < array.length; index++) {
				if (array[index] > maxValue) {
					maxValue = array[index];
					maxIndex = index;
				}
			}
			array[maxIndex] = array[startScan];
			array[startScan] = maxValue;
			}
		}
	}
