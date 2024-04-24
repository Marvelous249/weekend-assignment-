mport java.util.Array;
public class Array{

	public static void main(String [] args){


int numbers [] =  {6,5,9};

int[] number = doubledNumbers(numbers);

System.out.print(Arrays.toString(number));
}


public static int[] doubledNumbers(int [] numbers){

int[] num = new int[numbers.length * 2];

for (int i = 0; i < numbers.length; i++){
num[i] = numbers[i];
num[i + numbers.length] = numbers[i] * 2;

}

return num;

}
}