import java.util.Scanner;

/*�������� ��������, ����� ����� ���� ����� � ����� ������� ���
 ����� ��� ����� ������ �� ������� �����: ���������� �� �����
 ������� �� ������ ����� �� � ����� �� ����� �� ���������� �
 ���������� ������� �� ���������� ������� �� ������ �����. �������
 � ���������� ������� �� ������ ����� ������ �� �� ������� ����� ��
 ������� � ���������� �� ������� �� ������ �����.
 �� �� ������ ��������� �����.
 */

public class Task7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// read the size of an array from the console
		int n;
		do {
			System.out.print("Enter the size of an array: ");
			n = input.nextInt();
		} while (n < 1);
		
		// declare the array
		int[] array = new int[n];

		// read the array
		System.out.println("Please fill the array!");
		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter next number: ");
			array[i] = input.nextInt();
		}
		input.close();
		
		// declare new array
		int[] newArray = new int[array.length];
		
		// fill the new array
		for (int i = 0; i < array.length; i++) {
			if (i == 0 || i == array.length - 1) {
				newArray[i] = array[i];
			} else {
				newArray[i] = array[i - 1] + array[i + 1];
			}
		}

		// print new array
		System.out.println("The new array looks like this: ");
		for (int i = 0; i < newArray.length; i++) {
			if (i == 0) {
				System.out.print("new array = [" + newArray[i] + ", ");
			} else if (i == newArray.length - 1) {
				System.out.println(newArray[i] + "]");
			} else {
				System.out.print(newArray[i] + ", ");
			}
		}
		
		System.out.print("End");
	}
}
