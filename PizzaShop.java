import java.util.Scanner;
public class PizzaShop{
public static void main(String[] args){

Scanner input = new Scanner (System.in);

System.out.print("Pizza type\t Number of Slices\t Price per box\n");
System.out.print("\nsapa size\t\t 4\t\t  2,000\n");
System.out.print("\nsmall Money\t\t 6\t\t  2,400\n");
System.out.print("\nbig boys\t\t 8\t\t  3,000\n");
System.out.print("\nodogwu\t\t\t 12\t\t  4,200\n");

System.out.println("\n\nHow many guest are you ordering for? "); 
int guest = input.nextInt();

input.nextLine();
System.out.println("\n\nWhat pizza type do you want? "); 
String pizzaType = input.nextLine();



if (pizzaType.equalsIgnoreCase("odogwu")){

int odogwu = guest / 12+ 1 ;
int remainingSlices = (odogwu * 12) - guest;

System.out.print("\nNumber of boxes to buy = "+ odogwu+ " boxes (explanation: Odogwu contains 12 slices per box. "+ odogwu+ " boxes should be sufficient as it would contain "+ odogwu * 12+ " Slices in all.)\n");

System.out.print("\nNumber of left over slices would be = "+ remainingSlices+ " (explanation: after serving "+ guest + " slices, you should have "+ remainingSlices+ " left)");
}

else if (pizzaType.equalsIgnoreCase("Big boys")){

int bigBoy = guest / 8 + 1;
int remainingBigboySlices = (bigBoy * 8) - guest;

System.out.print("\nNumber of boxes to buy = "+ bigBoy+ " boxes (explanation: big Boy contains 8 slices per box. "+ bigBoy+ " boxes should be sufficient as it would contain "+ bigBoy * 8+ " Slices in all.)\n");

System.out.print("\nNumber of left over slices would be = "+ remainingBigboySlices+ " (explanation: after serving "+ guest+ " slices, you should have "+ remainingBigboySlices+ " left)");
}



else if (pizzaType.equalsIgnoreCase("small money")){

int smallMoney = guest / 6 + 1;
int remainingSmallMoneySlices = (smallMoney * 6) - guest;

System.out.print("\nNumber of boxes to buy = "+ smallMoney+ " boxes (explanation: small Money contains 6 slices per box. "+ smallMoney+ " boxes should be sufficient as it would contain "+ smallMoney * 6+ " Slices in all.)\n");

System.out.print("\nNumber of left over slices would be = "+ remainingSmallMoneySlices+ " (explanation: after serving "+ guest+ " slices, you should have "+ remainingSmallMoneySlices+ " left)");
}



else if (pizzaType.equalsIgnoreCase("sapa size")){

int sapaSize = guest / 4 + 1;
int remainingSapaSizeSlices = (sapaSize * 4) - guest;

System.out.print("\nNumber of boxes to buy = "+ sapaSize+ " boxes (explanation: sapa Size contains 4 slices per box. "+ sapaSize+ " boxes should be sufficient as it would contain "+ sapaSize * 4+ " Slices in all.)\n");

System.out.print("\nNumber of left over slices would be = "+ remainingSapaSizeSlices+ " (explanation: after serving "+ guest+ " slices, you should have "+ remainingSapaSizeSlices+ " left)");
}




else System.out.print("\nEnter a valid pizza type");


}
}