import java.util.Scanner;

/*
 * �� �� ������� ��������, ����� ���� �� ��������� 2 ����������
 * ���������� ����� a,b.
 * ���������� �� ������ � ��������� ���� ���������� ����� ��
 * �������������� �� ����� ����� � �����, ����� � ������ �����.
 * ������ �����: a,b - ���������� ����� �� ��������� [10..99].
 * ������: 15, 25
 * �����: 375, 5 �������
 */
public class Problem9 {
	public static void main(String[] args) {
		// read two numbers(a and b) a,b [10; 99]
		byte a, b;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a: ");
		a = input.nextByte();
		System.out.print("Enter b: ");
		b = input.nextByte();

		input.close();

		// check if the numbers are between [10;99]
		if (a < 10 || a > 99 || b < 10 || b > 99) {
			System.out.println("Sorry! Wrong input");
		} else {
			// calculate the product of a and b
			short product = (short) (a * b);
			// get the last digit of the product
			byte digit = (byte) (product % 10);
			// check if it is odd or even
			if (digit % 2 == 0) {
				// print the product, the digit and its type
				System.out.println(product + ", " + digit + " even");
			} else {
				// print the product, the digit and its type
				System.out.println(product + ", " + digit + " odd");
			}
		}
	}
}
