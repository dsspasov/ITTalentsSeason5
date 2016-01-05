import java.util.Scanner;

/*Напишете програма, която намира и извежда най-дългата редица от
еднакви поредни елементи в даден масив.
*/
public class Task8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//read the size of the array from console
		int n;
		do{
			System.out.print("Please enter the size of an array:");
			n = input.nextInt();
		}while(n<=0);
		
		//declare the array
		int[] array = new int[n];
		
		//fill the array with numbers from the console
		System.out.println("Please fill the array");
		for(int i = 0; i<array.length; i++){
			System.out.print("Please enter a number: ");
			array[i] = input.nextInt();
			
		}
		System.out.println("You've filled the array");
		
		input.close();
		
		
		//THE SOLUTION WORKS IF THERE ARE ONE OR MORE THAT ONE SUBSEQUENCES WITH EQUAL SIZE
		//find the longest subsequence with equal elements
		int maxLength = 0;
		int currentLength = 1;
		int currentElement = array[0];
		//result array will contain the max size and the element with that size
		//the first element is the size of subsequence
		//the size of this array is array.length+1 because all subsequences can be with size 1
		//array is [1,2,3,4] => the result is [1,1,2,3,4]
		int[] result = new int[array.length+1]; 
		result[0] = 0;
		int length = 0;
		
		//if array length is 1 then this is the only subsequence
		if(array.length == 1){
			System.out.println("The longest subsequence of equal elements size is " + currentLength + " and its elements are " + currentElement);
		}
		for(int i = 1; i<array.length; i++){
			//check if current element equals the next element
			if(currentElement == array[i]){
				currentLength++;
			}
			//if current element is different than the next element 
			//or i == array.length-1 (this is useful when the last subsequence has the same size or bigger)
			//[1,1,2,2,3,3,4,4,4]
			if(currentElement != array[i] || i == array.length-1){
				
				//check if current subsequence has the same size as previous sequences;
				if(maxLength == currentLength&&result[length] != currentElement){
					result[++length] = currentElement;
				}
				//this is corner-case if all subsequences are with size 1,
				//the last element is not saved
				//check if size is 1 and i is the index of the last element
				if(result[0] == 1 && i == array.length-1){
					result[++length] = array[i];
				}

				//check if there is subsequence with > size that the current best subsequence
				if(maxLength<currentLength){
					maxLength = currentLength;					
					result[0] = currentLength;
					result[1] = currentElement;
					length = 1;
				}
				
				//start new subsequence
				currentElement = array[i];
				currentLength = 1;
			}
		}
		//print the result
		for(int i = 1; i<=length; i++){
			System.out.println("The longest subsequence of equal elements size is " + result[0] + " and its elements are " + result[i]);
		}
	}
}