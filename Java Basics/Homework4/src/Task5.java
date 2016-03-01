import java.util.Scanner;

/*�� �� ������� ��������, ��� ����� ������������� �� ��������
���������� ����� � �������� ����� 4*4 ��������.
���������� �� ������� �������� �� ���������� ����� � �������������
�� ���-�������� ���� �� ������ ������ ���-�������� ���� �� ������.
������:
1,2,3,4
5,6,7,8
9,10,11,12
13,14,15,16
�����:
���-������ ���� �� ������ 58
���-������ ���� �� ������ 40
������������ ���� �� ������ � > �� ������������ ���� �� ������
*/
public class Task5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//declare an array
		int[][] array = new int[4][4];
		
		//fill the array
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print("Enter a value for element " + (i + 1) + "," + (j + 1) + " :");
				int value = input.nextInt();
				while(value<=0){
					System.out.print("Please enter a natural number for element " + (i + 1) + "," + (j + 1) + " :");
					value = input.nextInt();
				}
				array[i][j] = value;

			}
		}
		
		input.close();
		int sumRows = 0;
		int sumCols = 0;
		int bestSumRows = 0;
		int bestSumCols = 0;
		boolean firstSum = true;
		//find the biggest sum of the cols and the biggest sum of rows
		for(int i = 0; i<array.length; i++){
			for(int j = 0; j<array[i].length; j++){
				sumCols += array[j][i];
				sumRows += array[i][j];
			}
			if(firstSum){
				bestSumRows = sumRows;
				bestSumCols = sumCols;
				firstSum = false;
			}
			if(bestSumRows < sumRows){
				bestSumRows = sumRows;
			}if(bestSumCols < sumCols){
				bestSumCols = sumCols;
			}
			sumRows = sumCols = 0;
		}
		//print the result
		System.out.println("���-������ ���� �� ������ " + bestSumRows);
		System.out.println("���-������ ���� �� ������ " + bestSumCols);
		if(bestSumRows>bestSumCols){
			System.out.println("������������ ���� �� ������ � > �� ������������ ���� �� ������");
		}else if(bestSumRows<bestSumCols){
			System.out.println("������������ ���� �� ������ � < �� ������������ ���� �� ������");
		}else{
			System.out.println("������������ ���� �� ������ � = �� ������������ ���� �� ������");
		}
	}

}
