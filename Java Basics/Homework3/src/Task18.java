import java.util.Scanner;

/*Дадени са два едномерни масива с естествени числа.
 Да се състави програма, която сравнява всички числа с еднакви
 индекси от двата масива и записва в трети масив, по-голямото от
 двете числа.
 Да се изведе съдържанието и на трите масива
 Пример:
 18,19,32,1,3, 4, 5, 6, 7, 8
 1, 2, 3,4,5,16,17,18,27,11
 Изход:
 18,19,32 ,4,5,16,17,18,27,11*/
public class Task18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		int m;
		// read the size of arrays from console
		do {
			System.out.print("Please enter the size of first array: ");
			n = input.nextInt();
			System.out.print("Please enter the size of second array: ");
			m = input.nextInt();
		} while (n < 1);

		// declare an array
		int[] array1 = new int[n];
		int[] array2 = new int[m];

		// fill the first array with numbers from console
		System.out.println("Please fill the first array");
		for (int i = 0; i < array1.length; i++) {
			System.out.print("Please enter a number: ");
			array1[i] = input.nextInt();
		}
		System.out.println("You've filled the first array");

		// fill the second array with numbers from console
		System.out.println("Please fill the second array");
		for (int i = 0; i < array2.length; i++) {
			System.out.print("Please enter a number: ");
			array2[i] = input.nextInt();
		}
		System.out.println("You've filled the second array");
		input.close();

		//declare the third array
		int length = 0;
		if(array1.length<array2.length){
			length = array1.length;
		}else{
			length = array2.length;
		}
		int[] array3 = new int[length];
		
		//fill the third array
		for(int i = 0; i<array3.length; i++){
			if(array1[i]>array2[i]){
				array3[i] = array1[i];
			}else{
				array3[i] = array2[i];
			}
		}
		
		//print the first array
		for(int i = 0; i<array1.length; i++){
			if(i == array1.length - 1 ){
				System.out.print(array1[i]);
				break;
			}
			System.out.print(array1[i] + ", ");
		}
		
		System.out.println();
		
		//print the second array
		for(int i = 0; i<array2.length; i++){
			if(i == array2.length - 1 ){
				System.out.print(array2[i]);
				break;
			}
			System.out.print(array2[i] + ", ");
		}
		
		System.out.println();
		
		//print the third array
		for(int i = 0; i<array3.length; i++){
			if(i == array3.length - 1 ){
				System.out.print(array3[i]);
				break;
			}
			System.out.print(array3[i] + ", ");
		}
	}
}
