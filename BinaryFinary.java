/**
 * 
 */
package challenge;

/**
 * Class that contains methods that allow conversion from any array of boolean
 * values to the corresponding decimal value.
 * 
 * @author CiaranC
 *
 */
public class BinaryFinary {

	/**
	 * Demonstrates the implementation of two methods, both take any array of
	 * boolean values as an argument, one prints to the console the binary
	 * representation and another prints the decimal representation.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		boolean[] inputBooleanArray = { true, false, false, true, false, true, false, true };

		// prints the binary representation
		displayArrayAsBinary(inputBooleanArray);

		// prints the decimal representation
		System.out.println(convertToDecimal(inputBooleanArray));

	}

	/**
	 * Method that takes any array of boolean values and prints the corresponding
	 * binary representation to the console.
	 * 
	 * @param inputArray input array of boolean values
	 */
	public static void displayArrayAsBinary(boolean[] inputArray) {
		int boolTrue = 1;
		int boolFalse = 0;

		System.out.print("In binary representation :	");
		for (int loop = 0; loop < inputArray.length; loop++) {
			if (inputArray[loop] == true) {
				System.out.print(boolTrue + " ");
			} else if (inputArray[loop] == false) {
				System.out.print(boolFalse + " ");
			}
		}
		System.out.println();
	}

	/**
	 * Method that takes any array of boolean values and returns the corresponding
	 * decimal representation.
	 * 
	 * @param binaryArray input array of boolean values
	 * @return decimal representation
	 */
	public static int convertToDecimal(boolean[] binaryArray) {
		int decimal = 0;
		
		System.out.print("In decimal representation :	");
		// iterating from right to left (least significant bit to most significant)
		for (int bitPosition = binaryArray.length - 1; bitPosition >= 0; bitPosition--) {
			if (binaryArray[bitPosition]) {

				// Calculates the decimal value of the corresponding bit
				decimal += Math.pow(2, binaryArray.length - bitPosition - 1);
			}
		}
		return decimal;
	}

}
