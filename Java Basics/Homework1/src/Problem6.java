import java.util.Scanner;

/*
 * Въведете 3 числа от клавиатурата а1, а2 и а3. Разменете стойностите
 * им така, че а1 да има стойността на а2, а2 да има стойността на а3, а
 * а3 да има старата стойност на а1.
 */
public class Problem6 {
	public static void main(String[] args) {
		// read 3 numbers from the console

		int a1, a2, a3;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a1:");
		a1 = input.nextInt();
		System.out.print("Enter a2:");
		a2 = input.nextInt();
		System.out.print("Enter a3:");
		a3 = input.nextInt();

		input.close();

		// swap the values of the variables like this:
		// a1=a2; a2=a3; a3=a1;

		// temporal variable
		int temp = a1;
		a1 = a2;
		a2 = a3;
		a3 = temp;

		// print the result
		System.out.println(a1 + ", " + a2 + ", " + a3);
	}

}
