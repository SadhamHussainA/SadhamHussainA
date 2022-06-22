package sadhamHussainjaveprojects.SadhamHussainA;

import java.util.Scanner;

public class SwitchStarted {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String bikeBrand="", bikeModel=""; 
		Integer price=0, bikeCc=0;
		
		System.out.println("Could you please provide the expecting Bike Brand");
		bikeBrand=scan.next();
		
		switch(bikeBrand)
		{
		
		case "yamaha":case "YAMAHA":
			System.out.println("THank you for choosing YAMAHA Brand");break;
		case "honda": case "HONDA":
			System.out.println("Thank you for choosing HONDA Brand");break;
		case "tata": case "TATA":
			System.out.println("Thank you for choosing World bese TATA Brand");
			
			switch(bikeModel) {

			
	        System.out.println("Could you please mention which model Bike you need now");
		     bikeModel=scan.next();
				
			case "racebike": case "RACEBIKE":
				System.out.println("You have selected RaceBike model");break;
			case "bypassridingbike":
				System.out.println("YOu have selected ByPass Riding Bike");break;
			case "economybike":
				System.out.println("You have selected Economy Bike");
				
				
				}

		}
         
		


	}
	
}
    
          
    
			
			
		
		
		
