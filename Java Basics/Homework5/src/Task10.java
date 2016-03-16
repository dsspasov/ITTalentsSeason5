import java.util.Scanner;

/*�� �� ������� ��������, ����� �� ����� ��� ����� ����,
���������, �� ����� �� �������� ���� ��� ����� ��� �� ������
�� ASCII ��������� � ���������� ������� 5 � � �������
������������� ������.
������ :
����: Hello
�����: Mjqqt
*/
public class Task10 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		//read a string from the console
		System.out.println("Enter a word:");
		String word = reader.nextLine();
		
		reader.close();
		
		//for each character of the string get its code, add 5 and then replace old character with the new one
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<word.length(); i++){
			sb.append((char)(word.charAt(i) + 5));
		}
		//print the result
		System.out.println(sb.toString());
	}
}
