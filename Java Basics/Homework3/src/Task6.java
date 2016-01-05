import java.util.Scanner;

/*Напишете програма, която първо чете 2 масива и после извежда
съобщение дали са еднакви, и дали са с еднакъв размер.
*/
public class Task6 {
	public static void main(String[] args) {
		int n,m;
		Scanner input = new Scanner(System.in);
		//read 2 numbers
		do{
			System.out.print("Enter the size of first array: ");
			n = input.nextInt();
			System.out.print("Enter the size of second array: ");
			m = input.nextInt();
		}while(n<0||m<0);
		
		//declare 2 arrays
		int[] arr1 = new int[n];
		int[] arr2 = new int[m];
		
		//fill the first array
		System.out.println("Fill the first array");
		for(int i = 0; i<n; i++){
			System.out.print("Enter a number: ");
			arr1[i] = input.nextInt();
		}
		//fill the second array
		System.out.println("Fill the second array: ");
		for(int i = 0; i<m; i++){
			System.out.print("Enter a number: ");
			arr2[i] = input.nextInt();
		}
		
		input.close();
		//check if the arrays have different size
		if(arr1.length != arr2.length){
			System.out.println("The arrays are with different size");
		}else{
			//check if the arrays are equal
			boolean isEqual = true;
			for(int i = 0; i<arr2.length; i++){
				if(arr1[i]!=arr2[i]){
					isEqual = false;
					break;
				}
			}
			
			//print the result
			if(isEqual){
				System.out.print("Equal");
			}else{
				System.out.print("Not equal");
			}			
		}
	}
}
