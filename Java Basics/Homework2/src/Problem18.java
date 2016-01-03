import java.util.Scanner;

/*
 * �� �� ������� ��������, ���� ����� �� ������� ��� ����� ��
��������� [1..9].
���������� �� ������� ��������� �� ���������.
������������ �������� �� ����������� � ���������� �� 2-��
�����.
������: 2 2
�����:
1*1= 1;
1*2= 2;
2*1= 2;
2*2= 4;
*/
public class Problem18 {
	public static void main(String[] args) {
		byte n,m;
		Scanner input = new Scanner(System.in);
		//read two numbers from the console and check if they are in [1 .. 9]
		do{
			System.out.print("Enter N: ");
			n = input.nextByte();
			System.out.print("Enter M: ");
			m = input.nextByte();
		}while(n<1||n>9||m<1||m>9);
		
		input.close();
		//print the multiplication table
		for(int i = 1; i<=n; i++){
			for(int j = 1; j<=m; j++){
				System.out.println(i + "*" + j + " = " + (i*j));
			}
		}
		
	}

}
