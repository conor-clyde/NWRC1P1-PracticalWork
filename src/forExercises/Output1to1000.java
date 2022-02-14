package forExercises;

import java.util.Scanner;
import general.*;

public class Output1to1000 
{
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		
		for(int i = 1; i <= 1000; i++)
		{
			My.p(i + "\t");
			
			if (i%10==0)
				My.p("\n");	
		}
	}
}
