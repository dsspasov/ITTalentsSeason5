import java.util.Scanner;

/*Да се прочете масив и да се намери най-малкото число кратно на
 3 от масива.

 10, 3, 5, 8, 6, -3, 7
 Най-малкото число кратно на 3 е -3
 */
public class Task1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		// read the size of an array from console
		do {
			System.out.print("enter a number for array's length: ");
			n = input.nextInt();
		} while (n < 1);
		// declare an array with size n
		int[] array = new int[n];

		// read n number from console and fill the array
		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter a number: ");
			array[i] = input.nextInt();
		}

		input.close();

		int min = 0;
		boolean isFound = false;
		// get the minimal element that can be divided by 3
		for (int i = 0; i < array.length; i++) {
			// check if current element in the array can be divided by 3 and is
			if (array[i] % 3 == 0) {
				// check if min is ziro or min is greater than current element
				// in the array.
				if (!isFound) {
					//the first element that can be divided by 3
					min = array[i];
					isFound = true;
				} else if (min > array[i]) {
					//min element that can be divided by 3
					min = array[i];
				}
			}
		}
		if (!isFound) {
			System.out.println("няма число, което да се дели на 3");
		} else {
			System.out.println("Най-малкото число кратно на 3 е: " + min);
		}
	}
}
