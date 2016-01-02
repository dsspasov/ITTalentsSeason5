import java.util.Scanner;

/*Да се състави програма, която въвежда естествено число от интервала
 [0..24].
 Програмата да изведе съответстващо съобщение съобразно въведения
 час.
 Периодите са:
 [18..4] - Добър вечер;
 [4..9] - Добро утро;
 [9..18] - Добър ден
 */

public class Problem15 {
	public static void main(String[] args) {
		// read the current time;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter current time: ");
		byte time = input.nextByte();
		input.close();
		// check if the time is correct
		if (time < 0 || time > 24) {
			System.out.println("Sorry! Wrong input!");
		} else {
			// make a decision
			if (time <= 4 || time >= 18) {
				System.out.println("Добър вечер");
			} else if (time > 4 && time <= 9) {
				System.out.println("Добро утро");
			} else {
				System.out.println("Добър ден");
			}
			/*System.out.println((time <= 4 || time >= 18) ? "Добър вечер"
					: (time >= 4 && time <= 9) ? "Добро утро" : "Добър ден");*/
		}
	}
}
