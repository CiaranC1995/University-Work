/**
 * 
 */
package challenge;

import java.util.Scanner;

/**
 * @author CiaranC
 *
 */
public class SquareMeUp {

	/**
	 * Draws the top or the bottom of the square
	 * 
	 * @param lengthSize length of the side
	 * @param borderChar character to be used in the side
	 */
	public static void drawHorizontal(int lengthSize, char borderChar) {
		for (int loop = 1; loop < lengthSize; loop++) {
			System.out.print(borderChar + "  ");
		}
		System.out.print(borderChar);
		System.out.println();
	}

	/**
	 * Draws the sides of the square
	 * 
	 * @param lengthSize length of the side
	 * @param borderChar character to be used in the side
	 */
	public static void drawSides(int lengthSize, char borderChar) {
		for (int charLoop = 1; charLoop < (lengthSize - 1); charLoop++) {
			System.out.print(borderChar + "  ");
			for (int spaceLoop = 1; spaceLoop < (lengthSize - 1); spaceLoop++) {
				System.out.print("   ");
			}
			System.out.print(borderChar);
			System.out.println();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char borderChar;
		int lengthSize;
		Scanner scanner = new Scanner(System.in);

		// get size of box from user
		System.out.println("Enter the length of your sqaure :");
		lengthSize = scanner.nextInt();
		scanner.nextLine();
		// get char for border from user
		System.out.println("Enter the character your square will be made from : ");
		borderChar = scanner.nextLine().charAt(0);

		// drawing top
		drawHorizontal(lengthSize, borderChar);
		// draw sides of box
		drawSides(lengthSize, borderChar);
		// draw bottom
		drawHorizontal(lengthSize, borderChar);

		scanner.close();
	}

}
