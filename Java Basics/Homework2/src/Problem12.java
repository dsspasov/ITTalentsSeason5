/* Да се състави програма, която извежда всички
естествени трицифрени числа, които нямат еднакви цифри т.е.
100,101, 606 и т.н. не се извеждат. */
public class Problem12 {

	public static void main(String[] args) {
		//iterate through all three-digit numbers
		//if the digits of each number are different print the number
		for(int number = 100; number<1000; number++){
			int digit1 = number/100;
			int digit2 = (number/10)%10;
			int digit3 = number%10;
			if(digit1!=digit2&&digit1!=digit3&&digit2!=digit3){
				System.out.println(number);
			}			
		}
	}
}
