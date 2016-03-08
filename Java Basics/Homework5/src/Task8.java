import java.util.Scanner;

/*�� �� ������� ��������, ���� ����� �� ������� ��� �� �������
(������, ���).
���������� �� ������ �� ������ ���� ��������� ������ � ���������,
�.�. ���� ����� ������-������� � �������-������ � ���� � ���.
����: �����
�����: ��.
����: ��������
�����: ��.*/
public class Task8 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter word:");
		String word = reader.nextLine();
		
		reader.close();
		//Solution1
		//reverse the word and check if it is the same word(StringBuilder)
		if(word.equals(new StringBuilder(word).reverse().toString())){
			System.out.println("��");
		}else{
			System.out.println("��");
		}
		
		//solution2
		//check if the first part of the string is equal to the second half(charAt)
		boolean differenceFound = false;
		for(int i = 0; i<(word.length()+1)/2;i++){
			if(word.charAt(i) != word.charAt(word.length() - 1 - i)){
				differenceFound = true;
			}
		}
		if(differenceFound){
			System.out.println("��");
		}else{
			System.out.println("��");
		}
	}
}
