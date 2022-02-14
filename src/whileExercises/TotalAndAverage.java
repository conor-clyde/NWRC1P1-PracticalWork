package whileExercises;

import java.util.Scanner;
import general.*;

public class TotalAndAverage {

	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		
		int num=0, totalNum=0, numEntered=0;
		double avgNum=0;
		
		do
		{
			numEntered++;
			
			My.p("\n\tPlease enter number " + numEntered + ": ");
			num = MyVal.validInt2();
			
			if (num != -999)
				totalNum += num;
		} while (num != -999);
		
		avgNum = totalNum / numEntered;
				
		My.p("\n\tThe total is " + totalNum + ", and the average is " + avgNum + ".");
	}
}
