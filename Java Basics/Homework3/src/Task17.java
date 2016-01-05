import java.util.Scanner;

/*Една редица от естествени числа ще наричаме зигзагообразна нагоре,
ако за елементите и са изпълняват условията:
N1 < N2 > N3 < N4 > N5 <..
Съставете програма, която проверява дали въведени в едномерен
масив редица от числа изпълняват горните изисквания.
Пример: 1 3 2 4 3 7
Изход: изпълнява изискванията за зигзагообразна нагоре редица*/
public class Task17 {
	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		//read a number from the console
		do{
			System.out.print("Enter the size of an array: ");
			n = input.nextInt();
		}while(n<3);
		
		//declare the array
		int[] array = new int[n];
		
		//fill the array
		for(int i = 0; i<array.length; i++){
			System.out.print("Enter a number: ");
			array[i] = input.nextInt();
		}
		
		input.close();
		
		//check if the array is zigzag
		boolean isJagged = true;
		for(int i = 1; i<array.length-1; i+=2){
			if(!((array[i-1]<array[i])&&(array[i]>array[i+1]))){
				isJagged = false;
				break;
			}
		}
		if(isJagged){
			System.out.println("изпълнява изискванията за зигзагообразна нагоре редица");
		}else{
			System.out.println("не изпълнява изискванията за зигзагообразна нагоре редица");
		}
	}
}
