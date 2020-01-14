package edu.wit.cs.comp1050;


import java.util.Scanner;


/**
 * Here is where I solve PA1-d
 * 
 * @author turnerj8
 */
public class PA1d {
	
	
	/**
	 * Error message to display for negative amount 
	 */
	public static final String ERR_MSG = "The package cannot be shipped!";
	
	
	/**
	 * Method to compute shipping cost
	 * 
	 * @param weight, assumed to be in (0, 20]
	 * @return cost to ship
	 */
	public static double shippingCost(double weight) {
		
		if (weight <= 1 && weight > 0) {
			return 3.5;
		} else if (weight > 1 && weight <= 3) {
			return 5.5;
		} else if (weight > 3 && weight <=10) {
			return 8.5;
		} else {
			return 10.5;
		}
	}

	
	/**
	 * The main function is where I take input and apply my shippingCost() method to
	 * print to the screen the price it will cost to ship the item
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		/**
		 * Declare and/or initialize all necessary objects and variables
		 * 
		 * Prompt the user to provide a weight input
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter package weight: ");
		double packageWeight = scanner.nextDouble();
		
		
		/**
		 * Runs the shippingCost() method on the inputed package weight
		 * 
		 * Prints the cost to ship the package given the item's weight to the console
		 */
		if (packageWeight > 0 && packageWeight <= 20) {
			System.out.printf("It will cost $%.2f to ship this package.%n", shippingCost(packageWeight));
		} else {
			System.out.println(ERR_MSG);
		}
	}

	
}
