/**
 * 
 */
package lotto;

import java.util.Scanner;
import java.util.Random;

/**
 * Class that will replicate a lottery system, each week we will add features
 * based on our continued learning. So far it allows a user to pick 6 numbers
 * and randomly generates 6 winning numbers. It can check a whether a user's
 * number is a winner or not. A win counter counts the number of winning balls
 * and outputs a response based on this.
 * 
 * Next step is to split the program into functional methods.
 * 
 * @author ccase
 *
 */
public class LottoChecker {

	// Highest Ball number allowed
	public static final int MAX_NUMBER = 38;

	/**
	 * This method stores a user's favourite 6 lottery numbers along with a record
	 * of the winning numbers and prints both to screen. Start point of the
	 * application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// declare variables for userNumbers and winningNumbers

		int userNum1, userNum2, userNum3, userNum4, userNum5, userNum6;
		int winner1, winner2, winner3, winner4, winner5, winner6, winCount;

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		winner1 = random.nextInt(MAX_NUMBER) + 1;
		winner2 = random.nextInt(MAX_NUMBER) + 1;
		winner3 = random.nextInt(MAX_NUMBER) + 1;
		winner4 = random.nextInt(MAX_NUMBER) + 1;
		winner5 = random.nextInt(MAX_NUMBER) + 1;
		winner6 = random.nextInt(MAX_NUMBER) + 1;

		// print to screen the player's numbers and the winning numbers
		System.out.println("Lotto Checker ......");

		// user input for selection of balls

		System.out.println("Select your six numbers (1-38)");

		System.out.println("Enter selection #1:");
		userNum1 = scanner.nextInt();
		while (userNum1 <= 0 || userNum1 > MAX_NUMBER) {
			System.out.println("Please input a valid ball number:");
			userNum1 = scanner.nextInt();
		}

		System.out.println("Enter selection #2:");
		userNum2 = scanner.nextInt();
		while (userNum2 <= 0 || userNum2 > MAX_NUMBER) {
			System.out.println("Please input a valid ball number:");
			userNum2 = scanner.nextInt();
		}

		System.out.println("Enter selection #3:");
		userNum3 = scanner.nextInt();
		while (userNum3 <= 0 || userNum3 > MAX_NUMBER) {
			System.out.println("Please input a valid ball number:");
			userNum3 = scanner.nextInt();
		}

		System.out.println("Enter selection #4:");
		userNum4 = scanner.nextInt();
		while (userNum4 <= 0 || userNum4 > MAX_NUMBER) {
			System.out.println("Please input a valid ball number:");
			userNum4 = scanner.nextInt();
		}

		System.out.println("Enter selection #5:");
		userNum5 = scanner.nextInt();
		while (userNum5 <= 0 || userNum5 > MAX_NUMBER) {
			System.out.println("Please input a valid ball number:");
			userNum5 = scanner.nextInt();
		}

		System.out.println("Enter selection #6:");
		userNum6 = scanner.nextInt();
		while (userNum6 <= 0 || userNum6 > MAX_NUMBER) {
			System.out.println("Please input a valid ball number:");
			userNum6 = scanner.nextInt();
		}

		System.out.println("Your selection ... " + userNum1 + ", " + userNum2 + ", " + userNum3 + ", " + userNum4 + ", "
				+ userNum5 + ", " + userNum6);
		System.out.println("Winning balls " + winner1 + ", " + winner2 + ", " + winner3 + ", " + winner4 + ", "
				+ winner5 + ", " + winner6);

		/**
		 * Alternate method of printing output System.out.printf("Your selections are
		 * ... %s, %s, %s, %s, %s,
		 * %s\n",userNum1,userNum2,userNum3,userNum4,userNum5,userNum6);
		 * System.out.printf("The winning balls are ... %s, %s, %s, %s, %s,
		 * %s",winner1,winner2,winner3,winner4,winner5,winner6);
		 */

		// checking for winning numbers - doing this by checking each user number
		// against the winning numbers

		winCount = 0;

		System.out.println("Checking for winners ...");

		if (userNum1 == winner1 || userNum1 == winner2 || userNum1 == winner3 || userNum1 == winner4
				|| userNum1 == winner5 || userNum1 == winner6) {
			System.out.println("Winner " + userNum1);
			winCount++;
		} else {
			System.out.println(userNum1 + " not a winner!");
		}

		if (userNum2 == winner1 || userNum2 == winner2 || userNum2 == winner3 || userNum2 == winner4
				|| userNum2 == winner5 || userNum2 == winner6) {
			System.out.println("Winner " + userNum2);
			winCount++;
		} else {
			System.out.println(userNum2 + " not a winner!");
		}

		if (userNum3 == winner1 || userNum3 == winner2 || userNum3 == winner3 || userNum3 == winner4
				|| userNum3 == winner5 || userNum3 == winner6) {
			System.out.println("Winner " + userNum3);
			winCount++;
		} else {
			System.out.println(userNum3 + " not a winner!");
		}

		if (userNum4 == winner1 || userNum4 == winner2 || userNum4 == winner3 || userNum4 == winner4
				|| userNum4 == winner5 || userNum4 == winner6) {
			System.out.println("Winner " + userNum4);
			winCount++;
		} else {
			System.out.println(userNum4 + " not a winner!");
		}

		if (userNum5 == winner1 || userNum5 == winner2 || userNum5 == winner3 || userNum5 == winner4
				|| userNum5 == winner5 || userNum5 == winner6) {
			System.out.println("Winner " + userNum5);
			winCount++;
		} else {
			System.out.println(userNum5 + " not a winner!");
		}

		if (userNum6 == winner1 || userNum6 == winner2 || userNum6 == winner3 || userNum6 == winner4
				|| userNum6 == winner5 || userNum6 == winner6) {
			System.out.println("Winner " + userNum6);
			winCount++;
		} else {
			System.out.println(userNum6 + " not a winner!");
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
			System.out.println("Number of winning balls: " + winCount + " Don't give up your job but maybe a holiday");
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
		scanner.close();
	}

}
