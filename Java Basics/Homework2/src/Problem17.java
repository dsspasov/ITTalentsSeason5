import java.util.Scanner;

/*Да се състави програма, която извежда квадрат, чийто страни са
 оформени със знака *, а вътрешността е запълнена със въведен
 знак.
 Входни данни b - дължина на страната число от интервала
 [3..20], c - желан знак.
 Програмата да използва цикъл for.
 Пример: 4 +
 Изход:
 ****
 *++*
 *++*
 ****
 */
public class Problem17 {
	public static void main(String[] args) {

		byte b;
		char c;

		Scanner input = new Scanner(System.in);
		// read b(size of square side) and c(symbol) from the console
		// check if b is in [3 ... 20]
		do {
			System.out.print("Enter the size of the square sides: ");
			b = input.nextByte();
			System.out.print("Enter a symbol: ");
			c = input.next().charAt(0);
		} while (b < 3 || b > 20);

		input.close();

		char symbol;

		for (int line = 1; line <= b; line++) {
			// if line is 1(first) or b(last) the symbol is *
			// Otherwise the symbol is c(user's symbol)
			if (line == 1 || line == b) {
				symbol = '*';
			} else {
				symbol = c;
			}
			// print the square
			for (int col = 1; col <= b; col++) {
				//if col is 1(first) or col b(last) print *
				//otherwise print symbol
				if (col == 1 || col == b) {
					System.out.print("*");
				} else {
					System.out.print(symbol);
				}
			}
			System.out.println("");
		}
	}
}
