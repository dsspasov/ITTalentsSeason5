import java.util.Scanner;

/*����� ������������� �������� ��������� �� ���������� �����,
�������� � ��������� ������� � ������� 6 ���� � 6 ������.
�� �� ������� �������� , ���� ����� �� ������ ������ �� ������
��������, ����� ���� �� ������� �� ��� � ������ � ����� �����.
���������� �� ������� ����������� ���� �� ����� ������� ��� ��
����������� �������, ����� � ������ ���� �� ���� ��������.
�� �� �������� ���� ���� �����.
������:
11,12,13,14,15,16,
21,22,23,24,25,26,
31,32,33,34,35,36,
41,42,43,44,45,46,
51,52,53,54,55,56,
61,62,63,64,65,66
�����:
11, ,13, ,15, , ���� �� ���������� �� ����: 39
22, ,24, ,26, ���� �� ���������� �� ����: 72
31, ,33, ,35, , ���� �� ���������� �� ����: 99
42, ,44, ,46, ���� �� ���������� �� ����: 132
51, ,53, ,55, , ���� �� ���������� �� ����: 159
62, ,64, ,66 ���� �� ���������� �� ����: 192
���� �� ����������: 693
*/
public class Task7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//declare an array
		int[][] array = new int[6][6];
		/*int[][]array = {
				{11, 12, 13, 14, 15, 16},
				{21, 22, 23, 24, 25, 26},
				{31, 32, 33, 34, 35, 36},
				{41, 42, 43, 44, 45, 46},
				{51, 52, 53, 54, 55, 56},
				{61, 62, 63, 64, 65, 66}
				};*/
		//fill the array with values from the console
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print("Enter a value for element " + (i + 1) + "," + (j + 1) + " :");
				int value = input.nextInt();
				while(value<=0){
					System.out.print("Please enter a natural number for element " + (i + 1) + "," + (j + 1) + " :");
					value = input.nextInt();
				}
				array[i][j] = value;
			}
		}
		
		input.close();
		int totalSum = 0;
		//find the sum of elements with even sum of indexes for each row
		for(int i = 0; i<array.length; i++){
			int sum = 0;
			if(i%2==0){
				sum += array[i][0] + array[i][2]+array[i][4];
				System.out.print(array[i][0] + ", "+ array[i][2] + ", "+array[i][4] + " ���� �� ���������� �� ����: "+ sum );
			}else{
				sum += array[i][1] + array[i][3]+array[i][5];
				System.out.print(array[i][1] + ", "+ array[i][3] + ", "+array[i][5] + " ���� �� ���������� �� ����: "+ sum );
			}
			totalSum += sum;
			System.out.println();
		}
		//print the total sum
		System.out.println("���� �� ����������: " + totalSum);
	}
}
