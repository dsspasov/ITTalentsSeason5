import java.util.Scanner;

/*Напишете програма, която намира и извежда най-дългата редица от
еднакви поредни елементи в даден масив.
*/
public class Task82 {
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
		int bestElement = 0;
		int currentElement = array[0];
		//result array will contains the max size and the element with that size
		//the first element is the size of subsequence with equal size
		//the size of this array is array.length+1 because all subsequences can be with size 1
		//array is [1,2,3,4] => the result is [1,1,2,3,4]
		int[] result = new int[array.length+1]; 
		result[0] = 0;
		int size = 0;
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
			if((currentElement != array[i])||(i == array.length - 1)){
				//LOGIC FOR SAVING SUBSEQUENCES WITH THE SAME SIZE
				//check if there are more than 1 subsequence with max size
				//for the first element this won't work because maxLength is 0
				//this works for more than 1 sequences with the same size
				if(maxLength == currentLength){
					//if there are 2 subsequences save the size and elements 
					//check if result[0] == 0 (when there is second subsequence with the same size)
					//result[0] < maxLength this means that if there are more than 1 subsequences 
					//with size > the result[0] than the result array must be pre-initialize
					if(result[0] == 0|| result[0]<maxLength){
						result[0] = maxLength;
						result[1] = bestElement;
						size = 1;
						int index = 2;
						//pre-initialize the array i.e.
						//array  1 1 2 2 3 3 4 4 4 5 5 5
						//the result looks like 2 1 2 3 ... 
						//when max length> result[0](3>2)=> array have to be pre-initialize
						//result 3 4 5 0 0 0...
						while(index<result.length){
							result[index]=0;
							index++;
						}
					}
					int index = 1;
					//fill the result array
					while(index<result.length){
						//find first free position and save the element of the next subsequence
						//with equal size
						if(result[index] == bestElement){
							result[index+1] = currentElement;
							size++;
							break;
						}
						index++;
					}
					//this is corner-case if all subsequences are with size 1,
					//the last element is not saved
					//check if size is 1 and i is the index of the last element
					if(result[0] == 1 && i == array.length-1){
						result[index+2] = array[i];
					}
				}
				//END LOGIC
				
				//check if there is subsequence with >= size that the current best subsequence
				if(maxLength<=currentLength){
					maxLength = currentLength;
					bestElement = currentElement;
				}
				//start new subsequence
				currentElement = array[i];
				currentLength = 1;
			}
		}
		//print the result
		//if the size of last subsequence of equal elements is greater than the size of the other subsequences
		if(maxLength>result[0]){
			System.out.println("The longest subsequence of equal elements size is " + maxLength + " and its elements are " + bestElement);
		}else{
			//print all subsequences with equal size
			int index = 1;
			while(index<=size){
				//print element until there is elements with 
				/*if(result[index] == 0){
					break;
				}else{*/
					System.out.println("The longest subsequence of equal elements size is " + result[0] + " and its elements are " + result[index]);
					index++;	
			}	
		}
	}
}