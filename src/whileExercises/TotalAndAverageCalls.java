package whileExercises;

import java.util.Scanner;
import general.*;

public class TotalAndAverageCalls {

	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);

		int callsEntered=0, durationInMin=0, durationInSec=0, totalDurationInMin=0, totalDurationInSec=0;
		int totalDurationOnlyInSec=0, avgDurationOnlyInSec=0, avgDurationInMin=0, avgDurationInSec=0;
		char enterMore=' ';
		
		do
		{
			callsEntered++;
			
			My.p("\n\tPlease enter the duration of the call in minutes: ");
			durationInMin = key.nextInt();
			
			My.p("\n\tPlease enter the duration of the call in seconds: ");
			durationInSec = key.nextInt();
			
			totalDurationInSec += durationInSec + (durationInMin * 60);

			My.p("\n\tWould you like to enter another call. ");
			My.p("\n\tEnter Y for yes, N for no. ");
			key.nextLine();
			
			enterMore = Character.toUpperCase( key.nextLine().charAt(0) );
			
		} while (enterMore == 'Y' || enterMore == 'y');
		
		totalDurationOnlyInSec = totalDurationInSec + (totalDurationInMin * 60);
		avgDurationOnlyInSec = totalDurationOnlyInSec / callsEntered;
		
		totalDurationInSec = totalDurationOnlyInSec % 60;
		totalDurationInMin = (totalDurationOnlyInSec - totalDurationInSec) / 60;
		
		avgDurationInMin = avgDurationOnlyInSec / 60;
		avgDurationInSec = avgDurationOnlyInSec % 60;
		
		My.p("\n\n\tThe total duration of the calls is" );
		My.p("\n\t" + totalDurationInMin + " minutes, and "+ totalDurationInSec + " seconds.");
		
		My.p("\n\n\tThe average duration of the calls is" );
		My.p("\n\t" + avgDurationInMin + " minutes, and " + avgDurationInSec + " seconds.");
	}
}