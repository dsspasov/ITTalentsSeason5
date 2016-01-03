import java.util.Scanner;

/*
 * ������ � �������� ����� �����.
 ��������� �� ������ �� ����� �: 2,3,4,5,6,7,8,9,10, ����, ����,
 ���, ���.
 ��������� �� ���� �� ������� �: ������, ����, ����, ����.
 �� �� ������� ��������, ���� ����� �� ������� N - ����� ��
 ��������� [1..51] � �� �������� ��������� ����� ����� �
 ���������� ��-������ ����� �� �������.
 ������: 47.
 �����: ��� ����, ��� ����, ��� ������, ��� ����, ��� ����, ���
 ����

 * */
public class Problem21 {

	public static void main(String[] args) {

		byte n;
		Scanner input = new Scanner(System.in);
		//read a number from the console between 1 and 51
		do {
			System.out.print("Enter N: ");
			n = input.nextByte();
		} while (n < 1 || n > 51);

		input.close();
		
		for (int rank = 1; rank <= 13; rank++) {
			for (int color = 1; color <= 4; color++) {
				//iterate until the desired card(rank and color) is reached
				if ((color + (rank - 1) * 4) < n) {
					continue;
				}
				//print card rank
				switch (rank) {
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:
				case 7:
				case 8:
				case 9:
					//print cards from 2 to 10
					System.out.print((rank + 1) + " ");
					break;
				case 10:
					//print jack
					System.out.print("���� ");
					break;
				case 11:
					//print queen
					System.out.print("���� ");
					break;
				case 12:
					//print King
					System.out.print("��� ");
					break;
				case 13:
					// print Ace
					System.out.print("��� ");
					break;
				default:
					System.out.print("error!!!");
					break;
				}
				
				//print card color
				switch (color) {
				case 1:
					//print club
					System.out.print("������, ");
					break;
				case 2:
					//print diamonds
					System.out.print("����, ");
					break;
				case 3:
					//print hearts
					System.out.print("����, ");
					break;
				case 4:
					//print spades
					if (rank == 13) {
						System.out.print("����");
						break;
					}
					System.out.print("����, ");
					break;
				default:
					System.out.println("Error!!");
					break;
				}
			}
		}
	}
}
