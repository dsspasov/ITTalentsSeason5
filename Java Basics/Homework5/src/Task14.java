import java.util.Scanner;

/*Да се състави метод, който приема за стойност число N и връща
стойността на N! (N факториел).*/
public class Task14 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n;
		do{
			System.out.println("Enter a number >= 0: ");
			n = reader.nextInt();
		}while(n<0);
		
		reader.close();
		
		System.out.println(factorialR(n));
		System.out.println(factorialR(39));
		System.out.println(factorialL(39));
	}
	
	//solution 1 - recursion
	static long factorialR(int n){
		if( n == 1 || n == 0){
			return 1;
		}
		return n * factorialR(n-1);
	}
	
	//solution 2 - for loop
	static long factorialL(int n){
		long fact = 1;
		for(int i = 2; i<=n; i++){
			fact *= i;
		}
		return fact;
	}
}
