import java.util.Scanner;

/*
 * Въведете 3 променливи от клавиатурата – час (целочислен тип), сума
 * пари (число с плаваща запетая), дали съм здрав – булев тип.
 * Съставете програма, която взема решения на базата на тези данни по
 * следния начин:
 * - ако съм болен, няма да излизам
 * - ако имам пари, ще си купя лекарства
 * - ако нямам – ще стоя вкъщи и ще пия чай
 * - ако съм здрав, ще отида на кино с приятели
 * - ако имам по-малко от 10 лв, ще отида на кафе.
 *Полученото решение покажете като съобщение в конзолата.
 * */
public class Problem7 {

	public static void main(String[] args) {

		// read 3 variables - hour, money, isHealthy
		int hour;
		double money;
		boolean isHealthy;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter an hour: ");
		hour = input.nextInt();
		System.out.println("Enter amount of money: ");
		money = input.nextDouble();
		System.out.println("Enter true or false if you're healthy");
		isHealthy = input.nextBoolean();

		input.close();

		if (hour < 0 || hour > 24 || money < 0) {
			System.out.println("Sorry!Wrong input!");
		} else {
			// make decisions
			if (!isHealthy) {
				if (money == 0) {
					System.out.println("стоя си вкъщи и пия чай");
				} else {
					System.out.println("ще си купя лекарства");
				}
			} else {
				if (money < 10) {
					System.out.println("ще отида на кафе");
				} else {
					System.out.println("ще отида на кино с приятели");
				}
			}
		}
	}
}
