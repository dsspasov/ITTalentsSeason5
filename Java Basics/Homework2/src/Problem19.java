import java.util.Scanner;

/* Да се състави програма, чрез която по въведено
естествено число от интервала [10..99] се извежда поредица
числа, при спазване на следните изисквания:
1) ако предходното число е четно се извежда 0.5*числото;
2) ако предходното число е нечетно се извежда 3*числото +1.
Извеждането продължава докато не се получи стойност 1.
Пример: 11
Изход: 34 17 52 26 13 40 20 10 5 16 8 4 2 1*/

public class Problem19 {
	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		//read a number from the console and check if it is in [10;99]
		do {
			System.out.print("Enter a number: ");
			n = input.nextInt();
		} while (n < 10 || n>99);

		input.close();
		
		
		do{
			//check if previous number is even
			if(n%2 == 0){
				n = n/2; //divide by 2
			}else{
				n = n*3 + 1;//if previous number is odd
			}
			//print current number
			System.out.print(n + " ");
		}while(n>1);
	}
}
