package whileExercises;

import java.util.Scanner;
import general.*;

public class AvgAgeAdultsChildren
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		
		int age=0, totalAge=0, noPeople=0, noAdults=0, noChildren=0;
		double avgAge=0;
		char enterMore=' ';
		
		do
		{
			noPeople++;
			
			My.p("\n\tPlease enter age #" + noPeople + ": ");
			age = MyVal.validInt2();
			
			totalAge += age;
			
			if (age >= 18)
				noAdults++;
			else
				noChildren++;			
			
			My.p("\n\tWould you like to enter another age. ");
			My.p("\n\tEnter Y for yes, N for no. ");
			enterMore = Character.toUpperCase( key.nextLine().charAt(0) );
		}while (enterMore == 'Y' || enterMore == 'y');
		
		avgAge = (double)totalAge / noPeople;
		
		My.p("\n\tThe average age across " + noPeople + " people is " + avgAge + "." );
		My.p("\n\tThere are " + noAdults + " adults, and " + noChildren + " children. ");
	}
}