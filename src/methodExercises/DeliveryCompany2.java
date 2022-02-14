package methodExercises;

import java.util.Scanner;
import general.*;

public class DeliveryCompany2
{
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		
		double weight=0, delCharge=0, totalCharge=0, nextDayTotal=0, standardDelTotal=0;
		boolean nextDay;
		char choice=' ', category=' ';
		int noParcels=0, nextDayCount=0, standardDelCount=0;
		int choice1=0;
		
		System.out.print("\n\tPlease enter the amount of parcels to be delivered:");
		noParcels = MyVal.validInt2();
		
		for (int i = 0; i<noParcels; i++ )
		{
			System.out.print("\n\tPlease enter the weight of the parcel:");
			weight = MyVal.validDouble2();
		
			System.out.print("\n\tDo you want next day delivery? Enter Y for Yes, N for no. ");
			choice = key.next().charAt(0);
		
		if (weight>=100)
			category='A';
		else if (weight<100 && weight >=60)
			category='B';
		else if (weight<60 && weight >=30)
			category='C';
		else if (weight<30 && weight >=10)
			category='D';
		else if (weight<10)
			category='E';
		
		if (choice=='Y')
			nextDay=true;
		else
			nextDay=false;
		
		delCharge = calcCharge(category, nextDay);
				
		if (nextDay==true)
			{
			nextDayCount++;
			nextDayTotal=nextDayTotal+delCharge;
			}
		
		else
		{
			standardDelCount++;
			standardDelTotal=standardDelTotal+delCharge;
		}
		
		totalCharge= totalCharge + delCharge;
		}
		
		System.out.printf("\n\tThe overall total charge is £%.2f.", totalCharge);
		System.out.printf("\n\tThere are %d parcels for next day delivery, with a total cost of £%.2f.", nextDayCount, nextDayTotal);
		System.out.printf("\n\tThere are %d parcels for standard delivery, with a total cost of £%.2f.",standardDelCount, standardDelTotal);
	}
	
	public static double calcCharge(char category, boolean nextDay)
	{
		if (category=='A')
			if (nextDay==true)
				return 45.00 + (45.00*0.3);
			else
				return 45.00;	
		
		else if (category=='B')
			if (nextDay==true)
				return 30.00 + (30.00*0.3);
			else
				return 30.00;
		
		else if (category=='C')
			if (nextDay==true)
				return 20.00 + (20.00*0.3);
			else
				return 20.00;
		
		else if (category=='D')
			if (nextDay==true)
				return 12.50 + (12.50*0.3);
			else
				return 12.50;
		else
			if (nextDay==true)
				return 7.50 + (7.50*0.3);
			else
				return 7.50;
	}
}
