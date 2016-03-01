import java.util.Scanner;

/*Имате предварително въведени стойности от естествени числа.
Числата са въведени в квадратна таблица с размери 6 реда и 6
колони.
Да се състави програма, чрез която се намира сумата на всички
елементи от редовете с четни номера: 2,4 и 6.
Програмата да извежда и сумата на всеки отделен ред.
Пример:
11,12,13,14,15,16,
21,22,23,24,25,26,
31,32,33,34,35,36,
41,42,43,44,45,46,
51,52,53,54,55,56,
61,62,63,64,65,66
Изход:
21,22,23,24,25,26 сума 141
41,42,43,44,45,46 сума 261
61,62,63,64,65,66 сума 381
Сума на елементите 783

*/
public class Task6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//declare an array
		int[][] array = new int[6][6];
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
		//calculate the sum of elements of rows with even indexes
		int sum = 0;
		for(int i = 1; i<array.length; i+=2){
			int rowSum = 0;
			for(int j = 0; j<array[i].length; j++){
				rowSum += array[i][j];
				if(j == array[i].length - 1){
					System.out.print(array[i][j] + " ");
					break;
				}
				System.out.print(array[i][j] + ", ");
			}
			System.out.print("сума " + rowSum);
			System.out.println();
			sum += rowSum;
		}
		
		//print the result
		System.out.println("Сума на елементите "+sum);
	}
}
