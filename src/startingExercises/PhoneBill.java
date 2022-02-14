package startingExercises;

import java.util.Scanner;
import general.*;

public class PhoneBill 
{
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		
		int minsUsed=0, textsUsed=0, minsAllowed=250, textsAllowed=500, addMinsUsed=0, addTextsUsed=0, monthlyTariff=15;
		double costPerAddMin=0.25, costPerAddText=0.15, addMinsCost=0, addTextsCost=0, totalCharge=0;
		
		System.out.print("\n\tHow many minutes have been used? ");
		minsUsed = MyVal.validInt2();
		
		System.out.print("\n\tHow many texts have been used? ");
		textsUsed = MyVal.validInt2();
		
		if(minsUsed>minsAllowed)
		{
			addMinsUsed = minsUsed- minsAllowed;
			addMinsCost = addMinsUsed * costPerAddMin;
		}
		
		if(textsUsed>textsAllowed)
		{
			addTextsUsed = textsUsed - textsAllowed;
			addTextsCost = addTextsUsed * costPerAddText;
		}

		totalCharge = addMinsCost + addTextsCost + monthlyTariff;
		
		System.out.print("\n\tYou have used a total of " + textsUsed + " texts and " + minsUsed + " minutes" );
		System.out.print("\n\tYou have gone over your allowed texts by " + addTextsUsed + " texts and your allowed minutes by " + addMinsUsed + " minutes");
		System.out.printf("\n\tYou will be charged your monthly tariff of £%5d.", monthlyTariff);
		System.out.printf("\n\tA cost of £%.2f for the extra minutes that you have used.", addMinsCost);
		System.out.printf("\n\tAnd a cost of £%.2f for the extra texts that you have used.", addTextsCost);
		System.out.printf("\n\n\tThe total amount that you will be charged is £%.2f.", totalCharge);
	}
}