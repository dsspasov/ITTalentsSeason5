import java.util.Scanner;

/*
 * Да се състави програма, която чете от конзолата 4-цифренo
 * естествено число от интервала [1000.. 9999]. От това число се
 * формират 2 нови 2-цифрени числа. Първото число се формира от 1-та
 * и 4-та цифра на въведеното число. Второто число се формира от 2-рa -
 * 3-та цифра на въведеното число. Като резултат да се изведе дали 1-то
 * ново число e по-малко <, равно = или по-голямо от 2-то число.
 * Пример: 3332 Изход: по-малко (32<33)
 * Пример: 1144 Изход: равни (14=14)
 * Пример: 9875 Изход: по-голямо (95>87)
 */
public class Problem8 {

	public static void main(String[] args) {
		// read a number
		short number;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = input.nextShort();
		input.close();

		// check if it is between 1000 and 9999
		if (number < 1000 || number > 9999) {
			System.out.println("Sorry! Wrong input!");
		} else {
			// get the digits of the number
			byte digit1, digit2, digit3, digit4;
			digit1 = (byte) (number / 1000);
			digit2 = (byte) ((number / 100) % 10);
			digit3 = (byte) ((number / 10) % 10);
			digit4 = (byte) (number % 10);

			// make two new numbers
			byte newNumber1 = (byte) (digit1 * 10 + digit4);
			byte newNumber2 = (byte) (digit2 * 10 + digit3);

			// check if the new numbers are <, =, >
			if (newNumber1 > newNumber2) {
				System.out.println("по-голямо: (" + newNumber1 + ">" + newNumber2 + ")");
			} else if (newNumber1 < newNumber2) {
				System.out.println("по-малко: (" + newNumber1 + "<" + newNumber2 + ")");
			} else {
				System.out.println("равни: (" + newNumber1 + "=" + newNumber2 + ")");
			}
		}
	}
}
