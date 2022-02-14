package forExercises;

import java.util.Scanner;
import general.*;

public class MultiplesOf3 
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		
		for(int i = 3; i <= 30; i+=3)
		{
			My.p(i + "\t");	
		}	
	}
}
