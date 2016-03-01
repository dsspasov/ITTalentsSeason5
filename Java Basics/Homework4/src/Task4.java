import java.util.Scanner;

/*Имате предварително въведени стойности на елементи в двумерен
масив - естествени числа.
Да се състави програма, чрез която се извеждат стойностите на
елементите в двумерен масив след обръщането му на +90 градуса.
Пример:
1,2,3,4
5,6,7,8
9,10,11,12
13,14,15,16
Изход
13,9,5,1
14,10,6,2
15,11,7,3
16,12,8,4
*/
public class Task4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n,m;
		
		//read the size of the array from the console
		do{
			System.out.print("Enter the number of rows of an array: ");
			n = input.nextInt();
			System.out.print("Enter the number of cols of an array: ");
			m = input.nextInt();
		}while(n<=0||m<=0);
		
		//declare an array
		int[][] array = new int[n][m];
		//fill the array
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print("Enter a value for element " + (i + 1) + "," + (j + 1) + " :");
				int value = input.nextInt();
				while(value<=0){
					System.out.print("Please enter a natural number for element " + (i + 1) + "," + (j + 1) + " :");
					value = input.nextInt();
				}
				array[i][j] = value;
			}
		}
		
		input.close();
		
		//print the original array
		System.out.println("Original array");
		for(int i = 0; i<array.length; i++){//4
			for(int j = 0; j<array[i].length; j++){//5
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
		//print original array but rotated
		System.out.println("Rotate the original array");
	
		for(int j = 0; j<array[0].length;j++){
			for(int k = array.length-1; k>=0; k--){
				System.out.print(array[k][j] + " ");
			}
			System.out.println();
		}
	}
}
