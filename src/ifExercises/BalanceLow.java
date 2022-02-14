package ifExercises;

import java.util.Scanner;
import general.*;

public class BalanceLow 
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		
		double currentAccountBalance=0, savingsAccountBalance=0;
		
		System.out.print("\n\tPlease enter the balance of your current acount: ");
		currentAccountBalance = MyVal.validDouble2();
		
		System.out.print("\n\tPlease enter the balance of your savings acount: ");
		savingsAccountBalance = MyVal.validDouble2();
		
		if (currentAccountBalance < 10.00 && savingsAccountBalance < 100.00)
			System.out.print("\n\tBoth accounts are dangerously low.");
		else if (currentAccountBalance < 10.00)
			System.out.print("\n\tCurrent account balance is low.");
		else if (savingsAccountBalance < 100.00)
			System.out.print("\n\tSavings account balance is low. ");
		else
			System.out.print("\n\tThe balance of both of your accounts is fine. ");
	}
}
