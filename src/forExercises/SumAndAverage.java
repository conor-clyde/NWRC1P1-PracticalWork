package forExercises;

import java.util.Scanner;
import general.*;

public class SumAndAverage 
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);

		int inputAmount=0, inputNumber=0, sum=0, average=0;
		My.p("\n\tPlease enter the amount of numbers that you wish to find the sum and average of: ");
		inputAmount = MyVal.validInt2();
		
		for (int i= 1; i <=inputAmount; i++ )
		{
			My.p("\n\tEnter number #" + i + ": ");
			inputNumber = MyVal.validInt2();
			
			sum = sum + inputNumber;	
		}
		average = sum / inputAmount;
		
		My.p("\n\tThe sum of these numbers is " + sum);
		My.p("\n\tThe average of these numbers is " + average);
	}
}
