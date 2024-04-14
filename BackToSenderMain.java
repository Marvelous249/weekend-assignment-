import java.util.Scanner;

public class BackToSenderMain {
 public static void main(String[] args) {

   Scanner input = new Scanner(System.in);

 System.out.println("enter the number of successful delivery");
        int userInput = input.nextInt();

  int rider = BackToSender.riderWage(userInput);

 System.out.println(rider);


}
}  