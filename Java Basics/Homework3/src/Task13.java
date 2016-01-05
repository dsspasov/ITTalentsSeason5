import java.util.Scanner;

/*Да се състави програма, чрез която се въвежда число и се представя
 като число в двоична бройна система.
 Програмата, чрез масив, да изчислява последователно всички цифри
 на въведеното естествено число в 2-ична бройна система.
 Пример: 99
 Изход: 1100011*/
public class Task13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		// read a number from the console
		System.out.print("Enter a number: ");
		number = input.nextInt();
		input.close();

		// counts the number of bits in user's number
		int bits = 0;
		int n = number;
		while (n > 0) {
			n = n >> 1;
			bits++;
		}

		// create an array for binary format of the number with size = number of
		// bits
		int[] binaryNumber = new int[bits];
		int index = 0;
		while (number > 0) {
			binaryNumber[bits - 1 - index] = number % 2;
			number = number / 2;
			index++;
		}

		// print the result
		System.out.print("Result:");
		if (bits == 0) {
			System.out.println("0");
		} else {
			for (int i = 0; i < binaryNumber.length; i++) {
				System.out.print(binaryNumber[i]);
			}
		}
	}
}
