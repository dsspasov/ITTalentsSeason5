import java.util.Scanner;

/*
 * Да се изведат съобщения към потребителя и да се прочетат 2 числа от
 * клавиатурата A и B (може да са с плаваща запетая – double).
 * После да се прочете 3-то число C и да се провери дали то е м/у A и B.
 * Да се изведе подходящо съобщение за това дали C е между A и B.
 */
public class Problem1 {
	public static void main(String[] args) {

		// declare A, B and C
		// read A, B and C from console
		double a, b, c;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter A:");
		a = sc.nextDouble();
		System.out.println("Enter B:");
		b = sc.nextDouble();
		System.out.println("Enter C:");
		c = sc.nextDouble();
		sc.close();
		// check if C is between A and B

		if ((a < c && c < b) || (b < c && c < a)) {
			System.out.println("C is between A and B");
		} else {
			System.out.println("C is not between A and B");
		}

	}
}
