import java.util.Scanner;

/*Започвайки от 3, да се изведат на екрана първите n
 числа които се делят на 3. Числата да са разделени със запетая.
 */
public class Problem7 {
	public static void main(String[] args) {
		//read a number from the console and check if its value is greater than 0
		int n;
		Scanner input = new Scanner(System.in);
		do {
			System.out.print("Enter a number: ");

			n = input.nextInt();
		} while (n <= 0);
		input.close();
		//start from 3 and print the first n numbers that can be divided by 3
		int i = 3;
		//counter variable counts the first n numbers
		//and for each number i gets the next number divided by 3
		for (int counter = 1; counter <= n; counter++, i += 3) {
			//print the number divided by 3
			if(counter == n){
				System.out.print(i);
				break;
			}
			System.out.print(i + ", ");
		}
		
	}
}
