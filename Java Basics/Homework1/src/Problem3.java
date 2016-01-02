import java.util.Scanner;

/*
 * Въведете 2 различни числа от конзолата и разменете стойността им.
 * Разпечатайте новите стойности
*/



public class Problem3 {
	public static void main(String[] args) {
		
		//read 2 different numbers from the console
		int number1, number2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		number1 = sc.nextInt();
		System.out.print("Enter the second number: ");
		number2 = sc.nextInt();
		
		//check if the numbers are equal. if they are equal read them again.
		if (number1 == number2) {
			System.out.println("Please enter differnet numbers");
			System.out.print("Enter the first number: ");
			number1 = sc.nextInt();
			System.out.print("Enter the second number: ");
			number2 = sc.nextInt();
		}
		sc.close();

		//swap their values
		int temp;
		temp = number1;
		number1 = number2;
		number2 = temp;

		//print the new values
		System.out.println("The first number is: " + number1);
		System.out.println("The second number is: " + number2);
	}
}
