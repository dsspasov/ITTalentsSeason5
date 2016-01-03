import java.util.Scanner;

/*
 * Да се състави програма, която извежда първите 10 най-малки
 числа, които се делят на 2, 3 или на 5 и които са по-големи от
 въведено естествено число.
 Числата се извеждат, заедно с техния пореден номер.
 Входни данни: число от интервала [1..999]
 Пример: 1
 Изход: 1:2; 2:3, 3:4, 4:5, 5:6, 6:8, 7:9, 8:10, 9:12, 10:14
 */
public class Problem22 {
	public static void main(String[] args) {

		short n;
		Scanner input = new Scanner(System.in);
		// read a number from the console between 1 and 999
		do {
			System.out.print("Enter a number: ");
			n = input.nextShort();
		} while (n < 1 || n > 999);

		input.close();

		int counter = 1;
		//the counter counts how many numbers are printed
		while (counter <= 10) {
			//check if the number is divided by 2, 3 or 5
			if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0) {
				if (counter == 10) {
					System.out.print(counter + ":" + n);
					break;
				}
				System.out.print(counter + ":" + n + ", ");
				counter++;
			}
			n++;
		}
	}
}
