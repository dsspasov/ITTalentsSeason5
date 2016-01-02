import java.util.Scanner;

/*
 * Съставете програма, която по дадено трицифренo число проверява
 * дали числото се дели на всяка своя цифра. Във въведеното число да
 * няма цифра 0.
 * */
public class Problem11 {
	public static void main(String[] args) {
		
		// read number from the console
		short number;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = input.nextShort();

		input.close();

		// check if the number is in [100..999] 
		if (number < 100 || number > 999) {
			System.out.println("Sorry! Wrong input!");
			System.out.println("End");
		} else {

			// get the digits
			byte digit1 = (byte) (number / 100);
			byte digit2 = (byte) ((number / 10) % 10);
			byte digit3 = (byte) (number % 10);

			// check if any digit is 0
			if (digit1 == 0 || digit2 == 0 || digit3 == 0) {
				System.out.println("Sorry! Wrong input!");
				System.out.println("End");

			// check if the number is divisible by its digits
			} else if ((number % digit1 == 0) && (number % digit2 == 0) && (number % digit3 == 0)) {
				System.out.println("The number " + number + " is divisible by its digits " + digit1 + ", " + digit2+ ", " + digit3);
			}else{
				System.out.println("The number is not divisible by its digits");
			}

		}

	}
}
