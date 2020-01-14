package edu.wit.cs.comp1050;

import java.util.Scanner;


/**
 * 
 * @author turnerj8
 *
 */
public class PA1b {
	
	
	/**
	 * Error message to display for any non-negative counts 
	 */
	public static final String ERR_MSG = "All coin counts must be non-negative!";

	
	/**
	 * Takes input for quantity of quarters,
	 * dimes,
	 * nickels,
	 * pennies
	 * Calculates the total
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		/**
		 * Takes input and declares all my needed variables
		 */
		int q, d, n, p;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of quarters: ");
		q = scanner.nextInt();
		System.out.print("Enter number of dimes: ");
		d = scanner.nextInt();
		System.out.print("Enter number of nickels: ");
		n = scanner.nextInt();
		System.out.print("Enter number of pennies: ");
		p = scanner.nextInt();
		
		
		/**
		 * Check to make sure that there is no error with the given input
		 * and print the total amount of money to the console
		 *
		 */
		if (q < 0 || d < 0 || n < 0 || p < 0) {
			System.out.println(ERR_MSG);
		} else {
			double total = 0;
			total = ((q*.25) + (d*.10) + (n*.05) + (p*.01));
			System.out.printf("You have $%.2f in coins.%n", total);
		}	
	}

	
}
