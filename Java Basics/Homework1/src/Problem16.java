import java.util.Scanner;

/*
 * Задача 16:
 * Въведено е трицифрено естествено число от вида abc.
 * Трябва да се провери дали:
 * ако a = b = c - Изход: цифрите са равни;
 * ако a>b>c - Изход: цифрите са в низходящ ред;
 * ако a<b<c цифрите са във възходящ ред;
 * и изход: цифрите са ненаредени, за неописаните случаи.
 * Да се състави програма, която извежда резултата от проверката за
 * наредба на цифрите в числото.
 * Пример: 345
 * Изход: възходящ ред.*/

public class Problem16 {
	public static void main(String[] args) {
		// read a number from the console
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		short number = input.nextShort();

		input.close();
		//check if number is three-digit number
		if (number < 100 || number > 999) {
			System.out.println("Sorry! Wrong input");
		} else {
			// get the digits of the number
			byte digit1, digit2, digit3;
			digit1 = (byte) (number / 100); // a
			digit2 = (byte) ((number / 10) % 10); // b
			digit3 = (byte) (number % 10); // c
			// check if the digits are equal
			if (digit1 == digit2 && digit2 == digit3) {
				System.out.println("Цифрите са равни");
			} else if (digit1 < digit2 && digit2 < digit3) {
				// check if the digits are in ascending order
				System.out.println("цифрите са във възходящ ред");
			} else if (digit1 > digit2 && digit2 > digit3) {
				// check if the digits are in descending order
				System.out.println("цифрите са в низходящ ред");
			} else {
				System.out.println("цифрите са ненаредени");
			}
		}
	}
}
