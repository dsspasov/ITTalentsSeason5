import java.util.Scanner;

/*
 * Въведете 3 различни числа от конзолата и ги разпечатайте в низходящ
 * ред.
 */

public class Problem5 {
	public static void main(String[] args) {

		// read 3 numbers

		int number1, number2, number3;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		number1 = input.nextInt();
		System.out.print("Enter the second number: ");
		number2 = input.nextInt();
		System.out.print("Enter the third number: ");
		number3 = input.nextInt();

		input.close();

		// check if numbers are different
		if (number1 == number2 || number1 == number3 || number2 == number3) {
			System.out.println("Sorry! Wrong input!");
		} else {
			// print the numbers in descending order
			if (number1 > number2 && number1 > number3) {
				if (number2 > number3) {
					// number1>number2>number3
					System.out.println(number1 + " " + number2 + " " + number3);
				} else {
					// number1>number3>number2
					System.out.println(number1 + " " + number3 + " " + number2);
				}
			} else if (number2 > number1 && number2 > number3) {
				if (number1 > number3) {
					// number2>number1>number3
					System.out.println(number2 + " " + number1 + " " + number3);
				} else {
					// number2>number3>number1
					System.out.println(number2 + " " + number3 + " " + number1);
				}
			} else {
				if (number1 > number2) {
					// number3>number1>number2
					System.out.println(number3 + " " + number1 + " " + number2);
				} else {
					// number3>number2>number1
					System.out.println(number3 + " " + number2 + " " + number1);
				}
			}
		}
	}
}
