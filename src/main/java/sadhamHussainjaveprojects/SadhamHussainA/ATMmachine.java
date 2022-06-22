package sadhamHussainjaveprojects.SadhamHussainA;

import java.util.Scanner;

public class ATMmachine {
    public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 Integer amount=0, receiveNotes=0,price=0, quantity=0;
		 String brand="";
		 Double payable=0.0;
		 System.out.println("Super Store Bill");
			
			System.out.println("Enter the Product Price");
			price=scan.nextInt();
			
			System.out.println("Enter the Qantity of the product");
		    quantity=scan.nextInt();
		    
		    System.out.println("Which Brand product you need now");
		    brand=scan.next();
		    
		    payable= payable+(price*quantity);
		    System.out.println("Bill amount without GST----" +payable);
		    
		    payable=(payable*0.5);
		    System.out.println("Bill amount wihtGST----"+payable);
		    
		    
		   System.out.println("Your Produce price is"+price+"you have purchased quantity is"+quantity+"Your best brand is"+brand+"Thank you so much for reaching us your are Welcome again");
		
		   System.out.println("Customer going to Withdraw the money from ATM machine");
		 
		 System.out.println("ATM asking Enter the required amount");
		 amount=scan.nextInt();
		 
		 receiveNotes=(amount/2000);
		 System.out.println("You will receive the number of notes----"+receiveNotes);
		 
		 System.out.println("You have entered amount is"+amount+"Now you will receive note count is"+receiveNotes);
		 System.out.println("Customer will pay number of 2000Rs notes is ---"+receiveNotes);
		 scan.close();
	}
}
