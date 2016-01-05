import java.util.Scanner;

/*Имате предварително въведен едномерен масив, съдържащ реални
числа.
Да се състави програма, чрез която се избират само елементи от
масива със стойности от интервала [-2.99..2.99] и се отпечатват в нов
масив. Новият масив да се извежда на екрана.
Пример: 7.1,8.5,0.2,3.7,0.99,1.4,-3.5,-110,212,341,1.2
Изход: 0.2; 0.99; 1.4; 1.2
*/
public class Task14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size;
		//read the size of an array from the console
		do{
			System.out.print("Enter the size of the array: ");
			size = input.nextInt();
		}while(size<1);
		
		//declare an array
		double[] arr = new double[size];
		
		//fill the array with numbers
		System.out.println("Please fill the array with numbers from console.");
		for(int i = 0; i<arr.length; i++){
			System.out.print("Enter a number: ");
			arr[i] = input.nextDouble();
		}
		
		input.close();
		
		//counts the number of elements in [-2.99, 2.99]
		int counter = 0;
		for(int i = 0; i<arr.length; i++){
			if(arr[i]>=-2.99&&arr[i]<=2.99){
				counter++;
			}
		}
		
		
		//create new array with values between -2.99 and 2.99 from the original array
		double[] newArray = new double[counter];
		int index = 0;
		for(int i = 0; i<arr.length; i++){
			if(index == newArray.length){
				break;
			}
			if(arr[i]>=-2.99&&arr[i]<=2.99){
				newArray[index] = arr[i];
				index++;
			}
		}
		
		//print new array
		for(int i = 0; i<newArray.length; i++){
			System.out.print(newArray[i] + " ");
		}
		
	}
}
