package sadhamHussainjaveprojects.SadhamHussainA;

import java.util.Scanner;

public class ArthimeticOperation {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		Integer serviceBill=0, sparePrice=0;
		Double totalPayable=0.0;
		
		
		System.out.println("Car Service station Bill A");
		serviceBill=scan.nextInt();
		
		System.out.println("Enter the Spare Price amount");
		sparePrice=scan.nextInt();
		
		totalPayable=(double)(serviceBill+sparePrice);
		System.out.println("This amount is without GST----"   + totalPayable);
		
	     totalPayable=totalPayable+(totalPayable*0.044);
	     System.out.println("With GST amount----"+totalPayable);
	     
	     scan.close();
	     
		
		
		
		
	}

}
