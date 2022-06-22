package sadhamHussainjaveprojects.SadhamHussainA;

import java.util.Scanner;

public class LoanEligibility {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		Integer cibil=0; 
		Double ctc=0.0; 
		boolean panAvailable=false;
		
		System.out.println("Enter the Cibil Score");
		cibil=scan.nextInt();
		
		System.out.println("Enter the CTC");
		ctc=scan.nextDouble();
		
		System.out.println("Enter the Do you have PAN OR NOT");
		panAvailable=scan.nextBoolean();
		
		System.out.println("You are Eligible for loan 18Lakhs"+(cibil>=750&&ctc>=7&&panAvailable==true));
		scan.close();
		
	
	}

}
