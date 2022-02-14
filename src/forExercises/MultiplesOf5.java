package forExercises;

import java.util.Scanner;
import general.*;

public class MultiplesOf5 
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		
		for(int i = 50; i >= 10; i-=5)
		{
			My.p(i + "\t");
		}
	}
}
