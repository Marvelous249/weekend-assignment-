import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printArray(new int[]{5, 2, 8, 1, 9});
    }

    public static void printArray(int[] array) {
        
        for (int i : array) {
            System.out.println(i);
        }
    }
}
