/**
 * 
 */
package challenge;

/**
 * Class containing an implementation of the Fizz Buzz programming task.
 * 
 * @author CiaranC
 *
 */
public class FizzBuzz {

	private static final String FIZZ = "Fizz";
	private static final String BUZZ = "Buzz";

	/**
	 * Method implementation of the Fizz Buzz game.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int limit = 100;

		for (int number = 1; number <= limit; number++) {

			if ((number % 3 == 0) && (number % 5 == 0)) {
				System.out.print(FIZZ + " " + BUZZ + ", ");
			} else if (number % 3 == 0) {
				System.out.print(FIZZ + ", ");
			} else if (number % 5 == 0) {
				System.out.print(BUZZ + ", ");
			} else {
				System.out.print(number + ", ");
			}
		}

	}

}
