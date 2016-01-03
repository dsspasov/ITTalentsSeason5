import java.util.Scanner;

/*Да се въведат от потребителя 2 числа. И да се
изведат на екрана всички числа от по-малкото до по-голямото.
*/
public class Problem5 {
	public static void main(String[] args) {
		int min,max;
		// read two number from the console
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		min = input.nextInt();
		System.out.print("Enter second number: ");
		max = input.nextInt();
		input.close();
		
		//check if numbers are equal
		if(min == max){
			System.out.println(max);
		}else {//check if min is greater than max
			   // if it's true change values;
			if(min>max){
				max = max+min;
				min = max - min;
				max = max - min;
				/*int temp = min;
				min = max;
				max = temp;*/
			}
			
			//iterate from min to max
			for(int i = min; i<=max; i++){
				//print each number
				System.out.println(i);
			}
		}
	}
}
