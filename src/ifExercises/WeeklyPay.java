package ifExercises;

import java.util.Scanner;
import general.*;

public class WeeklyPay
{
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		
		int hoursWorked=0, age=0;
		double rateOfPay=0, weeklyPay=0;
		
		My.p("\n\tPlease enter your age: ");
		age = MyVal.validInt2();
		
		My.p("\n\tPlease enter how many hours that you work per week: ");
		hoursWorked = MyVal.validInt2();
		
		if (age < 18)
			rateOfPay = 4.20;
		else if (age > 17 && age < 21)
			rateOfPay = 5.90;
		else if (age > 20 && age < 25 )
			rateOfPay = 7.38;
		else
			rateOfPay = 7.83;
		
		weeklyPay = hoursWorked * rateOfPay;
		
		System.out.printf("\n\t Your weekly pay is £%.2f.", weeklyPay);
	}
}