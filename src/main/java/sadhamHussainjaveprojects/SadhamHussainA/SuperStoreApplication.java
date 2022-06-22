package sadhamHussainjaveprojects.SadhamHussainA;


//** Scanner and Arithmetic operation on the same operation *//

import java.util.Scanner;

public class SuperStoreApplication {

	public static void main(String[] args) {
		 
		Scanner scanobj=new Scanner(System.in);
		Integer price=0, quantity=0;
	     Double totalPrice=0.0, withGst=0.0, gstDeduction=0.0;
	    		 
	     System.out.println("Super Store Bill");
	
	     System.out.println("What about your price expectaion");
	     price=scanobj.nextInt();
	     
	     System.out.println("How much quantity you need");
	     quantity=scanobj.nextInt();
	     
	     
	     System.out.println("Your total Bill amount is ");
	     totalPrice=(double)quantity*price;
	     System.out.println(totalPrice);
	     
	     System.out.println("You total Bill along with GST");
	     withGst=totalPrice*18;
	     System.out.println(withGst);
	     
	     System.out.println("User saying I am having GST deduction Option");
	     gstDeduction=withGst/18;
	     System.out.println(gstDeduction);
	     
	     System.out.println("Thank you for choosing us for the purchase you are Welcom again");
	     
	     scanobj.close();
	     
	}
}
