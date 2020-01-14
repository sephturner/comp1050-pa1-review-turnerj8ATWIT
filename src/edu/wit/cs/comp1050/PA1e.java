package edu.wit.cs.comp1050;


import java.util.Scanner;


/**
 * I solve part e here!
 * 
 * @author turnerj8
 */
public class PA1e {
	
	
	/**
	 * Counts the number of upper case characters within the supplied string
	 * 
	 * @param s input string
	 * @return number of upper case characters
	 */
	public static int numUpperCase(String s) {
		int upperCase = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
				upperCase += 1;
			}
		}
		return upperCase;
	}

	
	/**
	 * The main function takes the string input from the user and prints
	 * the total number of upper case letters used in said string input
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		/**
		 * Declare and.or initialize necessary variables
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String inputString = scanner.nextLine();
		int upperCaseCount = numUpperCase(inputString);
		if (upperCaseCount == 0) {
			System.out.printf("There are no uppercase characters.%n");
		} else if (upperCaseCount == 1) {
			System.out.printf("There is 1 uppercase character in the string.%n");
		} else {
			System.out.printf("There are %d uppercase characters in the string.%n", upperCaseCount);
		}
	}

	
}
