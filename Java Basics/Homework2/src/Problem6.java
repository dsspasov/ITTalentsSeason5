import java.util.Scanner;

/* Да се прочете число от екрана(конзолата) и да се
 изведе сбора на всички числа между 1 и въведеното число.
 */
public class Problem6 {
	public static void main(String[] args) {
		int number;
		//read a number from the console and check if its value is greater than 0
		Scanner input = new Scanner(System.in);
		do {
			System.out.print("Enter a number: ");
			number = input.nextInt();
		} while (number <= 0);

		input.close();
		
		int sum=0;
		//iterate from 1 to the number and sum all values
		for(int i = 1; i<=number; i++){
			sum+=i;
		}
		
		System.out.println("The sum is " + sum);
		
		
	}
}
