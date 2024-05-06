import java.util.Scanner;
public class lenghtOfCharacters{
public static void main(String[] args){

Scanner input = new Scanner(System.in);


System.out.println("Enter something: ");
String word = input.nextLine();

int length = word.length();

System.out.println("Length of the string: " + length);

}
}