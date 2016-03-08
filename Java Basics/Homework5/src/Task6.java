import java.util.Scanner;

/*Да се състави програма, чрез която се въвежда изречение с отделни
думи.
Като резултат на екрана да се извежда същия текст, но всяка отделна
дума да започва с главна буква, а следващите я букви да са малки.
Пример: супер яката задача
Изход: Супер Яката Задача
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
