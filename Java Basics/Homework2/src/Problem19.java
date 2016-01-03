import java.util.Scanner;

/* �� �� ������� ��������, ���� ����� �� ��������
���������� ����� �� ��������� [10..99] �� ������� ��������
�����, ��� �������� �� �������� ����������:
1) ��� ����������� ����� � ����� �� ������� 0.5*�������;
2) ��� ����������� ����� � ������� �� ������� 3*������� +1.
����������� ���������� ������ �� �� ������ �������� 1.
������: 11
�����: 34 17 52 26 13 40 20 10 5 16 8 4 2 1*/

public class Problem19 {
	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		//read a number from the console and check if it is in [10;99]
		do {
			System.out.print("Enter a number: ");
			n = input.nextInt();
		} while (n < 10 || n>99);

		input.close();
		
		
		do{
			//check if previous number is even
			if(n%2 == 0){
				n = n/2; //divide by 2
			}else{
				n = n*3 + 1;//if previous number is odd
			}
			//print current number
			System.out.print(n + " ");
		}while(n>1);
	}
}
