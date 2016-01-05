import java.util.Scanner;

/*Да се състави програма, която въвежда в едномерен масив реални
 числа.
 Като изход: програма извежда онези 3 различни числа, чиято
 абсолютна стойност формира максималната обща сума.
 Пример: 7.13; 0.2; 4.9; 5.1; 6.34; 1.12
 Изход: 5.1; 6.34; 7.13*/
public class Task15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		// read the size of an array from the console
		do {
			System.out.println("The size of the array has to be greater than or equal 3");
			System.out.print("Enter the size of the array: ");
			n = input.nextInt();
		} while (n < 3);

		// declare an array
		double[] arr = new double[n];

		// fill the array with numbers
		System.out.println("Please fill the array with numbers from console.");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter a number: ");
			arr[i] = input.nextDouble();
		}
		System.out.println("You have filled the array");
		input.close();
		//double[] arr = {-5.0, 0.3, 3.2, -8.1, 10.1, -8.8, 10.1};
		
		if (arr.length == 3) {
			System.out.println(arr[0] + ", " + arr[1] + ", " + arr[2]);
		} else {
			// find the 3 least elements in the array
			for (int i = 0; i < 3; i++) {
				double min = arr[i];
				int index = i;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[j] < min) {
						min = arr[j];
						index = j;
					}
				}
				arr[index] = arr[i];
				arr[i] = min;
			}

			// find the 3 biggest elements in the array
			for (int i = arr.length - 1; i > 2; i--) {
				double max = arr[i];
				int index = i;
				for (int j = i - 1; j > 2; j--) {
					if (max < arr[j]) {
						max = arr[j];
						index = j;
					}
				}
				arr[index] = arr[i];
				arr[i] = max;
			}

			//find max sum and print the result
			double sum1 = arr[0] + arr[1] + arr[2];
			double sum2 = arr[arr.length - 3] + arr[arr.length - 2] + arr[arr.length - 1];
			if (sum1 < 0) {
				sum1 = -sum1;
			}
			if (sum2 < 0) {
				sum2 = -sum2;
			}
			if (sum1 > sum2) {
				System.out.println("Result: " + arr[0] + ", " + arr[1] + ", " + arr[2]);
			} else {
				System.out.println("Result: " + arr[arr.length - 3] + ", " + arr[arr.length - 2] + ", " + arr[arr.length - 1]);
			}
		}
	}
}
