/**
 * 
 */
package challenge;

import java.util.Random;
import java.util.Scanner;

/**
 * Here is a simulation of a magic 8 ball. The program asks the user a question
 * and outputs a random response to the console.
 * 
 * @author ccase
 *
 */
public class MagicEightBall {

	/**
	 * Beginning of the application. Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// declare vars (userQuestion, randomNumber, ballResponse)
		int randomNumber;
		String userQuestion, ballResponse;

		ballResponse = "";
		// instantiate scanner & random
		Scanner userScanner = new Scanner(System.in);
		Random randNumber = new Random();

		// prompt user for question
		System.out.println("What's your question ?");
		userQuestion = userScanner.nextLine();

		// read and print question back to user
		System.out.println("You want to know ...");
		System.out.println(userQuestion);

		// output a randomly generated response
		randomNumber = randNumber.nextInt(8);
		randomNumber += 1;

		switch (randomNumber) {
		case 1:
			ballResponse = "As I see it, yes.";
			break;
		case 2:
			ballResponse = "Ask again later.";
			break;
		case 3:
			ballResponse = "Better not tell you now.";
			break;
		case 4:
			ballResponse = "Cannot predict now.";
			break;
		case 5:
			ballResponse = "Concentrate and ask again.";
			break;
		case 6:
			ballResponse = "Don't count on it.";
			break;
		case 7:
			ballResponse = "It is certain.";
			break;
		case 8:
			ballResponse = "It is decidedly so.";
			break;
		default:
			ballResponse = "Error 404: Response not found.";
			break;
		}

		System.out.println(ballResponse);

		userScanner.close();

	} // end of main method
} // end of class
