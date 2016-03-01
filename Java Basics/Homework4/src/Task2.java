import java.util.Scanner;

/*Имате квадратен двумерен масив от естествени числа, чийто стойности
 се въвеждат от конзолата. Да се отпечатат диагоналите на масива.
 
 Пример:
1,4,6,3
5,9,7,2
4,8,1,9
2,3,4,5
Изход:
1 9 1 5
3 7 8 2
 */
public class Task2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		//read the size of an array from the console
		do{
			System.out.print("Enter the size of an array: ");
			n = input.nextInt();
		}while(n<=0);
		//declare an array
		int[][] array = new int[n][n];
		
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
		//print a diagonal
		for(int i = 0; i<array.length; i++){
			System.out.print(array[i][i] + " ");
		}
		//print a diagonal
		System.out.println();
		for(int i = 0; i<array.length; i++){
			System.out.print(array[i][array.length - 1 - i] + " ");
		}
	}
}
