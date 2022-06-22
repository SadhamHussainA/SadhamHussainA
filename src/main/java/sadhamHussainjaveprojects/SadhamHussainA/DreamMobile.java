package sadhamHussainjaveprojects.SadhamHussainA;

import java.util.Scanner;

public class DreamMobile {
	public static void main(String[] args) {
		
		
		Scanner scanspec=new Scanner(System.in);
		Integer price=0, modelNumber=0;
		Double cameraResolution=0.0;
		 
		System.out.println("NOW YOU CAN SELECT APPLE BRAND MOBILE");
		
		System.out.println("Please Enter your Affordable Price");
		price=scanspec.nextInt();
		
		System.out.println("Please enter your Dream Mobile ModelNumber");
		modelNumber=scanspec.nextInt();
		
		System.out.println("Please enter your required Camera Resolution");
		cameraResolution=scanspec.nextDouble();
		
		System.out.println("You will receive mobile through Ekart within 2days Thank you for choosing us");
		
		scanspec.close();
	}

}
