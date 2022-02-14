package whileExercises;

import java.util.Scanner;
import general.*;

public class TotalAndAverageYorN 
{
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);

		int num=0, totalNum=0, numEntered=0;
		double avgNum=0;
		char enterMore=' ';
		
		do
		{
			numEntered++;
			
			My.p("\n\tPlease enter number " + numEntered + ": ");
			num = key.nextInt();
			
			totalNum += num;
			
			My.p("\n\tWould you like to enter another number. ");
			My.p("\n\tEnter Y for yes, N for no. ");
			key.nextLine();
			
			enterMore = Character.toUpperCase( key.nextLine().charAt(0) );
			
		} while (enterMore == 'Y' || enterMore == 'y');
		
		avgNum = totalNum / numEntered;
				
		My.p("\n\tThe total is " + totalNum + ", and the average is " + avgNum + ".");
	}
}