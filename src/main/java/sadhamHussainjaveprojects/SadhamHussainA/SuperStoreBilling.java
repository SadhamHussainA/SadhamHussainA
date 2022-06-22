package sadhamHussainjaveprojects.SadhamHussainA;

import java.util.Scanner;

public class SuperStoreBilling {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		Integer price=0, quantity=0; String brand="";
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
	    
	    scan.close();
	    
	    			
	}
}
