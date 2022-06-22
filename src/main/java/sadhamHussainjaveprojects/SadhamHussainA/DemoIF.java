package sadhamHussainjaveprojects.SadhamHussainA;

import java.util.Scanner;

public class DemoIF {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
//		Integer noOfproject=0;
//		System.out.println("Enter How many projects you have worked");
//		noOfproject=scan.nextInt();
		
//		if(noOfproject>5)
//		{
//			System.out.println("You will get 50% of high");
			
//		}
//		else
//		{
//			System.out.println("You won't get 50% of high");
//		}
		
		Integer topic=0; 
		
		System.out.println("How many topics you have covered till now");
		topic=scan.nextInt();
	
		
	
		if(topic>=15)
		{
			System.out.println("Jalal will get 100% of marks in practical exam");
			System.out.println("Congrlation you got very best score");
		}
		
		else if(topic>=5)
		{
			System.out.println("Jalal will get maximum 80% of marks in practical exam");
			System.out.println("You want to prepare some more topics");
		
		}
		else if(topic<5)
		{
			System.out.println("Jalal you will get only 50% of score");
			System.out.println("Please prepare another 10 topics");
		}
		
		
	
    scan.close();
	}
	
// After very long time I got result WHY BECAUSE I don't about the Else IF condition... HAHAHAHAH..
}
