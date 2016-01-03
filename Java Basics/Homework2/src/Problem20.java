/*
 * Да се състави програма, чрез която се извежда квадрат от
цифри. Сумите от елементите на произволен ред или стълб са
равни на 45.
Пример:
1 2 3 4 5 6 7 8 9 0
2 3 4 5 6 7 8 9 0 1
3 4 5 6 7 8 9 0 1 2
4 5 6 7 8 9 0 1 2 3
5 6 7 8 9 0 1 2 3 4
6 7 8 9 0 1 2 3 4 5
7 8 9 0 1 2 3 4 5 6
8 9 0 1 2 3 4 5 6 7
9 0 1 2 3 4 5 6 7 8
0 1 2 3 4 5 6 7 8 9*/
public class Problem20 {
	public static void main(String[] args) {
		int sum = 0;
		//start defines the number in the top left corner
		int start = 1;
		//for each line print numbers and check if their sum is 45
		for (int i = 0; i < 10; i++) {
			for(int j = 0; j<10; j++){
				if(sum>45){
					break;
				}
				//add a number to the sum
				sum += (i + j + start) % 10;
				//print a number
				System.out.print(((i + j + start) % 10) + " ");
			}
			sum = 0;
			//print new line
			System.out.println("");
		}
	}
}
