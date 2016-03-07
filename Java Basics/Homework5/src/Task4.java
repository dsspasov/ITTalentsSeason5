import java.util.Scanner;
/*Да се състави програма, чрез която по въведени трите имена на двама
човека разделени със запетая, се извежда чие име има по-голям сбор
от ASCII кодовете на съставящите името букви.
Пример: Anna Dosewa Asenowa, Iwo Peew Peew
Изход: Anna Dosewa Asenowa
*/

public class Task4 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String text1;
		//read a string from the console
		System.out.println("Please enter the names of two people: ");
		text1 = reader.nextLine();
		
		reader.close();
		
		//get all names
		String[] names = text1.split(",");
		int length = 0;
		int index = 0;
		int currentLength = 0;
		//iterate through the array of names
		for(int i = 0; i<names.length; i++){
			//calculate the sum ASCII code of characters of each name
			for(int j = 0; j < names[i].length(); j++){
				if(names[i].charAt(i) != ' '){
				currentLength += names[i].charAt(j);
				}
			}
			//check if current sum is greater than the best sum of ASCII codes
			if(currentLength>length){
				length = currentLength;
				index = i;
			}
			currentLength = 0;
		}
		
		//print the result
		System.out.println(names[index]);
	}
}
