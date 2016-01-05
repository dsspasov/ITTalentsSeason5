import java.util.Scanner;

/*�� �� ������� ��������, ���� ����� �� ������������� �������� 7
 ����� � ��������� ����� �� �������� ������� �� �������� � �������:
 - 0 � 1 ���� ����� ����������;
 - 2 � 3 ���� ��������;
 - 4 � 5 ���� ���������.
 ������: 1,2,3,4,5,6,7
 �����: 2,1,4,3,6,5,7
 */
public class Task12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// declare an array with size 7
		int[] array = new int[7];

		// fill the array with values from the console
		System.out.println("Please fill the array with numbers");
		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter a number: ");
			array[i] = input.nextInt();
		}
		System.out.println("You've filled the array");
		
		input.close();
		
		//swap values
		//with temp var
		int temp = array[0];
		array[0] = array[1];
		array[1] = temp;
		//with addition
		array[2] = array[2] + array[3];
		array[3] = array[2] - array[3];
		array[2] = array[2] - array[3];
		//with multiplication
		array[4] = array[4]*array[5];
		array[5] = array[4]/array[5];
		array[4] = array[4]/array[5];
		
		//print the array
		for(int i = 0; i<array.length; i++){
			System.out.print(array[i] + " ");
		}
		
		
	};
}
