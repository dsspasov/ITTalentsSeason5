import java.util.Scanner;

/*
 * �� �� ������� ��������� ��� ����������� � �� �� �������� 2 ����� ��
 * ������������ A � B (���� �� �� � ������� ������� � double).
 * ����� �� �� ������� 3-�� ����� C � �� �� ������� ���� �� � �/� A � B.
 * �� �� ������ ��������� ��������� �� ���� ���� C � ����� A � B.
 */
public class Problem1 {
	public static void main(String[] args) {

		// declare A, B and C
		// read A, B and C from console
		double a, b, c;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter A:");
		a = sc.nextDouble();
		System.out.println("Enter B:");
		b = sc.nextDouble();
		System.out.println("Enter C:");
		c = sc.nextDouble();
		sc.close();
		// check if C is between A and B

		if ((a < c && c < b) || (b < c && c < a)) {
			System.out.println("C is between A and B");
		} else {
			System.out.println("C is not between A and B");
		}

	}
}
