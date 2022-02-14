package startingExercises;

import java.util.Scanner;
import general.*;

public class AnnualPension 
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		
		double currentAnnualSalary=0, yearsOfService=0, annualPension=0;
		
		System.out.print("\n\tPlease enter your current annual salary: ");
		currentAnnualSalary = MyVal.validDouble2();
		
		System.out.print("\n\tPlease enter the amount of years that you have worked for the company: ");
		yearsOfService = MyVal.validDouble2();
		
		annualPension =  (currentAnnualSalary * (1.0/15.0)) * yearsOfService;
		
		System.out.printf("\n\tYour Annual Pension is £%5.2f.", annualPension);
	}
}
