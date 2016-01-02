import java.util.Scanner;

/*
 * ������ �� �� ������� �������� � ����. ����� 2 ���� � ���������� 2 �
 * 3 ����� � �� �������� ������������.
 * �� �� ������� ��������, ����� �� ����� ���� ������� ��� �� ��������
 * ��������� � ���� ����, �.�. ��-����� ���� �� �� ����� ����� ��
 * ������. ������ �� ����� �� �� ������� � �������� ���������� ����.
 * ������ �����: ���������� ����� �� ��������� [10..9999].
 * ������: 107
 * �����: 21 ���� �� 2 �����,
 * 21 ���� �� 3 �����
 * ������������ ���� �� 2 �����
 */
//volume = x(mod 5) x = {0,1,2,3,4}
public class Problem10 {
	public static void main(String[] args) {
		// read a number from the console
		short volume;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the volume: ");
		volume = input.nextShort();

		input.close();

		// check if the number is in [10...9999]
		if (volume < 10 || volume > 9999) {
			System.out.println("Sorry! Wrong input!");
		} else {
			if (volume % 5 == 0) {
				// find the number of both buckets
				short numberOfBothBuckets = (short) (volume / 5);
				System.out.println(numberOfBothBuckets + " ���� �� 2 �����");
				System.out.println(numberOfBothBuckets + " ���� �� 3 �����");
			} else if (volume % 5 == 1) {
				// find the number of buckets
				short numberOfBothBuckets = (short) ((volume - 6) / 5);
				System.out.println(numberOfBothBuckets + " ���� �� 2 �����");
				System.out.println(numberOfBothBuckets + " ���� �� 3 �����");
				System.out.println("������������ 2 ���� �� 3 �����");

			} else if (volume % 5 == 2){
				// find the number of buckets
				short numberOfBothBuckets = (short) (volume / 5);
			//	short numberOAdditionalfBucket2L = (short) ((volume - numberOfBothBuckets * 5) / 2);
				System.out.println(numberOfBothBuckets + " ���� �� 2 �����");
				System.out.println(numberOfBothBuckets + " ���� �� 3 �����");
				System.out.println("������������ " + 1 + " ���� �� 2 �����");
			}else if(volume % 5 == 3){
				// find the number of buckets
				short numberOfBothBuckets = (short) (volume / 5);
				short numberOfAdditionalBucket3L = 1;
				System.out.println(numberOfBothBuckets + " ���� �� 2 �����");
				System.out.println(numberOfBothBuckets + " ���� �� 3 �����");
				System.out.println("������������ " + numberOfAdditionalBucket3L + " ���� �� 3 �����");
			}else{
				short numberOfBothBuckets = (short) (volume / 5);
				//short numberOAdditionalfBucket2L = (short) ((volume - numberOfBothBuckets * 5) / 2);
				System.out.println(numberOfBothBuckets + " ���� �� 2 �����");
				System.out.println(numberOfBothBuckets + " ���� �� 3 �����");
				System.out.println("������������ " + 2 + " ���� �� 2 �����");
			}
		}
	}
}
