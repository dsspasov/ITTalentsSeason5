import java.util.Scanner;

/*�� �� ������� ��������, ���� ����� �� �������� 2 ������ �� �����
(����).
��� � ����� ������ ������� ���� � ���� ����, �� �� ������ �� ������
������� ������ ������������, � ������� ����������, ���� �� �� ��
�������� � ����� �� ����.
��� �������� ����� ��� ���� �� �� ������ ���� ������������
���������.
������ :
�
�
�����
�
�
�*/
public class Task5 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String text1, text2;
		//read 2 strings
		System.out.println("Please enter a string: ");
		text1 = reader.nextLine();
		System.out.println("Please enter a string: ");
		text2 = reader.nextLine();
		reader.close();
		
		boolean found = false;
		int i = 0,j = 0;
		//find the first character that appears in both strings
		for(i = 0; i<text1.length(); i++){
			for(j = 0; j<text2.length(); j++){
				if(text1.charAt(i)==text2.charAt(j)){
					found = true;
					break;
				}
			}
			if(found){
				break;
			}
		}
		if(found){
			//print the result
			//print the first part (before the crossing )of the second text
			for(int line = 0; line<j; line++){
				for(int spaces = 0; spaces<i; spaces++){
					System.out.print(" ");
				}
				System.out.println(text2.charAt(line));
			}

			//print the first text
			System.out.println(text1);
			
			//print the second part(after the crossing) of the second text
			for(int line = j+1; line<text2.length(); line++){
				for(int spaces = 0; spaces<i; spaces++){
					System.out.print(" ");
				}
				System.out.println(text2.charAt(line));
			}
		}else{
			System.out.println("The sequences does not have same character");
		}
	}
}
