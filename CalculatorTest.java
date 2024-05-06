import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest{
	
	@Test
	public void testThatCalcultorCanAddTwoPositiveNumber(){
		int sum = Calculator.add(2,2);
		int expectedSum = 4;
		//asserption
		assertEquals(expectedSum, sum);
		
		
	}
	@Test
	public void testThatCalculatorCanSubtract(){
		int minus = Calculator.subtract(7,4);
		int expectedMinus = 3;
		//asserption
		assertEquals(expectedMinus, minus);
	}
	@Test
	public void testThatCalculatorCanAddTwoNegativeNumber(){
		int plus = Calculator.add(-2,-4);
		int expectedPlus = -6;
		//asserption
		assertEquals(expectedPlus, plus);
	}
	@Test
	public void testThatCalculatorCanMultiply(){
		int total = Calculator.multiply(6,5);
		int expectedtotal = 30;
		//asserption
		assertEquals(expectedtotal, total);
	}
	@Test
	public void testThatCalculatorCanDivide(){
		double division = Calculator.divide(6,5);
		double expecteddivision = 1.2;
		//asserption
		assertEquals(expecteddivision, division);
	}
		
		

}