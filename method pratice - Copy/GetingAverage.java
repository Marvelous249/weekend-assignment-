public class GetingAverage{
	public static int averageNumber(int firstNumber, int secondNumber, int thirdNumber){

	int sum = firstNumber + secondNumber + thirdNumber;

	int average = sum / 3;

	return average;
}

	public static void main(String... args){

	System.out.print(averageNumber(25, 45,65));

}

}