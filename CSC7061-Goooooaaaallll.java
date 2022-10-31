/**
 * 
 */
package challenge;

import java.util.Random;
import java.util.Scanner;

/**
 * Class containing a number of methods that simulate a penalty shoot-out game
 * that is playable by a user.
 * 
 * @author CiaranC
 *
 */
public class Goooooaaaallll {
	public static void penaltyTaker(int[] inputArray) {

		Scanner scanner = new Scanner(System.in);
		int userShot;
		int goalCount = 0;
		for (int penalty = 0; penalty < inputArray.length; penalty++) {

			System.out.println("Penalty number : " + (penalty + 1) + " out of " + inputArray.length);

			displayGoals();

			// user input for shot direction
			System.out.println("Select shot ...");
			userShot = scanner.nextInt();

			System.out.print("Placing the ball ... ");
			delay(500);
			System.out.print("Walking back ... ");
			delay(500);
			System.out.print("Run up ...");
			delay(100);
			System.out.print("SHOOT !\n");
			delay(1000);

			if (userShot == inputArray[penalty]) {
				System.err.println("SAVE !\n\n");
			} else {
				System.err.print("GOAL ! ");
				System.out.println("Keeper went to " + inputArray[penalty] + "\n\n");
				goalCount++;
			}
		}
		System.out.println("Goals scored : " + goalCount + "/" + inputArray.length);
		System.out.println(assessPerformance(goalCount));
		scanner.close();
	}

	/**
	 * Uses Thread sleep to add a configurable delay
	 * 
	 * @param millisecs
	 */
	private static void delay(int millisecs) {
		try {
			Thread.sleep(millisecs);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Fills the input array with randomly generated save positions from 1-9
	 * 
	 * @param inputArray input array to be filled
	 */
	public static void fillSavePositions(int[] inputArray) {
		Random random = new Random();
		// randomly generated save positions position
		for (int loop = 0; loop < inputArray.length; loop++) {
			inputArray[loop] = random.nextInt(9) + 1;
		}
	}

	/**
	 * Prints to screen the goals and shooting positions.
	 */
	public static void displayGoals() {
		// draw top of nets
		System.out.print("\t\t_______________________\n");
		// draw sides of nets
		System.out.print("\t\t|  1       2       3  |\n");
		System.out.print("\t\t|  4       5       6  |\n");
		System.out.print("\t\t|  7       8       9  |\n");
		// draw bottom line
		System.out.println("\t_______________________________________\n\n");
		System.out.println("\t\t\t   x\n\n");
	}

	/**
	 * Returns a performance assessment based on the users goal count.
	 * 
	 * @param goalCount the users goal count
	 * @return performance message
	 */
	private static String assessPerformance(int goalCount) {
		String performanceMessage;

		switch (goalCount) {
		case 0:
			performanceMessage = "You have disgraced your country and family!";
			break;
		case 1:
			performanceMessage = "You have disgraced your country and family!";
			break;
		case 2:
			performanceMessage = "Back to training for you!";
			break;
		case 3:
			performanceMessage = "Try using your good foot!";
			break;
		case 4:
			performanceMessage = "Not bad - but not perfect!";
			break;
		case 5:
			performanceMessage = "Fluke and the keeper is not very good anyway!";
			break;
		default:
			performanceMessage = "I don't know what to say about that one";
		}
		return performanceMessage;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] saves = new int[5];

		System.out.println("Game on...");

		fillSavePositions(saves);

		penaltyTaker(saves);

		System.out.println("Thanks for playing...");

	}

}
