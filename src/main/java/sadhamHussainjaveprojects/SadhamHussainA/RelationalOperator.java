package sadhamHussainjaveprojects.SadhamHussainA;

import java.util.Scanner;

public class RelationalOperator {
     public static void main(String[] args) {
		
    	 Scanner scan=new Scanner(System.in);
    	 Integer experiance=0;
    	 
    	 System.out.println("Here you can check what kind of role you will get in this Org");
    	 
    	 System.out.println("Enter How many Year of experiance you have");
    	 experiance=scan.nextInt();
    	 
    	 System.out.println("You will get Manger role"+(experiance>=4));
    	 System.out.println("You will get CEO position"+(experiance>7));
    	 
    	 
    	 
    	 
    	 scan.close();
    	 
    	 
	}
}
