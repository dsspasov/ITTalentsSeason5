import java.util.Scanner;

/*
 * Да се състави програма, чрез която се въвеждат 2 естествени
числа N, M от интервала [10..5555].
Програмата, чрез цикъл for, да извежда всички числа от
интервала, които са кратни на 50 в низходящ ред.
Пример: 25,249
Изход: 200,150,100, 50.
 */

public class Problem16 {
	public static void main(String[] args) {
		int n,m;
		Scanner input = new Scanner(System.in);
		//read 2 numbers(n, m) from the console
		//and check if they are in [10 .. 5555]
		do{
			System.out.print("Enter N: ");
			n = input.nextInt();
			System.out.print("Enter M: ");
			m = input.nextInt();
		}while(n<10||n>5555||m<10||m>5555);
		
		input.close();
		//if m is greater than n then swap their values
		if(m>n){
			int temp = m;
			m = n;
			n = temp;
		}
		//iterate from n(bigger one) to m(smaller one)
		//and check if current number can be divided by 50
		for(int i = n; i>=m; i-- ){
			if(i%50 == 0){
				System.out.print(i + " ");
			}
		}
	}
}
