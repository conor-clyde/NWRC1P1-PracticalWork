package revisionExercise;

import java.util.Scanner;

import general.*;

public class Exercise1 
{

	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		
		//VARIABLES DECLARED
		int noNights=0, noCats=0;
		double costPerDay=0, discount=0, finalCost=0, costPerDayWDiscount=0;
		char choice=' ';
		boolean privEnclosure=false;
		
		//GETS INPUT
		System.out.print("\n\tFor how many nights will you be leaving your cat(s)?");
		noNights = MyVal.validInt(1, 100);
		
		System.out.print("\n\tHow many cats will you be leaving with us?");
		noCats = MyVal.validInt(1, 100);
		
		//ASKS IF PRIVATE ENCLOSURE IS INCLUDED ONLY IF THERE ARE 3 OR MORE CATS
		if (noCats>=3)
		{
			System.out.print("\n\tWould you like to pay for private enclosure?");
			choice= MyVal.validChar("\n\tPlease enter Y or N.");
			
			if (choice=='Y' || choice=='y')
				privEnclosure=true;
		}
		
		//DECLARES AN ARRAY OF BOOLEANS WITH A CAPACITY EQUAL TO THE NUMBER OF CATS
		boolean[] catAges = new boolean[noCats];
		
		//LOOPS THROUGH THE CATS, ASKING WHETHER AGE ONE IS AN ADULT OR KITTEN
		for (int i=0; i<noCats; i++)
		{
			System.out.printf("\n\tIs cat #%d an adult?", i+1);
			choice = MyVal.validChar("\n\tPlease enter Y or N.");
			
			if (choice=='Y' || choice=='y')
				catAges[i]=true;
		}
		
		//METHOD TO CALCULATE COST PER DAY
		costPerDay = calcCostPerDay(catAges, noNights, privEnclosure);
		
		//METHOD TO CALCULATE FINAL COST
		finalCost = calcFinalCost(noCats, costPerDay, noNights, privEnclosure);
		
		//OUTPUT
		System.out.printf("\n\nThe overall cost is £%.2f", finalCost);
		
	}
	
	public static double calcCostPerDay(boolean[] catAges, int noNights, boolean privEnclosure)
	{
		double costPerDay=0.0;
		
		for (int i=0; i<catAges.length; i++)
		{
			if (catAges[i]==true && noNights<=6 )
				costPerDay+=6;
			else if (catAges[i]==false && noNights<=6)
				costPerDay+=5;
			else if (catAges[i]==true && noNights>6)
				costPerDay+=4.5;
			else if (catAges[i]==false && noNights>6)
				costPerDay+=4;	
		}
		
		if (privEnclosure==true)
			costPerDay+=10;
		
		return costPerDay;
	}
	
	public static double calcFinalCost(int noCats, double costPerDay, int noNights, boolean privEnclosure)
	{
		double finalCost=0.0, costPerDayWDiscount=0.0;
		
		if (noCats==2)
			costPerDayWDiscount=costPerDay*0.9;
		else if (noCats>=3)
			costPerDayWDiscount=costPerDay*0.8;
			
		if (privEnclosure==true && noNights>6)
				finalCost=(costPerDayWDiscount*6)+(costPerDay*(noNights-6));
		else if (noCats>=2)
			finalCost=costPerDayWDiscount*noNights;
		else
			finalCost=costPerDay*noNights;
		
		return finalCost;
	}
}