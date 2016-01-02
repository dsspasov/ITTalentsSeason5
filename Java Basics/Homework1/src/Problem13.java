import java.util.Scanner;

/*
 * Да се състави програма, която да отгатне колко е студено/топло по
 * въведената температура t в градус Целзий.
 * Температурните интервали са:
 * под -20 ледено студено;
 * между 0 и -20 - студено;
 * между 15 и 0 - хладно;
 * между 25 и 15 - топло;
 * над 25 – горещо.
*/


public class Problem13 {
	public static void main(String[] args) {
		//read the temperature from the console
		//int temperature;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a temperature: ");
		int temperature = input.nextInt();
		input.close();
		
		//make a guess
		if(temperature<=-20){
			System.out.println("ледено студено");
		}else if(temperature<=0){
			System.out.println("студено");
		}else if(temperature<=15){
			System.out.println("хладно");
		}else if(temperature<=25){
			System.out.println("топло");
		}else{
			System.out.println("горещо");
		}	
		
		
		/*System.out.println(temperature<=-20 ?
				"ледено студено" : temperature<=0 ?
				"студено": temperature<=15 ?
				"хладно": temperature<=25 ?
				"топло": "горещо");*/
	}
	

}
