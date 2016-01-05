import java.util.Scanner;

/*Да се прочете масив и да се отпечата дали е огледален.
Следните масиви са огледални:
[3 7 7 3]
[4]
[1 55 1]
[6 27 -1 5 7 7 5 -1 27 6]*/
public class Task4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		//read the size of an array from console
		do {
			System.out.print("enter a number for array's length: ");
			n = input.nextInt();
		} while (n < 1);
		//declare an array with size n
		int[] array = new int[n];

		//read n number from console and fill the array
		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter a number: ");
			array[i] = input.nextInt();
		}

		input.close();
		//iterate through the array and check if it is inverted
		boolean isInverted = true;
		for(int i = 0; i<(array.length+1)/2; i++){
			if(array[i] != array[array.length-1-i]){
				isInverted = false;
			}
		}
		//print result
		if(isInverted){
			System.out.println("The array is inverted");
		}else{
			System.out.println("The array is not inverted");
		}
	}
}
