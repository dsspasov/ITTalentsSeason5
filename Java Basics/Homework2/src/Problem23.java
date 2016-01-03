/*Да се състави програма, която чрез цикъл while извежда
таблицата за умножение, но без повторение.
Т.е. ако е изведено 4*5 не се извежда 5*4. 

*Пример:
1-ви ред: 1*1; 1*2; 1*3; 1*4; 1*5; 1*6; 1*7; 1*8; 1*9;
2-ри рeд: 2*2; 2*3; 2*4; 2*5; 2*6; 2*7; 2*8; 2*9;
...
9-ти ред: 9*9;
*/
public class Problem23 {
	public static void main(String[] args) {
		
		byte i = 1;
		while(i<=9){
			int j = i;
			if(i==1){
				System.out.print("1-ви ред: ");
			}else if(i==2){
				System.out.print("2-ри ред: ");
			}else{
				System.out.print(i+"-ти ред: ");
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
