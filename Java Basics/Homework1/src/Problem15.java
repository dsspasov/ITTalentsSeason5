import java.util.Scanner;

/*�� �� ������� ��������, ����� ������� ���������� ����� �� ���������
 [0..24].
 ���������� �� ������ ������������� ��������� ��������� ���������
 ���.
 ��������� ��:
 [18..4] - ����� �����;
 [4..9] - ����� ����;
 [9..18] - ����� ���
 */

public class Problem15 {
	public static void main(String[] args) {
		// read the current time;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter current time: ");
		byte time = input.nextByte();
		input.close();
		// check if the time is correct
		if (time < 0 || time > 24) {
			System.out.println("Sorry! Wrong input!");
		} else {
			// make a decision
			if (time <= 4 || time >= 18) {
				System.out.println("����� �����");
			} else if (time > 4 && time <= 9) {
				System.out.println("����� ����");
			} else {
				System.out.println("����� ���");
			}
			/*System.out.println((time <= 4 || time >= 18) ? "����� �����"
					: (time >= 4 && time <= 9) ? "����� ����" : "����� ���");*/
		}
	}
}
