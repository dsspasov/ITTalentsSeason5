import java.util.Scanner;

/* �� �� �������� 2 ����� �� ������������ � � �.
 �� �� ������� ������ ����� �� � �� � �� ������ 2(��������� �
 �������).��� ����� ����� � ������ �� 3, �� �� ������ ��������� ��
 ������� �� �������� �skip 3�.��� ������ �� ������ �������� ����� (���
 ������������) ����� ��-������ �� 200, �� �� �������� �����������.
 */

public class Problem9 {
	public static void main(String[] args) {

		int a, b;
		// read two numbers a and b from the console
		Scanner input = new Scanner(System.in);

		do {
			System.out.print("Enter a number: ");
			a = input.nextInt();
			System.out.print("Enter a number: ");
			b = input.nextInt();
		} while (a >= b * b);

		input.close();

		//iterate from a to b^2 
		//check if the current number can be divided by 3.If it can, then print skip3
		//if it can't then add its value to the sum until sum is > 200
		int sum = 0;
		for (int i = a; i <= b * b; i++) {
			if (i % 3 == 0) {
				if (i == b * b) {
					System.out.print("skip 3");
					break;
				} else {
					System.out.print("skip 3, ");
				}
			} else {
				if (sum + i > 200) {
					System.out.print(i);
					sum += i;
					break;
				} else {
					if(i==b*b){
						System.out.print(i);
						sum += i;
						break;
					}
					System.out.print(i + ", ");
					sum += i;
				}
			}
		}
	}
}
