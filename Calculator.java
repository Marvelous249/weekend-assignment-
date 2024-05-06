public class Calculator{
	public static int add(int firstNumber, int secondNumber){
	
	int sum = firstNumber + secondNumber;

		return sum;



	}
public static int subtract(int firstNumber, int secondNumber){
	
	int minus = firstNumber - secondNumber;

		return minus;



	}
public static int multiply(int firstNumber, int secondNumber){
	
	int total = 0;
	
	for(int i = 0; i < secondNumber; i++){
		total += firstNumber;
	}		
		return total;


}
public static double divide(double firstNumber, double secondNumber){
	
	double division = firstNumber / secondNumber;

		return division;
}


}