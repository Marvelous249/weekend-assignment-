import java.util.Scanner;
public class nameToAesteriks{
public static void main(String[] args){

Scanner input = new Scanner(System.in);


System.out.println("Enter something: ");
String word = input.nextLine();

int length = word.length();

String aesterik = "*".repeat(length);

System.out.println(aesterik);

}
}