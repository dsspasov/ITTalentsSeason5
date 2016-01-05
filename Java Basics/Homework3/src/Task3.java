import java.util.Scanner;

/*�� �� ������ �����, ���� ����� �� �� ������� ����� � 10
 �������� �� ������� �����:
 ������� 2 �������� �� ������ �� ���������� �����.
 ����� ������� ������� �� ������ � ����� �� ����� ��
 ���������� 2 �������� � ������.
 ���� ���� �������� ������*/
public class Task3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		// read a number from console
		System.out.print("enter a number: ");
		n = input.nextInt();
		input.close();

		// declare an array
		int[] array = new int[10];
		array[0] = array[1] = n;
		//fill the array
		for (int i = 2; i < 10; i++) {
			array[i] = array[i - 1] + array[i - 2];
		}

		// print the array
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				System.out.print(array[i]);
				break;
			}
			System.out.print(array[i] + ", ");
		}
	}
}
