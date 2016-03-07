import java.util.Scanner;

/*
Да се състави програма, чрез която от клавиатурата се въвеждат
последователно две думи с дължина 10-20 знака.
Програмата да размени първите им 5 знака и да изведе дължината на
по-дългата, както и новото им съдържание.
Пример: uchilishe uchenik
Изход: 9 uchenishe
*/
public class Task2 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String word1, word2;
		//read 2 words from console
		do{
			System.out.println("Please enter a word with size between 10 and 20 characters: ");
			word1 = reader.nextLine();
			System.out.println("Please enter a string with size between 10 and 20 characters: ");
			word2 = reader.nextLine();
		}while(word1.length()<10||word1.length()>20||word2.length()<10||word2.length()>20);
		reader.close();
		
		//replace the first 5 symbols of the first word with first 5 symbols of the second word
		//and the first 5 symbols of the second word with first 5 symbols of first word;
		String newWord1 = word2.substring(0, 5) + word1.substring(5) ;
		String newWord2 = word1.substring(0, 5) + word2.substring(5) ;
		//print the longer word and its size
		if(newWord1.length()>newWord2.length()){
			System.out.println(newWord1.length() + ", " + newWord1);
		}else{
			System.out.println(newWord2.length() + ", " + newWord2);
		}
		//System.out.println(newWord1.length()>newWord2.length()? newWord1.length() + ", " + newWord1:newWord2.length() + ", " + newWord2);
		
	}
}
