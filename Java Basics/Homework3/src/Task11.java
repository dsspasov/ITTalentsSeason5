import java.util.Scanner;

/*Да се състави програма, която въвежда от клавиатурата 7 цели числа
 в едномерен масив
 Програмата да изведе всички числа кратни на 5, но по големи от 5.
 Пример: -23, -55, 17, 75, 56, 105, 134
 Изход: 75,105 - 2 числа*/
public class Task11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// declare an array with size 7
		int[] array = new int[7];

		// fill the array with values from the console
		System.out.println("Please fill the array with numbers");
		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter a number: ");
			array[i] = input.nextInt();
		}
		System.out.println("You've filled the array");
		
		input.close();
		//iterate through the numbers and check if number is greater than 5 and can be divided by 5
		boolean firstFound = false;
		int counter = 1;
		for(int i = 0; i<array.length; i++){
			if((array[i]%5==0) && (array[i]>5)){
				if(!firstFound){
					firstFound = true;
					System.out.print(array[i]);
					continue;
				}
				System.out.print(", " + array[i]);
				counter++;
			}
		}
		if(firstFound){
			System.out.print(" - " + counter + " числа");
		}else{
			System.out.print("Няма числа по-големи от 5 и кратни на 5!");
		}
		
	}
}
