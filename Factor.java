import java.util.Scanner;
	public class Factor {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
		
	System.out.print("ENTER A NUMBER: ");
	int number = input.nextInt();

	int factorsOfNumber = Kata.Factor(number);

	System.out.print(factorsOfNumber);
		}
	}