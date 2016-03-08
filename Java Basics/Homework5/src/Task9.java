import java.util.Scanner;

/*
 * Да се състави програма, чрез която по въведен низ съдържащ букви,
цифри, знак минус '-' се извежда сборът на въведените числа като се
отчита знакът '-' пред съответното число.
Вход: asd-12sdf45-56asdf100
Изход:
-12
45
-56
100
Сума = 77
*/
public class Task9 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		//read a text from the console
		System.out.println("Enter a string of letters, numbers and -: ");
		//String text = "asd-12sdf45-56asdf100";
		String text = reader.nextLine();
		reader.close();
		
		int sum = 0;
		int number = 0;
		//get the characters of the text
		char[] symbols = text.toCharArray();
		boolean negative = false;
		//get all sequences of digits and create a numbers from them
		for(int i = 0; i<symbols.length;i++){
			if(symbols[i]>='0' && symbols[i]<='9'){
				number = number*10 + symbols[i] - 48;
			}else{
				//if there is '-' then the next number is negative; '-' has to be directly before the number
				if(negative){
					negative = false;
					number = -number;
					sum+=number;
					number = 0;
				}else{
					//calculate the sum
					sum +=number;
					number = 0;
				}//check if the symbol is -
				if(symbols[i] == '-'){
					negative = true;
				}
			}
		}
		//check if negative is true then the last number is negative
		//this works when the last characters are digits
		if(negative){
			sum -=number;
		}else{
			sum+=number;
		}
		//print the result
		System.out.println("Сума: " + sum);
	}
}
