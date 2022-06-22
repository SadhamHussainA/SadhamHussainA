package sadhamHussainjaveprojects.SadhamHussainA;

import java.util.Scanner;

public class RelationalOperators {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
//		Integer expectation=0;
		
//		System.out.println("Tell us how many months need to work");
//		expectation=scan.nextInt();
		
//		System.out.println("You will reach your goals soon if you work smart  "+(expectation>=5));
		
//		scan.close();
		
		Integer amount=0;
		
		System.out.println("How much amount you need in 2000Rs notes");
		amount=scan.nextInt();
		
		System.out.println(amount%2000==0);
		System.out.println("Only 200 Rs Notes are available");
		System.out.println(amount%200==0);
		
		scan.close();
		
		
	}

}

// Notes it's finding only true or False 
