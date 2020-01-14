package edu.wit.cs.comp1050;


import java.util.Scanner;
import java.lang.Math;


/**
 * Part c solution
 *
 * @author turnerj8
 */
public class PA1c {
	
	
	/**
	 * Error message to display for negative amount 
	 */
	public static final String ERR_MSG = "Dollar amount must be non-negative!";
	
	
	/**
	 * Method to convert a double to
	 * an integer
	 * 
	 * @param num number to convert
	 * @return converted value
	 */
	public static int convertToInt(double num) {
		return (int) Math.round(num);
	}

	
	/**
	 * Main will do all the calculations and take any input
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		/**
		 * declare and initialize important variables and the scanner
		 * 
		 * take input of the amount of money and turn it into an integer to
		 * make it easier to work with (just multiply all of our constants by 100)
		 */
		int q = 0, d = 0, n = 0, p = 0, intPrice;
		double price;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter total amount: $");
		price = (scanner.nextDouble());
		intPrice = convertToInt((price*100));
		
		
		/**
		 * convert the total amount of money to quarters, dimes, nickels, and then pennies
		 * 
		 * only carry out this process if there is a valid amount of money entered
		 * 
		 * mod is used to find the remaining money after accounting for a certain coin
		 * ex: 27 cents has a quarter and 2 CENTS LEFT OVER --> reassign the price to be
		 * that new modded number
		 */
		if (price < 0) {
			System.out.println(ERR_MSG);
		} else {
			q = (intPrice/(25));
			intPrice = intPrice % (25);
			d = (intPrice/(10));
			intPrice = intPrice % (10);
			n = (intPrice/(5));
			intPrice = intPrice % (5);
			p = intPrice;
			
			
			/**
			 * create variables to make sure I reference singulars and plurals correctly
			 * and prints the value of each of the coin counts
			 */
			String qs, ds, ns, ps;
			if (q == 1) {
				qs = "quarter";
			}
			else {
				qs = "quarters";
			}
			if (d == 1) {
				ds = "dime";
			}
			else {
				ds = "dimes";
			}
			if (n == 1) {
				ns = "nickel";
			}
			else {
				ns = "nickels";
			}
			if (p == 1) {
				ps = "penny";
			}
			else {
				ps = "pennies";
			}
			System.out.printf("You have %d %s, %d %s, %d %s, and %d %s.%n", q, qs, d, ds, n, ns, p, ps);	
		}
	}

	
}
