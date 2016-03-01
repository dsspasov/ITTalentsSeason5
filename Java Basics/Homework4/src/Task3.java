import java.util.Scanner;

/*Имате двумерен масив от числа, чийто стойности са въведени
предварително. Да се отпечатат сумата на елементите на масива,
както и средноаритметичното на тези числа.*/

public class Task3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n,m;
		//enter the size of an array
		do{
			System.out.print("Enter the number of rows of an array: ");
			n = input.nextInt();
			System.out.print("Enter the number of cols of an array: ");
			m = input.nextInt();
		}while(n<=0||m<=0);
		//declare the array
		double[][] array = new double[n][m];
		//fill the array
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print("Enter a value for element " + (i + 1) + "," + (j + 1) + " :");
				array[i][j] = input.nextDouble();
			}
		}

		input.close();
		//find the sum of all elements
		double sum = 0;
		for(int i = 0; i<array.length; i++){
			for(int j = 0; j<array[i].length; j++){
				sum += array[i][j];
			}
		}
		//calculate the average
		double average = sum/(n*m);
		//print results
		System.out.println("The sum of all elements is " + sum);
		System.out.println("The average of all elements is " + average);
		
		
	}
}
