public class GetingSmallestNumber{
	public static int smallestNumber(int firstNumber, int secondNumber, int thirdNumber){

	int smallest;

	if (firstNumber < secondNumber && firstNumber < thirdNumber) {
		 smallest = firstNumber;
	
	} else if ( secondNumber < thirdNumber) {
		 smallest = secondNumber;

	} else {
		 smallest = thirdNumber;
}

	return smallest;

}
	public static void main(String... args){

	System.out.print(smallestNumber(56,100,65));

}

}
