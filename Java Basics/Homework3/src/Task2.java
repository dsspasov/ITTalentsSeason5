import java.util.Scanner;

/*Нека по въведен масив да се конструира нов, като половината му
елементи са точно като на оригиналния, а другите да са тези
елементи, но в обратен ред. Последно, да се изведе новия масив
на екрана.*/
public class Task2 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		//read the size of an array from console
		do {
			System.out.print("enter a number for array's length: ");
			n = input.nextInt();
		} while (n < 1);
		//declare an array with size n
		int[] originalArray = new int[n];

		//read n numbers from console and fill the array
		for (int i = 0; i < originalArray.length; i++) {
			System.out.print("Enter a number: ");
			originalArray[i] = input.nextInt();
		}

		input.close();
		
		
		//declare new array with size n
		int[] newArray = new int[n];
		
		//initialize the new array
		for(int i=0; i<originalArray.length; i++){
			//the first half of newArray is the first half of originalArray
			if(i<(originalArray.length+1)/2){
				newArray[i] = originalArray[i];
			}else{
			//the second half of newArray is the first half of originalArray but in reversed order
				newArray[i] = newArray[newArray.length-1-i];
			}
		}
		
		
		//print new array
		
		for(int i = 0; i<newArray.length;i++){
			if(i==newArray.length-1){
				System.out.print(newArray[i]);
				break;
			}
			System.out.print(newArray[i]+", ");
		}
		
	}
}
