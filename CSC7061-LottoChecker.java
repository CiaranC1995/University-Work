/**
 * 
 */
package lotto;

import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;

/**
 * Class that will replicate a lottery system, each week we will add features
 * based on our continued learning. So far it allows a user to pick 6 numbers
 * and randomly generates 6 winning numbers. It can check a whether a user's
 * number is a winner or not. A win counter counts the number of winning balls
 * and outputs a response based on this.
 * 
 * Includes a try catch exception handler for InputMismatchExceptions.
 * 
 * 
 * @author CiaranC
 *
 */
public class LottoChecker {

	// Highest Ball number allowed
	public static final int MAX_NUMBER = 38;

	public static final int MAX_NUMBER_OF_BALLS_IN_DRAW = 6;

	/**
	 * This method stores a user's favourite 6 lottery numbers along with a record
	 * of the winning numbers and prints both to screen. Start point of the
	 * application.
	 * 
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// declare variables for userNumbers and winningNumbers

		int[] userNums = new int[MAX_NUMBER_OF_BALLS_IN_DRAW];
		int[] winningNums = new int[MAX_NUMBER_OF_BALLS_IN_DRAW];
		int winCount = 0;
		boolean complete = false;

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		// dynamically populating winning number integer array
		for (int loop = 0; loop < winningNums.length; loop++) {
			winningNums[loop] = random.nextInt(MAX_NUMBER) + 1;
		}

		// sorting winning numbers, better for UX
		Arrays.sort(winningNums);

		do {
			try {
				// print to screen the player's numbers and the winning numbers
				System.out.println("Lotto Checker ......");

				// user input for selection of balls

				System.out.println("Select your six numbers (1-" + MAX_NUMBER + ")");

				for (int loop = 0; loop < userNums.length; loop++) {
					System.out.println("Enter Selection #" + (loop + 1) + ":");
					userNums[loop] = scanner.nextInt();

					while (userNums[loop] <= 0 || userNums[loop] > MAX_NUMBER) {
						System.out.println("Please input a valid ball number:");
						userNums[loop] = scanner.nextInt();
					}
				}

				Arrays.sort(userNums);

				System.out.print("Your selection ... ");
				printIntegerArray(userNums);

				System.out.print("Winning balls ");
				printIntegerArray(winningNums);

				// checking for winning numbers - doing this by checking each user number
				// against the winning numbers

				System.out.println("Checking for winners ...");

				// Nested for loops to check if there are any winning numbers
				for (int userSelection : userNums) {
					for (int winner : winningNums) {
						if (userSelection == winner) {
							winCount++;
							System.out.println("A winner  : " + userSelection);
							break;
						}
					}
				}

				System.out.println("\nOverall result");

				switch (winCount) {
				case 0:
					System.out.println("Number of winning balls: " + winCount + " No luck at all!");
					break;
				case 1:
				case 2:
					System.out.println("Number of winning balls: " + winCount + " Not bad");
					break;
				case 3:
					System.out.println("Number of winning balls: " + winCount + " Good, maybe a trip to the shops");
					break;
				case 4:
					System.out.println(
							"Number of winning balls: " + winCount + " Don't give up your job but maybe a holiday");
					break;
				case 5:
					System.out.println("Number of winning balls: " + winCount + " Pay your uni fees");
					break;
				case 6:
					System.out.println("Number of winning balls: " + winCount + " Hand in the notice .....");
					break;
				default:
					System.out.println("Error");
					break;
				}
				complete = true;
				scanner.close();

			} catch (InputMismatchException inputMismatchException) {
				System.out.println("Incorrect Input - Please try that again");
				scanner.next();
				complete = false;
			}
		} while (!complete);

	} // end of main

	/**
	 * Prints to screen the elements of any integer array.
	 * 
	 * @param inputIntegerArray - input integer array
	 */
	public static void printIntegerArray(int[] inputIntegerArray) {

		for (int loop = 0; loop < inputIntegerArray.length; loop++) {
			System.out.print(inputIntegerArray[loop] + " ");
		}
		System.out.println();
	}

} // end of class
