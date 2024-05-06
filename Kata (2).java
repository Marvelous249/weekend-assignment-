public class Kata{
	public static boolean isEven(int number) {

	boolean isEven = number % 2 == 0;

	if (isEven) return true;

	else  return false; 
	
}
	public static boolean isPrime(int number) {
	
	int counter = 1;
	int factor = 0; 

	while (counter <= number) {

	if (number % counter == 0) {

	factor = factor + 1;
	}

	counter ++ ; } 

	return factor <= 2;	
	
}

	public static int Factor(int number) { 
	
	int counter = 1;
	int factor = 0;
	while (counter <= number) {

	if (number % counter == 0) {

	factor ++;
	}
	counter ++ ;  
	}
	return factor;
}

	public static boolean Pallindrome(int number){
	 
	int num1 = number / 10000;
	int num2 = (number / 1000 ) % 10;
	int num3 = (number / 100) % 10;
	int num4 = (number / 10) % 10;
	int num5 = number % 10;

	return (num1 == num5 && num2 == num4);
		
}
	public static int factorial(int number){

	int factorial = 1;
	for ( int i = 1; i <= number; i++){
	factorial = factorial * i;
	}
	return factorial;

}
	public static int subtract (int number , int number2){


	int sum = number + Math.abs(number2);
	return sum;
}
	public static float division (float number, float number2){
	
	float division = number / number2;
	return division;
}

	public static boolean isSquare (int number){

	double square = Math.sqrt(number);
	return square == Math.floor(square);
}

}
