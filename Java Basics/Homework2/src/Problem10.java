import java.util.Scanner;
/*Въведете число от клавиатурата и определете дали е
просто. Просто число е това което се дели САМО на 1 и на себе
си.
*/
public class Problem10 {
	public static void main(String[] args) {
		int number;
		//read a number from the console
		Scanner input = new Scanner(System.in);

		do {
			System.out.print("Enter a number: ");
			number = input.nextInt();
		} while (number <= 0);

		input.close();

		//check if number can be divided by the numbers from 2 to number-1
		//if it can be divided by at least one of them then break the loop
		//the number is not prime.
		boolean flag = true;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				flag = false;
				break;
			}
		}
		//print if number is prime or is not prime
		if (flag) {
			System.out.println(number + " is prime");
		} else {
			System.out.println(number + " is not prime");
		}

	}
}
