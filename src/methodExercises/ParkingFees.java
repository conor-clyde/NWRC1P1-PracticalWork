package methodExercises;

import java.util.Scanner;
import general.*;

public class ParkingFees
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		
		int hoursParked = 0;
		double charge = 0.0;
		char enterMore = 'Y';
		String parkingDetails = "";

		for (int i = 0; enterMore =='Y'; i++ )
		{
			My.p("\n\tPlease enter the number of hours parked by car #" + (i+1) + ": ");
			hoursParked = key.nextInt();
		
			charge = calculateCharges(hoursParked);
		
			parkingDetails = (parkingDetails + "\n\t" + (i+1) + "\t" + hoursParked + "\t£" + charge);
					
			My.p("\n\tWould you like to enter another car?");
			My.p("\n\tEnter Y for yes, N for no.");
			enterMore = Character.toUpperCase(key.next().charAt(0));
		}
	
		My.p("\n\tCar\tHours\tCharge");
		System.out.print(parkingDetails);

	}
	
	public static double calculateCharges(int hoursParked) 
	{
		double minFee = 2.00, chargePerHour = 0.50, charge = 0.0;
		
		if(hoursParked>3)
			charge = minFee + ((hoursParked-3)*chargePerHour);
		else
			charge=minFee;
		
		if(charge > 10.00)
			charge = 10.00;
		
		return charge;
	}

}
