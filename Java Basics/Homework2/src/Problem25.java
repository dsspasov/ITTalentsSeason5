import java.util.Scanner;

/*
�� �� ������� ��������, ����� �� ������ ����� N, �� ���������
N!, �.�. 1*2*3*4...*N.
������: 5
�����: 120
����������� ����� do-while. 
*/
public class Problem25 {
	public static void main(String[] args) {
		
		int n;
		Scanner input = new Scanner(System.in);
		//read a positive number from the console
		do{
			System.out.print("Enter a number: ");
			n = input.nextInt();
		}while(n<=0);
		
		input.close();
		
		//calculate the factorial
		int fact = 1;
		int i = 1;
		do{
			fact *=i;
			i++;
		}while(i<=n);
		
		//print the result
		System.out.println(fact);
	}
}
