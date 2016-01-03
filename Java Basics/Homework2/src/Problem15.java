import java.util.Scanner;

/*
 *  Да се състави програма, която да изчисли сумата на
всички числа от 1 до въведено число N.
Пример: 5
Изход: 15
Използвайте цикъл do-while.
*/
public class Problem15 {
	public static void main(String[] args) {
		
		int n;
		Scanner input = new Scanner(System.in);
		//read a number from the console and check if it is greater than 0
		do{
			System.out.print("Enter a number: ");
			n = input.nextInt();
		}while(n<=0);
		
		input.close();
		//iterate from n to 1 and add current number to the sum
		int sum = 0;
		do{
			sum+=n;
			n--;
		}while(n>0);
		
		//print the result
		System.out.println("The sum is "+sum);
	}
}
