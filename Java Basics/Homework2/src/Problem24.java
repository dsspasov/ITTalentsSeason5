import java.util.Scanner;

/*Едно число X е палиндром, aко се чете еднакво отпред назад и
отзад напред.
Да се състави програма, която проверява дали въведено число е
палиндром.
Входни данни: N - естествено число от интервала [10 .. 30000].
Пример: 17571
Изход: числото е палиндром
Използвайте цикъл do-while. */

public class Problem24 {

	public static void main(String[] args) {
		short n;
		Scanner input = new Scanner(System.in);
		//read a number from the console and check if it is in [10 ... 30_000]
		do{
			System.out.print("Enter a number: ");
			n = input.nextShort();
			
		}while(n<10||n>30_000);
		
		input.close();
		
		short reversed = 0;
		short number = n;
		//generate the reversed number from user's number
		do{
			byte digit = (byte) (n%10);
			reversed = (short) (reversed*10 + digit);
			n = (short) (n/10);			
		}while(n>0);
		
		//check if reversed number is equal to user's number
		if(reversed == number){
			System.out.println("the number is pallindrome");
		}else{
			System.out.println("the number is not pallindrome");
		}
	}
}
