/*�� �� ������� ��������, ����� ���� ����� while �������
��������� �� ���������, �� ��� ����������.
�.�. ��� � �������� 4*5 �� �� ������� 5*4. 

*������:
1-�� ���: 1*1; 1*2; 1*3; 1*4; 1*5; 1*6; 1*7; 1*8; 1*9;
2-�� �e�: 2*2; 2*3; 2*4; 2*5; 2*6; 2*7; 2*8; 2*9;
...
9-�� ���: 9*9;
*/
public class Problem23 {
	public static void main(String[] args) {
		
		byte i = 1;
		while(i<=9){
			int j = i;
			if(i==1){
				System.out.print("1-�� ���: ");
			}else if(i==2){
				System.out.print("2-�� ���: ");
			}else{
				System.out.print(i+"-�� ���: ");
			}
			//j >= i
			//multiply i with numbers from i to 9 
			while(j<=9){
				//print i*j
				System.out.print(i+"*"+j+";");
				
				j++;
			}
			//print new line
			System.out.println("");
			i++;
		}
	}
}
