package sadhamHussainjaveprojects.SadhamHussainA;

import java.util.Scanner;

public class RelationalTry2 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		Integer age=0;
		
		System.out.println("Here we can check the eligibility to go Space");
		
		System.out.println("You can Enter the age");
		
		age=scan.nextInt();
		System.out.println("You can go space"+(age>25));
		System.out.println("You can't go space"+(age<24));
		scan.close();
		
	}

}
