import java.util.Scanner;

/*�� �� ������� ��������, ���� ����� �� �������� 7 ���� ����� �
 ��������� �����.
 ���������� �� ������ �������, ����� � ���-������ �� ��������
 �������� �� ���������� �����.
 ������: 1,2,3,4,5,6,7
 �����: ������ �������� 4, ���-������ �������� 4*/

public class Task10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] array = new int[7];
		double sum = 0;
		// read the 7 numbers from console and calculate the sum
		for (int i = 0; i < array.length; i++) {
			System.out.print("Please enter a number: ");
			array[i] = input.nextInt();
			sum += array[i];
		}
		input.close();
		// get the average
		double average = sum / array.length;

		// find the nearest number to average value
		int nearestNumber = array[0];
		for (int i = 1; i < array.length; i++) {
			if (average == nearestNumber) {
				break;
			}
			double distance1 = average - nearestNumber;
			double distance2 = average - array[i];
			if (distance1 < 0) {
				distance1 = -distance1;
			}
			if (distance2 < 0) {
				distance2 = -distance2;
			}

			if (distance1 > distance2) {
				nearestNumber = array[i];
			}
		}
		// print result
		System.out.println("������ ��������: " + average
				+ ", ���-������ �� ���: " + nearestNumber);
	}
}
