package sadhamHussainjaveprojects.SadhamHussainA;

import java.util.Scanner;

public class CastingProgram {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		String businessName="",businessLocation="";
		Integer totalBusinessbudget=0, totalEmployee=0, loanRequired=0;
		Double yearlyProfit=0.0, yearlyEmployeesalary=0.0;
		
		System.out.println("YOU CAN ENTER YOUR BUISNESS DETAILS");
		
		System.out.println("Enter your Business Name");
		businessName=scan.nextLine();
		
		System.out.println("What about the Business Location");
		businessLocation=scan.nextLine();
		
		System.out.println("Enter the TOTAL Business Buget in Lakhs");
		totalBusinessbudget=scan.nextInt();
		
		System.out.println("How many Employee need for this Business in Numbers");
		totalEmployee=scan.nextInt();
		
		System.out.println("How much loan you need rihgt now(Enter in Lakhs)");
		loanRequired=scan.nextInt();
		
		System.out.println("How much Yearly profite can make(Enter in Lakhs)");
		yearlyProfit=scan.nextDouble();
		
		System.out.println("What about the employee yearly total salary(Enter in Lakhs)");
		yearlyEmployeesalary=scan.nextDouble();
		
		System.out.println("Your Current Business name is"  +businessName+  " you are selected the business location" +businessLocation+ " Your Required loan amount is" + loanRequired+" as per your update yearly profite is" + yearlyProfit+" As per your update total Employess salary Expensive is" +yearlyEmployeesalary);
		scan.close();
		
	}

}
