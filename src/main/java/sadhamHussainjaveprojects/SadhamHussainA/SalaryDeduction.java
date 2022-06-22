package sadhamHussainjaveprojects.SadhamHussainA;

import java.util.Scanner;

public class SalaryDeduction {
       public static void main(String[] args) {
	     
    	   Scanner scan=new Scanner(System.in);
    	   Integer takeHome=0,pfDeducation=0; Float salaryMonthly=0.0F, tdsDeducation=0.0F;
    	   
    	   
    	   System.out.println("Enter your Total CTC amount");
    	   takeHome=scan.nextInt();
    	   
    	   System.out.println("Enter the Monthly Salary");
    	   salaryMonthly=scan.nextFloat();
    	   
    	   tdsDeducation=(salaryMonthly-(salaryMonthly/12));
    	   System.out.println("After Deducution you will receive amount is ---"+tdsDeducation);
    	  
    	   pfDeducation=(int)(tdsDeducation-564);
    	   System.out.println("After All Deduction you will receive amount is----"+pfDeducation);
    	   

    	   scan.close();
    	   
    	 
    	  
}
}
