package com.ontariotechu.sofe3980U;

import java.util.Scanner;

import org.joda.time.LocalTime;

/**
 * Hello world!
 *
 */
public class App {
	/**
	 * Main program: The entry point of the program. The local time will be printed
	 * first,
	 * Then it will create two binary variables, add them and print the result.
	 *
	 * @param args: not used
	 */
	public static void main(String[] args) {
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first binary number:");
		Binary binary1 = new Binary(scanner.nextLine());

		System.out.println("Enter the second binary number:");
		Binary binary2 = new Binary(scanner.nextLine());

		System.out.println("First binary number: " + binary1.getValue());
		System.out.println("Second binary number: " + binary2.getValue());

		Binary sum = Binary.add(binary1, binary2);
		System.out.println("The sum of the two binary values is: " + sum.getValue());

		Binary orResult = binary1.OR(binary1, binary2);
		System.out.println("The OR of the two binary values is: " + orResult.getValue());

		Binary andResult = binary1.AND(binary1, binary2);
		System.out.println("The AND of the two binary values is: " + andResult.getValue());

		Binary multiplyResult = Binary.Multiply(binary1, binary2);
		System.out.println("The product of the values is: " + multiplyResult.getValue());

		scanner.close();

	}
}
