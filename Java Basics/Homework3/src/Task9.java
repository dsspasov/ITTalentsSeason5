import java.util.Scanner;

/*Напишете програма, в която потребителя въвежда масив, след което
елементите на масива се обръщат в обратен ред (Целта не е масива да
се отпечата в обратен ред, ами първо да се обърне, след което да се
отпечата в нормален ред). Пробвайте да решите задачата първо с един
допълнителен масив и после без да използвате друг масив.
*/
public class Task9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		//read the size of an array from console
		do{
			System.out.print("Please enter the size of an array: ");
			n = input.nextInt();
		}while(n<1);
		
		//declare an array
		int[] array = new int[n];
		
		//fill the array with numbers from console
		System.out.println("Please fill the array");
		for(int i = 0; i<array.length; i++){
			System.out.print("Please enter a number: ");
			array[i] = input.nextInt();
		}
		System.out.println("You've filled the array");
		input.close();
		
		//solution 1(with an additional array)
		//declare new array
		int[] newArray = new int[array.length];
		//fill the new array with values from the original array but in reversed order
		for(int i = 0; i<array.length; i++){
			newArray[i] = array[array.length - 1 - i];
		}
		
		//print new array
		System.out.println("Solution1:");
		for(int i = 0; i<newArray.length; i++){
			System.out.print(newArray[i] + " ");
		}
		System.out.println();
		
		//solution 2(without an additional array)
		for(int i = 0; i<(array.length+1)/2; i++){
			int temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
		System.out.println("Solution2:");
		//print the array
		for(int i = 0; i<array.length; i++){
			System.out.print(array[i] + " ");
		}
	}
}
