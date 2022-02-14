package ifExercises;

import java.util.Scanner;
import general.*;

public class LawnMowing
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		
		double length=0, width=0, areaOfLawn=0, weeklyMowingFee=0, seasonalFee=0, finalPayment=0;
		int noWeeksPerSeason=20, paymentChoice=0;
		String paymentChoiceDesc="";
		
		My.p("\n\tPlease enter the length of your lawn: ");
		length = MyVal.validDouble(0, 100);
		
		My.p("\n\tPlease enter the width of your lawn: ");
		width = MyVal.validDouble(0, 100);
		
		My.p("\n\tPlease tell us how you would like to pay.");
		My.p("\n\tEnter 1 if you would like to pay your seasonal fee in one payment");
		My.p("\n\tEnter 2 if you would like to pay your seasonal fee in two seperate payment");
		My.p("\n\tEnter 3 if you would like to pay your seasonal fee twenty seperate payments throughout the year");
		paymentChoice = MyVal.validInt(1, 3);
		
		areaOfLawn = length * width;
		
		if (areaOfLawn < 400)
			weeklyMowingFee = 25.00;
		else if (areaOfLawn >= 400 && areaOfLawn< 600)
			weeklyMowingFee = 35.00;
		else if (areaOfLawn > 600)
			weeklyMowingFee = 50.00;
	
		seasonalFee = noWeeksPerSeason * weeklyMowingFee;
		
		if (paymentChoice == 1)
		{
			finalPayment = seasonalFee;
			paymentChoiceDesc = "\n\tYou have selected payment choice 1, which means that you will simply pay your seasonal fee in one payment.";
		}
		else if (paymentChoice == 2)
		{
			finalPayment = 2 * ( (seasonalFee/2.0) + 5);
			paymentChoiceDesc = "\n\tYou have selected payment choice 2, which means that you will make two payments, each payment is half your seasonal fee, plus a £5 service charge.";
		}
		else if (paymentChoice == 3)
		{
			finalPayment = 20 * ( weeklyMowingFee + 3);
			paymentChoiceDesc = "\n\tYou have selected payment choice 3, which means that you will make twenty seperate payments, each payment is equal to your weekly fee plus a £3 service charge";
		}
		
		System.out.printf("\n\tYour weekly mowing fee is £%.2f", weeklyMowingFee);
		System.out.printf("\n\tYour seasonal fee is £%.2f", seasonalFee);
		My.p("\n\t" + paymentChoiceDesc);
		System.out.printf("\n\tThe total amount that you must pay is £%.2f", finalPayment);
		My.p("\n\tThank you for using this service.");
	}
}