import java.util.Scanner;

/*
 * Да се състави програма, която по въведено
естествено число N от интервала [10..200] извежда в обратен
ред всички числа, които са кратни на 7 и са по-малки от N.
*/
public class Problem14 {
	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		//read a number from the console and check if it is in [10 ... 200]
		do{
			System.out.print("Enter a number: ");
			n = input.nextInt();
		}while(n<10||n>200);
		
		input.close();
		//iterate from n-1(all numbers that are less than or equal to n-1 are less than n) to 1
		//check if the current number can be divided by 7
		for(int i = n-1; i>=1; i--){
			if(i%7 == 0){
				System.out.println(i);
			}
		}	
	}
}
