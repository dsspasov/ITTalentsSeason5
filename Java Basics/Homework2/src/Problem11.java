import java.util.Scanner;

/*Въведете число N чрез конзолата и изкарайте като
резултат следния триъгълник с височина N:
 	*
   ***
  *****
.................
Кaто допълнително упражнение – нарисувайте същия
триъгълник, но незапълнен.*/
public class Problem11 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int N;
		//read a number N from the console and check if it is greater than 0
		do{
			System.out.print("Enter a number: ");
			N = input.nextInt();
		}while(N<=0);
		
		input.close();
		
		//filled triangle
		//		*
		//	   ***
		//    *****
		//   *******
		//  *********
		
		
		for(int line = 1; line<=N; line++){
			//print the white-spaces for each line(white-spaces = N - line)
			for(int whiteSpace = N-line; whiteSpace>0; whiteSpace--){
				System.out.print(" ");
			}
			//print the stars for each line(stars = 2*line-1)
			for(int stars = 1; stars<=2*line-1; stars++){
				System.out.print("*");
			}
			//print new line
			System.out.println("");
		}
		
/*		
		//hollow triangle only with a frame of stars 
		//		*
		//	   * *
		//    *   *
		//	 *******
		for(int line = 1; line<=N; line++){
			//print the white-spaces for each line(white-spaces = N - line)
			for(int whiteSpace = N-line; whiteSpace>0; whiteSpace--){
				System.out.print(" ");
			}
			//for first line print only one *
			if(line == 1){
				System.out.print("*");
			}
			//for last line print only stars(2*N-1 stars)
			else if(line == N){
				for(int q = 1; q<=2*line-1; q++){
					System.out.print("*");
				}
			} else {
				//for all other lines print 2 stars (the first and the last star - the frame)
				//and 2*line-3 white-spaces
				for(int stars = 1; stars<=2*line-1; stars++){	
					if(stars == 1 || stars == 2*line-1){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
			}
			//print new line
			System.out.println("");
		}
		
		
*/
		
		
	}
}
