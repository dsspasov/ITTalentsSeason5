import java.util.Scanner;

/*
 * Въведете 2 различни числа от конзолата и ги разпечатайте в
 * нарастващ ред.*/
public class Problem4 {
	public static void main(String[] args) {

		// read 2 numbers
		int number1, number2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		number1 = sc.nextInt();
		System.out.print("Enter the seconde number: ");
		number2 = sc.nextInt();
		sc.close();
		// check if they are different
		if (number1 == number2) {
			System.out.println("Sorry!Wrong input!");
		} else {
			// print them in ascending order
			if (number1 > number2) {
				System.out.println(number2 + " " + number1);
			} else {
				System.out.println(number1 + " " + number2);
			}
		}

	}

}
