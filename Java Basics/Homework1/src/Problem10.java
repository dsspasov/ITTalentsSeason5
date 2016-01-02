import java.util.Scanner;

/*
 * Трябва да се напълни цистерна с вода. Имате 2 кофи с вместимост 2 и
 * 3 литра и ги ползвате едновременно.
 * Да се състави програма, която по даден обем извежда как ще прелеете
 * течността с тези кофи, т.е. по-колко пъти ще се пълни всяка от
 * кофите. Кофите не могат да се ползват с частично количество вода.
 * Входни данни: естествено число от интервала [10..9999].
 * Пример: 107
 * Изход: 21 пъти по 2 литра,
 * 21 пъти по 3 литра
 * допълнително кофа от 2 литра
 */
//volume = x(mod 5) x = {0,1,2,3,4}
public class Problem10 {
	public static void main(String[] args) {
		// read a number from the console
		short volume;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the volume: ");
		volume = input.nextShort();

		input.close();

		// check if the number is in [10...9999]
		if (volume < 10 || volume > 9999) {
			System.out.println("Sorry! Wrong input!");
		} else {
			if (volume % 5 == 0) {
				// find the number of both buckets
				short numberOfBothBuckets = (short) (volume / 5);
				System.out.println(numberOfBothBuckets + " пъти по 2 литра");
				System.out.println(numberOfBothBuckets + " пъти по 3 литра");
			} else if (volume % 5 == 1) {
				// find the number of buckets
				short numberOfBothBuckets = (short) ((volume - 6) / 5);
				System.out.println(numberOfBothBuckets + " пъти по 2 литра");
				System.out.println(numberOfBothBuckets + " пъти по 3 литра");
				System.out.println("допълнително 2 кофи по 3 литра");

			} else if (volume % 5 == 2){
				// find the number of buckets
				short numberOfBothBuckets = (short) (volume / 5);
			//	short numberOAdditionalfBucket2L = (short) ((volume - numberOfBothBuckets * 5) / 2);
				System.out.println(numberOfBothBuckets + " пъти по 2 литра");
				System.out.println(numberOfBothBuckets + " пъти по 3 литра");
				System.out.println("допълнително " + 1 + " кофа от 2 литри");
			}else if(volume % 5 == 3){
				// find the number of buckets
				short numberOfBothBuckets = (short) (volume / 5);
				short numberOfAdditionalBucket3L = 1;
				System.out.println(numberOfBothBuckets + " пъти по 2 литра");
				System.out.println(numberOfBothBuckets + " пъти по 3 литра");
				System.out.println("допълнително " + numberOfAdditionalBucket3L + " кофа от 3 литри");
			}else{
				short numberOfBothBuckets = (short) (volume / 5);
				//short numberOAdditionalfBucket2L = (short) ((volume - numberOfBothBuckets * 5) / 2);
				System.out.println(numberOfBothBuckets + " пъти по 2 литра");
				System.out.println(numberOfBothBuckets + " пъти по 3 литра");
				System.out.println("допълнително " + 2 + " кофи от 2 литри");
			}
		}
	}
}
