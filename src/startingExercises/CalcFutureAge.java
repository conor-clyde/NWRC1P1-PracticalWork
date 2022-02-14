package startingExercises;

import java.util.Scanner;
import general.*;

public class CalcFutureAge 
{
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		
		int futureYear=0, currentYear=0, currentAge=0, futureAge=0;
		
		System.out.print("\n\tPlease enter your current age: ");
		currentAge = MyVal.validInt2();
		
		System.out.print("\n\tPlease enter the current year: ");
		currentYear = MyVal.validInt2();
		
		System.out.print("\n\tPlease Enter the year that you wish to know your age in: ");
		futureYear = MyVal.validInt2();
		
		futureAge = currentAge + ((futureYear+1) - currentYear);
		
		System.out.print("\n\tYour age in that year will be " + futureAge);
	}
}
