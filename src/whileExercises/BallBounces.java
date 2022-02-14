package whileExercises;

import java.util.Scanner;
import general.*;

public class BallBounces
{
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);

		double height=0, reducedBy=0.05;
		int noBounces=0;
		
		My.p("\n\tPlease enter the height that the ball is dropped from: ");
		height = MyVal.validDouble2();
		
		do
		{
			height = height * (1 - reducedBy);
			noBounces++;
		} while(height > 0.01);
		
		My.p("\n\tThe ball will bounce " + noBounces + " times.");
	}
}
