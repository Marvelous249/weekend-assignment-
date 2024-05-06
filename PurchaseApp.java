import java.util.Scanner;
  public class PurchaseApp {
   public static void main(String... args) {
    Scanner input = new Scanner(System.in);
        int totalCost = 0;
	int count = 0;  
        int Discount = 10;

      System.out.println("Welcome to E-store: ");
   
       System.out.println("Please enter Name: ");
         String name = input.nextLine();

            while (count <= 10)    {
    System.out.println("Please enter cost for item: ");
     int item = input.nextInt();
         
	  totalCost += item;
       	  count++;
	}
	 
          double actualDiscount = totalCost * Discount / 100 ;

         double discountedCost = totalCost - actualDiscount;
	
	  System.out.println("Customer Name: " + name);
	  System.out.println("Original cost: " + totalCost); 
          System.out.printf("Discounted cost: %.1f%n (no discount added)", actualDiscount);

	if (totalCost >= 200) {
         System.out.printf("Discount is %.2f%n", discountedCost);
         }

      else  {
         System.out.println("Discount: 0");
	   }
	 System.out.println("Thanks for your patronage!");

}

}