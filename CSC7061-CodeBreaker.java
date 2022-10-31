/**
 * 
 */
package challenge;

import java.util.Arrays;
import java.util.Scanner;

/**
 * A class containing methods that allow conversion back and forth between human
 * readable String variables and encoded ASCII value integer arrays.
 * 
 * @author CiaranC
 *
 */
public class CodeBreaker {

	/**
	 * This method takes a String variable from the user and encodes it into an
	 * integer array of the corresponding ASCII integers.
	 *
	 * @param inputString a String variable to be converted to ASCII
	 * @return an integer array of the input String's ASCII values
	 */
	public static int[] asciiEncoder(String inputString) {
		int[] asciiResult = new int[inputString.length()];
		for (int loop = 0; loop < inputString.length(); loop++) {
			asciiResult[loop] = (int) inputString.charAt(loop);
		}
		return asciiResult;
	}

	/**
	 * This method takes an integer array of ASCII values and decodes it to a
	 * readable array of characters.
	 * 
	 * @param inputArray integer array to be converted to a readable String
	 * @return a readable array of characters
	 */
	public static char[] asciiDecoder(int[] inputArray) {
		char[] decodedArray = new char[inputArray.length];

		for (int loop = 0; loop < inputArray.length; loop++) {
			decodedArray[loop] = (char) inputArray[loop];
		}
		return decodedArray;
	}

	/**
	 * Program that encodes an input String variable to the corresponding ASCII
	 * value for each character. Invokes a method that is able to decode an integer
	 * array of ASCII values in to a readable String variable.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputString;

		// user input that will be used in the encoding / decoding
		System.out.println("Enter a name to be converted and press enter :");
		inputString = scanner.nextLine();

		// invoking the encoding method
		System.out.print(inputString + " encoded in ASCII is : ");
		int[] codedString = asciiEncoder(inputString);
		System.out.println(Arrays.toString(codedString));

		// invoking the decoding method
		char[] decodedString = asciiDecoder(codedString);
		System.out.print(Arrays.toString(codedString) + " in plain text is : ");
		System.out.println(Arrays.toString(decodedString));

		scanner.close();
	}

}
