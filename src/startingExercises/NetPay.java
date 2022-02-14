package startingExercises;

import java.util.Scanner;
import general.*;

public class NetPay 
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);

		double yearlyIncome=0, taxCode=0, taxAllowance=0, taxRate=0.2, taxPaid=0, netPay=0;
				
		System.out.print("\n\tPlease enter your yearly income: ");
		yearlyIncome = MyVal.validDouble2();
		
		System.out.print("\n\tPlease enter your tax code: ");
		taxCode = MyVal.validDouble2();
		
		taxAllowance = yearlyIncome - (taxCode * 10);
		taxPaid = (yearlyIncome - taxAllowance) * taxRate;
		netPay = yearlyIncome - taxPaid; 
		
		System.out.printf("\n\tYour yearly income is £%.2f.", yearlyIncome);
		System.out.printf("\n\tYour total tax allowance is £%.2f.", taxAllowance);
		System.out.printf("\n\tThe total amount of tax you have paid is £%.2f.", taxPaid);
		System.out.printf("\n\tYour final net pay is £%.2f.", netPay);
	}
}
