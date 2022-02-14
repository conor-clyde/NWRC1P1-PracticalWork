package ifExercises;

import java.util.Scanner;
import general.*;

public class IQ 
{
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		
		int iqScore=0;
		
		My.p("\n\tPlease enter your IQ score: ");
		iqScore = MyVal.validInt(0, 100);
		
		if(iqScore==100)
			My.p("\n\tAverage");
		else if (iqScore < 100)
			My.p("\n\tBelow average");
		else if (iqScore > 100)
			My.p("\n\tAbove average");
	}
}
