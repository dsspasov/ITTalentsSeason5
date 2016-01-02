import java.util.Scanner;

/*
 * ������ 16:
 * �������� � ���������� ���������� ����� �� ���� abc.
 * ������ �� �� ������� ����:
 * ��� a = b = c - �����: ������� �� �����;
 * ��� a>b>c - �����: ������� �� � �������� ���;
 * ��� a<b<c ������� �� ��� �������� ���;
 * � �����: ������� �� ����������, �� ����������� ������.
 * �� �� ������� ��������, ����� ������� ��������� �� ���������� ��
 * ������� �� ������� � �������.
 * ������: 345
 * �����: �������� ���.*/

public class Problem16 {
	public static void main(String[] args) {
		// read a number from the console
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		short number = input.nextShort();

		input.close();
		//check if number is three-digit number
		if (number < 100 || number > 999) {
			System.out.println("Sorry! Wrong input");
		} else {
			// get the digits of the number
			byte digit1, digit2, digit3;
			digit1 = (byte) (number / 100); // a
			digit2 = (byte) ((number / 10) % 10); // b
			digit3 = (byte) (number % 10); // c
			// check if the digits are equal
			if (digit1 == digit2 && digit2 == digit3) {
				System.out.println("������� �� �����");
			} else if (digit1 < digit2 && digit2 < digit3) {
				// check if the digits are in ascending order
				System.out.println("������� �� ��� �������� ���");
			} else if (digit1 > digit2 && digit2 > digit3) {
				// check if the digits are in descending order
				System.out.println("������� �� � �������� ���");
			} else {
				System.out.println("������� �� ����������");
			}
		}
	}
}
