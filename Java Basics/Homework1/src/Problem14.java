import java.util.Scanner;

/*
 * Да се състави програма, която по въведени координати на 2 позиции
 * от шахматната дъска извежда отговор дали са оцветени в еднакъв или
 * различен цвят.Шахматната дъска е квадратна.
 * Въвеждат се две двойки числа от интервала [1..8]
 * */
public class Problem14 {
	public static void main(String[] args) {

		// read the coordinates of two fields
		byte row1, row2, col1, col2;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter row1:");
		row1 = input.nextByte();
		System.out.print("Enter col1:");
		col1 = input.nextByte();
		System.out.print("Enter row2:");
		row2 = input.nextByte();
		System.out.print("Enter col2:");
		col2 = input.nextByte();

		input.close();

		// check if the coordinates are correct
		if (row1 < 1 || row1 > 8 || row2 < 1 || row2 > 8 || col1 < 1 || col1 > 8 || col2 < 1 || col2 > 8) {
			System.out.println("Sorry! Wrong input");
		} else {
			// if the subtractions of rows and the subtraction of cols are both even
			// or the subtractions of rows and the subtraction of cols are both odd
			// then the fields are with the same color
			if (((row1 - row2) % 2 == 0 && (col1 - col2) % 2 == 0) || ((row1 - row2) % 2 != 0 && (col1 - col2) % 2 != 0)) {
				System.out.println("same color");
			} else {
				System.out.println("different color");
			}
		}
	}
}
