package forExercises;

import java.util.Scanner;
import general.*;

public class OutputOdd1to1000 
{
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		
		for(int i = 1; i <= 1000; i+=2)
		{
			My.p(i + "\t");
			
			if (i%10 == 9)
				My.p("\n");
		}
	}
}
