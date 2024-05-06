import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class  ArrayOfIntegerTest{

	@Test
	public void testArrayOfIntegerReturningItInDesendingOrder(){
	int[] array = ArrayOfInteger.sort(new int[]{2, 9, 5, 1, 8});
	int[] expected = {1, 2, 5, 8, 9};
	//assertption
	assertArrayEquals(expected, array);
}
} 
