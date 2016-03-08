import java.util.Scanner;

/*�� �� ������� ��������, ���� ����� �� ������� ��������� � �������
����.
���� �������� �� ������ �� �� ������� ����� �����, �� ����� �������
���� �� ������� � ������ �����, � ���������� � ����� �� �� �����.
������: ����� ����� ������
�����: ����� ����� ������
*/
public class Task6 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		//read a sentence from the console
		System.out.println("Enter a sentence from the console: ");
		String sentence = reader.nextLine();
		reader.close();
		
		//get all words in the sentence
		String[] words = sentence.split(" ");
		StringBuilder sb = new StringBuilder();
		for(String word:words){
			//for each word capitalize its first letter by replacing it with upper case of the letter
			sb.append(word.toLowerCase().replace(word.substring(0, 1), word.substring(0, 1).toUpperCase()) + " ");
		}
		//print the result
		System.out.println(sb.toString().trim());
	}
}
