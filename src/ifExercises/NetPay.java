package ifExercises;

import java.util.Scanner;
import general.*;

public class NetPay
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		
		double hourlyRateOfPay=0, grossPay=0, tax=0, netPay=0;
		int hoursWorked=0;
		
		My.p("\n\tPlease enter the employee's hourly rate of pay: ");
		hourlyRateOfPay = MyVal.validDouble2();

		My.p("\n\tPlease enter the number of hours worked by the employee: ");
		hoursWorked = MyVal.validInt2();
		
		grossPay = hourlyRateOfPay * hoursWorked;
		
		if (grossPay <= 300.00)
			tax = grossPay * 0.1;
		else if (grossPay > 300.00 && grossPay <= 400.00)
			tax = grossPay * 0.12;
		else if (grossPay > 400.00 && grossPay <= 500.00)
			tax = grossPay * 0.15;
		else if (grossPay > 500.00)
			tax = grossPay * 0.2;
		
		netPay = grossPay - tax;
		
		System.out.printf("\n\tThe employee's gross pay is £%.2f", grossPay);
		System.out.printf("\n\tThe employee's tax is £%.2f", tax);
		System.out.printf("\n\tThe employee's net pay is £%.2f", netPay);
	}
}