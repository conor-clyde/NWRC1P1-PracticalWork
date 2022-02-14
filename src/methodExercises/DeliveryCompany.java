package methodExercises;

import java.util.Scanner;
import general.*;

public class DeliveryCompany 
{
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		
		double weight=0, delCharge=0;
		boolean nextDay;
		char choice=' ', category=' ';
		
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
		
		System.out.printf("\n\tDelivery charge: £%.2f", delCharge);
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