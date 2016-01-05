/*Напишете програма, която създава масив с 10 елемента и
инициализира всеки от елементите със стойност, равна на индекса на
елемента, умножен по 3.
Да се изведат елементите на екрана.
*/
public class Task5 {
	public static void main(String[] args) {
		//declare an array
		int[] array = new int[10];
		
		//initialize the array
		for(int i = 0; i<10; i++){
			array[i] = i*3;
		}
		
		//print the array
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				System.out.print(array[i]);
				break;
			}
			System.out.print(array[i] + ", ");
		}
		
	}
}
