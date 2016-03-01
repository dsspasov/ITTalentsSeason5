import java.util.Scanner;
/*Имате двумерен масив 6х5 от естествени числа, чийто стойности са
въведени предварително.
Да се състави програма, чрез която се извеждат елементите от масива
с най-малката и най-голямата стойност.
Пример:
48,72,13,14,15
21,22,53,24,75
31,57,33,34,35
41,95,43,44,45
59,52,53,54,55
61,69,63,64,65
Изход:
най-малко 13;
най-голямо 95
*/

public class Task1 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[][] array = new int[6][5];
		//fill the array with values from the console
		for(int i = 0; i<array.length; i++){
			for(int j = 0; j<array[i].length; j++){
				System.out.print("Enter a value for element " + (i+1) + "," + (j+1)+" :" );
				int value = input.nextInt();
				while(value<=0){
					System.out.print("Please enter a natural number for element " + (i + 1) + "," + (j + 1) + " :");
					value = input.nextInt();
				}
				array[i][j] = value;

			}
		}
		
		input.close();
		//initialize min and max
		int max = array[0][0];
		int min = array[0][0];
		
		//find min and max
		for(int i = 0; i<array.length; i++){
			for(int j = 0; j<array[i].length; j++){
				if(max<array[i][j]){
					max = array[i][j];
				}
				
				if(min>array[i][j]){
					min = array[i][j];
				}
			}
		}
		
		//print the result
		System.out.println("Най-малко: " + min);
		System.out.println("Най-голямо: " + max);
	}

}
