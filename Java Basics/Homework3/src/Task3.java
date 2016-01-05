import java.util.Scanner;

/*Да се въведе число, след което да се създаде масив с 10
 елемента по следния начин:
 Първите 2 елемента на масива са въведеното число.
 Всеки следващ елемент на масива е равен на сбора от
 предишните 2 елемента в масива.
 След това изведете масива*/
public class Task3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		// read a number from console
		System.out.print("enter a number: ");
		n = input.nextInt();
		input.close();

		// declare an array
		int[] array = new int[10];
		array[0] = array[1] = n;
		//fill the array
		for (int i = 2; i < 10; i++) {
			array[i] = array[i - 1] + array[i - 2];
		}

		// print the array
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				System.out.print(array[i]);
				break;
			}
			System.out.print(array[i] + ", ");
		}
	}
}
