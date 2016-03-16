import java.util.Scanner;

/*Да се създаде метод, който приема два масива от числа и връща
масив, съдържащ всички елементи на подадените масиви, като в
първата част на масива са елементите на първия подаден масив,
а във втората част – тези на втория подаден масив.
*/
public class Task13 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		//read size of the arrays
		int n,m;
		do{
			System.out.print("Enter the size of first array: ");
			n = reader.nextInt();
			System.out.print("Enter the size of second array: ");
			m = reader.nextInt();
		}while(n<=0||m<=0);
		
		//int[] arr1 = {1,2,3,4};
		//int[] arr2 = {6,7,8,9,10};
		
		//create the frst array
		int[] arr1 = new int[n];
		//fill the first array
		for(int i = 0; i<arr1.length; i++){
			System.out.print("Enter value for element " + (i+1) + ": ");
			arr1[i] = reader.nextInt();
		}
		//create the second array
		int[] arr2 = new int[m];
		//fill the second array
		for(int i = 0; i<arr2.length; i++){
			System.out.print("Enter value for element " + (i+1) + ": ");
			arr2[i] = reader.nextInt();
		}
		
		reader.close();
		//concatenate the arrays
		int[] result = concatArrays(arr1, arr2);
		
		//print the result
		for(int i = 0; i<result.length; i++){
			if(i == 0){
			System.out.print("{" + result[i] + ", ");
			}else if( i == result.length - 1){
				System.out.println(result[i] + "}");
			}else{
				System.out.print(result[i] + ", ");
			}
		}		
		
	}
	
	static int[] concatArrays(int[] array1, int[] array2){
		//create a new array with size = array1.size + array2.size
		int[] result = new int[array1.length + array2.length];
		int i;
		//fill the new array
		for(i = 0; i<array1.length; i++){
			result[i] = array1[i];
		}
		for(int j = 0; j<array2.length; j++){
			result[i+j] = array2[j];
		}
		
		//return the result
		return result;
	}
}
