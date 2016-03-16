import java.util.Scanner;

//Да се създаде метод, който отпечатва масив в конзолата.
public class Task11 {
	public static void main(String[] args) {
		//int[] arr = {1,3,5,6,9,1,0,6,54,8,6,4,5,8};
		
		
		Scanner reader = new Scanner(System.in);
		//read size of the arrays
		int n;
		do{
			System.out.print("Enter the size of an array: ");
			n = reader.nextInt();
		}while(n<=0);
		
		//create the array
		int[] arr = new int[n];
		//fill the array
		for(int i = 0; i<arr.length; i++){
			System.out.print("Enter value for element " + (i+1) + ": ");
			arr[i] = reader.nextInt();
		}
		
		reader.close();
		
		printArray(arr);
	}
	
	static void printArray(int[] array){
		for(int i = 0; i<array.length; i++){
			if(i == 0){
				//print first element
				System.out.print("[" + array[i] + ", ");
			}else if(i == array.length-1){
				//print last element
				System.out.print(array[i] + "]");
			}else{
				//print all other elements
				System.out.print(array[i] + ", ");
			}
		}
	}

}
