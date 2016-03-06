/*Да се състави програма, чрез която се въвеждат два низа съдържащи
до 40 главни и малки букви.
Като резултат на екрана да се извеждат низовете само с главни и само
с малки букви.
Пример: Abcd Efgh
Изход: ABCD abcd EFGH efgh
*/
import java.util.Scanner;


public class Task1 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String text1, text2;
		//read 2 strings from console
		do{
			System.out.println("Please enter a string with max size of 40 characters: ");
			text1 = reader.nextLine();
			System.out.println("Please enter a string with max size of 40 characters: ");
			text2 = reader.nextLine();
		}while(text1.length()>40||text2.length()>40);
		reader.close();
		
		//print the strings upper case and lower case
		System.out.println(text1.toUpperCase());
		System.out.println(text2.toUpperCase());
		System.out.println(text1.toLowerCase());
		System.out.println(text2.toLowerCase());
	}

}
