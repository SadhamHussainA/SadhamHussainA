package sadhamHussainjaveprojects.SadhamHussainA;

import java.util.Scanner;

public class inputMethods {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		Integer mobileCount=0,touchScreen=0;
		Double cameraSpec=0.0, sensorValue=0.0;
		
		
		System.out.println("How many mobile you need");
		mobileCount=scan.nextInt();
		
		
		System.out.println("How many types of touch screen you need");
		touchScreen=scan.nextInt();
		
		
		System.out.println("Please enter your required camera resolution");
		cameraSpec=scan.nextDouble();
		
		
		System.out.println("Which number catagary number sensor you need");
		sensorValue=scan.nextDouble();
		
		System.out.println("You will receive your Dream mobile within 2days");
		
		scan.close();
		
	}
}
