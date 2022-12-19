/**
 * 
 */
package challenge;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Program that will prompt a user for a password and check if their input is
 * found in a list of generic passwords called rockyou.txt.
 * 
 * @author CiaránC
 *
 */
public class DictionaryAttack {

	/**
	 * Main method, beginning of the program.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String userPassword, line;
		boolean passwordFound = false;
		File file = new File("rockyou.txt");

		// prompt user for a password
		System.out.println("Password Checker");

		System.out.println("Enter a password to check for common usage...");
		userPassword = scanner.nextLine();

		System.out.println("Ok, let's check that one");

		// read in contents of file
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			line = bufferedReader.readLine();

			while (line != null && !passwordFound) {
				if (line.equals(userPassword)) {
					passwordFound = true;
				}
				line = bufferedReader.readLine();
			}
			fileReader.close();
			bufferedReader.close();
			scanner.close();

		} catch (FileNotFoundException fileNotFoundException) {
			System.out.println("Sorry, can't find the file");
			fileNotFoundException.printStackTrace();
		} catch (IOException ioException) {
			System.out.println("Sorry, problem reading the file");
			ioException.printStackTrace();
		} catch (Exception exception) {
			System.out.println("That is cataclysmic, I cannot fix that.");
			exception.printStackTrace();
		}

		// check if the user's input is found in the file
		if (passwordFound) {
			System.out.println("Weak Password ! Try another");
		} else {
			System.out.println("Password not found.. Could be a good one to use..");
		}
	}

}
