/**
 * 
 */
package challenge;

import java.util.Scanner;

/**
 * @author ccase
 *
 */
public class ASCIIConverter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int userChoice;
		String userConvert, userName;
		char userChar;
		Scanner scanner = new Scanner(System.in);

		do {
			// show menu
			System.out.println("ASCII Convertor Menu................");
			System.out.println("1. Show ASCII Table");
			System.out.println("2. Convert a Character to ASCII");
			System.out.println("3. Convert your name to ASCII");
			System.out.println("4. Quit");
			System.out.println("Enter a number and return");
			// get user input
			userChoice = scanner.nextInt();
			scanner.nextLine(); // clears out the return character and allows scanner to be reused

			// process user input
			// show ASCII table
			if (userChoice == 1) {
				System.out.println("ASCII Table ...");
				for (int loop = 32; loop < 128; loop++) {
					System.out.println(loop + "\t" + (char) loop);
				}
				// convert a character to ASCII
			} else if (userChoice == 2) {
				System.out.println("Enter a character to see the ASCII value");
				userConvert = scanner.next();
				while (userConvert.length() > 1) {
					System.out.println("Please only enter one character and try again:");
					userConvert = scanner.next();
				}
				userChar = userConvert.charAt(0);
				System.out.println(userChar + "\t" + (int) userChar);

				// convert your name to ASCII
			} else if (userChoice == 3) {
				System.out.println("Enter your name");
				userName = scanner.nextLine();
				System.out.println("ASCII");
				for (int index = 0; index < userName.length(); index++) {
					if (userName.charAt(index) != ' ') {
						System.out.print((int) userName.charAt(index));
						System.out.println("\t" + userName.charAt(index));
					}
				}
				// Quit application
			} else if (userChoice == 4) {
				System.out.println("Quitting");
			} else {
				System.out.println("Please input a valid option and try again");
			}
		} while (userChoice != 4);

		scanner.close();
	} // end of class

}
