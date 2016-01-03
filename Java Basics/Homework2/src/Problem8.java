import java.util.Scanner;

/* По зададено число n, да се изведе на екрана таблица по
 следния начин:
Въведете n:		Въведете n:
1				2
0				11
				33

Въведете n:		Въведете n:
3				4
222				3333
444				5555
666				7777
				9999
 */
public class Problem8 {
	public static void main(String[] args) {
		
		//read a number from the console
		int n;
		Scanner input = new Scanner(System.in);
		do {
			System.out.print("Enter a number: ");
			n = input.nextInt();
		} while (n <= 0);
		input.close();
		
		//print the table
		// i is the number of line
		// j is the number of column
		// number is the value of each cell in the table
		// number starts from n - 1 and increases its value with 2 on each iteration
		for(int i = 1, number = n-1; i<=n; i++, number+=2){
			for(int j = 1; j<=n; j++){
				System.out.print(number);
			}
			System.out.println("");
		}

	}
}
