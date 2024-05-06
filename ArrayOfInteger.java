public class ArrayOfInteger{
    public static int[] sort(int[] array) {
        
        for (int count = 0; count < array.length -1; count++) {
            for (int counter = count + 1; counter < array.length; counter++) {
                if (array[count] > array[counter]) {
		array[count] = array[count] + array[counter];
		array[counter] = array[count] - array[counter];
		array[count] = array[count] - array[counter];
                   
                }
            }
           
        }
	 return array;
    }
}
