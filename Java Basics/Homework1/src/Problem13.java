import java.util.Scanner;

/*
 * �� �� ������� ��������, ����� �� ������� ����� � �������/����� ��
 * ���������� ����������� t � ������ ������.
 * �������������� ��������� ��:
 * ��� -20 ������ �������;
 * ����� 0 � -20 - �������;
 * ����� 15 � 0 - ������;
 * ����� 25 � 15 - �����;
 * ��� 25 � ������.
*/


public class Problem13 {
	public static void main(String[] args) {
		//read the temperature from the console
		//int temperature;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a temperature: ");
		int temperature = input.nextInt();
		input.close();
		
		//make a guess
		if(temperature<=-20){
			System.out.println("������ �������");
		}else if(temperature<=0){
			System.out.println("�������");
		}else if(temperature<=15){
			System.out.println("������");
		}else if(temperature<=25){
			System.out.println("�����");
		}else{
			System.out.println("������");
		}	
		
		
		/*System.out.println(temperature<=-20 ?
				"������ �������" : temperature<=0 ?
				"�������": temperature<=15 ?
				"������": temperature<=25 ?
				"�����": "������");*/
	}
	

}
