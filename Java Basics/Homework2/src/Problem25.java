import java.util.Scanner;

/*
Да се направи програма, която по дадено число N, да изчислява
N!, т.е. 1*2*3*4...*N.
Пример: 5
Изход: 120
Използвайте цикъл do-while. 
*/
public class Problem25 {
	public static void main(String[] args) {
		
		int n;
		Scanner input = new Scanner(System.in);
		//read a positive number from the console
		do{
			System.out.print("Enter a number: ");
			n = input.nextInt();
		}while(n<=0);
		
		input.close();
		
		//calculate the factorial
		int fact = 1;
		int i = 1;
		do{
			fact *=i;
			i++;
		}while(i<=n);
		
		//print the result
		System.out.println(fact);
	}
}
