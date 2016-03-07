import java.util.Scanner;
/*�� �� ������� ��������, ���� ����� �� �������� �������������� ���
 ������ �� ������� ��� ���������.
 ���������� �� ������� ��������� �� ��������� �� ����������� �� ��
 �������.
 ������: ���������, ���������
 �����:
 ����� ���� �� � ����� �������.
 ������� �� �������:
 8 �-�
 9 �-�
 */
public class Task3 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String text1, text2;
		//read 2 strings from the console
		System.out.println("Please enter a string: ");
		text1 = reader.nextLine();
		System.out.println("Please enter another string: ");
		text2 = reader.nextLine();
		reader.close();
		
		int length = 0;
		
		//find the longer text 
		if(text1.length()>text2.length()){
			System.out.println("������� ��� � � ��-������ �������");
			length = text2.length();
		}else if(text1.length()<text2.length()){
			System.out.println("������� ��� � � ��-������ �������");
			length = text1.length();
		}else{
			System.out.println("����� ���� �� � ����� �������");
			length = text1.length();
		}
		//find the differences between characters of two texts
		System.out.println("������� �� ������");
		boolean differenceFound = false;
		for(int i = 0; i<length; i++){
			if(text1.charAt(i)!=text2.charAt(i)){
				System.out.println((i+1) + " "+ text1.charAt(i) + "-" + text2.charAt(i));
				differenceFound = true;
			} 
		}
		//print if one of the texts is substring of the other
		if(!differenceFound && text1.length()!=text2.length()){
			if(text1.length()>text2.length()){
				System.out.println("������� ����� � ������ �� ������");
			}else{
				System.out.println("������� ����� � ������ �� ������");
			}
		}
	}
}
