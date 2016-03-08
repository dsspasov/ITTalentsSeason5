import java.util.Scanner;

/*Задача 7:
Да се състави програма, която чете набор от думи разделени с
интервал.
Като резултат да се извеждат броя на въведените думи, както и броя
знаци в най-дългата дума.
Пример: asd fg hjkl
Изход: 3 думи, най-дългата е с 4 символа.
*/
public class Task7 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String text1;
		//read  a text from the console
		System.out.println("Please enter a text: ");
		text1 = reader.nextLine();
		reader.close();
		
		//replace 2 or more white spaces with single whitespace
		text1 = text1.replaceAll("\\s+", " ");
		//solution1
		
		int charCounter = 0;
		int bestLength = 0;
		int wordCounter = 1;
		//loop through the characters of the text
		for(int i = 0; i<text1.length(); i++){
			//count the words and the length of each word
			if(text1.charAt(i)==' '){
				if(charCounter>bestLength){
					bestLength = charCounter;
				}
				wordCounter++;
				charCounter = 0;
			}else{
				charCounter++;
			}
		}
		//print the result
		System.out.println(wordCounter + " думи, най-дългата е с "+charCounter + " символа" );
		
		//solution2
		//split the text by whitespaces and get the words
		String[] words = text1.split(" ");
		int length = 0;
		//find the longest word
		for(int i = 0; i<words.length; i++){
			if(length<words[i].length()){
				length = words[i].length();
			}
		}
		
		//print the result
		System.out.println(words.length + " думи, най-дългата е с "+length + " символа" );

	}

}
