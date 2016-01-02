import java.util.Scanner;

/*
 * �������� 3 ���������� �� ������������ � ��� (���������� ���), ����
 * ���� (����� � ������� �������), ���� ��� ����� � ����� ���.
 * ��������� ��������, ����� ����� ������� �� ������ �� ���� ����� ��
 * ������� �����:
 * - ��� ��� �����, ���� �� �������
 * - ��� ���� ����, �� �� ���� ���������
 * - ��� ����� � �� ���� ����� � �� ��� ���
 * - ��� ��� �����, �� ����� �� ���� � ��������
 * - ��� ���� ��-����� �� 10 ��, �� ����� �� ����.
 *���������� ������� �������� ���� ��������� � ���������.
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
					System.out.println("���� �� ����� � ��� ���");
				} else {
					System.out.println("�� �� ���� ���������");
				}
			} else {
				if (money < 10) {
					System.out.println("�� ����� �� ����");
				} else {
					System.out.println("�� ����� �� ���� � ��������");
				}
			}
		}
	}
}
