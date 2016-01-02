import java.util.Scanner;

/*
 * ¬исокосни години са всички години кратни на 4 с изключени€
столети€та, но без столети€ кратни на 400, т.е. 1900 не е високосна,
но 1600 и 2000 са високосни.
—ъставете програма, ко€то по дадени ден, месец, година отпечатва
следващата дата.
¬ходни данни: три числа за ден, месец, година.
 */

public class Problem12 {
	public static void main(String[] args) {
		boolean isLeapYear = false;
		boolean wrongInput = false;

		// read the date
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a day: ");
		int day = input.nextInt();
		System.out.print("Enter a month: ");
		int month = input.nextInt();
		System.out.print("Enter a year: ");
		int year = input.nextInt();

		input.close();

		// check if the year is leap
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			isLeapYear = true;
		}

		// check if month is 1,3,5,7,8,10,12
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			if (0 < day && day < 31) {
				day++;
			} else if (day == 31 && month == 12) {
				year++;
				month = 1;
				day = 1;
			} else if (day == 31) {
				month++;
				day = 1;
			} else {// if day is not in[1...31]
				wrongInput = true;
			}

			// check if month is 4,6,9,11
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {

			if (0 < day && day < 30) {
				day++;
			} else if (day == 30) {
				month++;
				day = 1;
			} else {// if day is not in[1...30]
				wrongInput = true;
			}
		} else if (month == 2) {// month is 2
			if (isLeapYear) {// year is leap
				if (0 < day && day < 29) {
					day++;
				} else if (day == 29) {// if day is 29.02 => next date is 01.03
					month++;
					day = 1;
				} else {// if day is not in[1...29]
					wrongInput = true;
				}
			} else {// year is not leap
				if (0 < day && day < 28) {
					day++;
				} else if (day == 28) {// if date is 28.02 and year is not leap
										// then next date is 01.03
					month++;
					day = 1;
				} else {// if day is not in[1...28]
					wrongInput = true;
				}
			}
		} else {// if month is not in [1...12]
			wrongInput = true;
		}

		// print the result
		if (wrongInput) {
			System.out.println("Wrong input");
		} else {
			// print next date
			System.out.println("Next date is " + day + ":" + month + ":" + year);
		}
	}
}
