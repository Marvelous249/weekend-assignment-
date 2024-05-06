import java.util.Scanner;
  public class PurchaseApp2 {
   public static void main(String... args) {
    Scanner input = new Scanner(System.in);
        int totalCost = 0;
	int count = 0;  
        int Discount = 10;

      System.out.println("Welcome to E-store: ");
   
       System.out.println("Please enter Name: ");
         String name = input.nextLine();

     System.out.println("Please Enter number of item purchased: ");
            int noofitem = input.nextInt();

      System.out.println("Please Enter percentage discount: ");
            int percent = input.nextInt();
              
	     while (count <= 10)    {
      System.out.println("Please Enter cost for item: ");
          int item = input.nextInt();
         
	  totalCost += item;
	     count++;
         }

	double actualDiscount = totalCost * Discount / 100 ;

        double discountedCost = totalCost - actualDiscount;
	
	  System.out.println("Customer Name: " + name);
	  System.out.println("Number of item bought: " + noofitem);
	  System.out.println("Percentage discount: " + percent);
	  System.out.println("Original cost: " + totalCost); 
          System.out.printf("Discounted cost: %.1f%n (Discount applied)", discountedCost);
	  System.out.println("Thanks for your patronage!");

	if (totalCost >= 200) {
         System.out.printf("Discount is %.1f%n", actualDiscount);
         }

      else  {
         System.out.printf("Discount: 0 (No Discount applied)");
	   }
	     
          
}

}