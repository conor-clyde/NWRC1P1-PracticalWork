package startingExercises;

import java.util.Scanner;
import general.*;

public class WaterTank 
{

	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		
		int currentWaterAmount=0, weeklyWaterUsage=0, weeksWaterWillLast=0;
		
		System.out.print("\n\tWhat is the current amount of water in the tank in gallons? ");
		currentWaterAmount = MyVal.validInt2();
		
		System.out.print("\n\tHow much water is used per week in gallons? ");
		weeklyWaterUsage = MyVal.validInt2();
		
		weeksWaterWillLast = currentWaterAmount / weeklyWaterUsage;
		
		System.out.printf("\n\tThe water in the water tank will last for %d weeks.", weeksWaterWillLast);
	}
}
