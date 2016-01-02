import java.util.Scanner;

/*Въведете 2 различни целочислени числа от конзолата. Запишете
 тяхната сума, разлика, произведение, остатък от деление и
 целочислено деление в отделни променливи и разпечатайте тези
 резултати в конзолата. Опитайте същото с числа с плаваща запетая.*/

public class Problem2 {
	public static void main(String[] args) {

		// read 2 integers from console
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A: ");
		a = sc.nextInt();
		System.out.print("Enter B: ");
		b = sc.nextInt();
		sc.close();

		// calculate the sum, difference, product, remainder, quotient
		int sum = a + b;
		int difference = a - b;
		int product = a * b;
		int remainder = 0, quotient = 0;
		if (b == 0) {
			System.out.println("Sorry! Can't divide by 0");
		} else {
			remainder = a % b;
			quotient = a / b;
		}

		// print the results
		System.out.println("Sum: " + sum + "\n" + "Difference: " + difference
				+ "\n" + "Product: " + product);
		System.out.println("Remainder: " + remainder + "\n" + "Quotient: "
				+ quotient);

		
		
		/*double a1, b1;
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter A: ");
		a1 = sc1.nextDouble();
		System.out.print("Enter B: ");
		b1 = sc1.nextDouble();
		sc1.close();

		// calculate the sum, difference, product, remainder, quotient
		double sum1 = a1 + b1;
		double difference1 = a1 - b1;
		double product1 = a1 * b1;
		double remainder1 = 0, quotient1 = 0;
		if (b1 == 0) {
			System.out.println("Sorry! Can't divide by 0");
		} else {
			remainder1 = a1 % b1;
			quotient1 = a1 / b1;
		}

		// print the variables
		System.out.println("Sum: " + sum1 + "\n" + "Difference: " + difference1
				+ "\n" + "Product: " + product1);
		System.out.println("Remainder: " + remainder1 + "\n" + "Quotient: "
				+ quotient1);
		*/
		
	}
}
