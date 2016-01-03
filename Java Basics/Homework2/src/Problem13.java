import java.util.Scanner;

/* Да се състави програма, която извежда всички
 естествени трицифрени числа, които имат сбор на цифрите равен
 на дадено число.
 Дадено : sum, където 2>=sum<=27.
 Пример: 26
 Изход: 899, 989, 998.*/

public class Problem13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum;
		// read a number(sum) from the console and check if it is in [2 .. 27]
		do {
			System.out.print("Enter a number: ");
			sum = input.nextInt();
		} while (sum < 2 || sum > 27);

		input.close();
		
		//find the biggest number with sum of digits equal to user's sum
		int max = 1000;
		while(max>=100){
			if((max/100) + ((max/10)%10)+(max%10) == sum){
				break;
			}
			max--;
		}
		// iterate through all three-digit numbers from 100 to max
		// and check if the sum of their digits is equal to user's number(sum)
		for (int i = 100; i <= max; i++) {
			int digit1 = i / 100;
			int digit2 = ((i / 10) % 10);
			int digit3 = i % 10;
			if (digit1 + digit2 + digit3 == sum) {
				//when the i is equal to max, print i without ,
				if (i == max) {
					System.out.print(i);
				} else {
					System.out.print(i + ", ");
				}
			}
		}
	}
}
