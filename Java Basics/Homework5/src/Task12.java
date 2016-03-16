import java.util.Scanner;

/*Да се създаде метод, който приема за входни данни число N и
връща масив от числа с дължина N, който съдържа всички числа
от 1 до N*/
public class Task12 {
	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		
		//enter a number from the console
		do{
			System.out.print("Enter a number greater than 0:");
			n = input.nextInt();
		}while(n<=0);
		input.close();
		
		int[] arr = generateArr(n);
		printArray(arr);
	}
	static int[] generateArr(int n){
		//create an array with size n
		int[] arr = new int[n];
		//fill the array
		for(int i = 0; i<arr.length; i++){
			arr[i] = i+1;
		}
		//return the result
		return arr;
	}
	
	static void printArray(int[] array){
		for(int i = 0; i<array.length; i++){
			if(i == 0){
				System.out.print("[" + array[i] + ", ");
			}else if(i == array.length-1){
				System.out.print(array[i] + "]");

			}else{
				System.out.print(array[i] + ", ");
			}
		}
	}
}
