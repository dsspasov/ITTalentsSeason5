import java.util.Scanner;

/*
 * �� �� ������� ��������, ����� ���� �� ��������� 4-������o
 * ���������� ����� �� ��������� [1000.. 9999]. �� ���� ����� ��
 * �������� 2 ���� 2-������� �����. ������� ����� �� ������� �� 1-��
 * � 4-�� ����� �� ���������� �����. ������� ����� �� ������� �� 2-�a -
 * 3-�� ����� �� ���������� �����. ���� �������� �� �� ������ ���� 1-��
 * ���� ����� e ��-����� <, ����� = ��� ��-������ �� 2-�� �����.
 * ������: 3332 �����: ��-����� (32<33)
 * ������: 1144 �����: ����� (14=14)
 * ������: 9875 �����: ��-������ (95>87)
 */
public class Problem8 {

	public static void main(String[] args) {
		// read a number
		short number;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = input.nextShort();
		input.close();

		// check if it is between 1000 and 9999
		if (number < 1000 || number > 9999) {
			System.out.println("Sorry! Wrong input!");
		} else {
			// get the digits of the number
			byte digit1, digit2, digit3, digit4;
			digit1 = (byte) (number / 1000);
			digit2 = (byte) ((number / 100) % 10);
			digit3 = (byte) ((number / 10) % 10);
			digit4 = (byte) (number % 10);

			// make two new numbers
			byte newNumber1 = (byte) (digit1 * 10 + digit4);
			byte newNumber2 = (byte) (digit2 * 10 + digit3);

			// check if the new numbers are <, =, >
			if (newNumber1 > newNumber2) {
				System.out.println("��-������: (" + newNumber1 + ">" + newNumber2 + ")");
			} else if (newNumber1 < newNumber2) {
				System.out.println("��-�����: (" + newNumber1 + "<" + newNumber2 + ")");
			} else {
				System.out.println("�����: (" + newNumber1 + "=" + newNumber2 + ")");
			}
		}
	}
}
