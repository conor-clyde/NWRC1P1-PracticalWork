package arrayExercises;

import java.util.Scanner;
import general.*;

public class GreaterThanEqualTo10 
{
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		
		int[] values = new int[10];
		int count=0;
		
		for (int i=0; i<values.length;i++)
		{
			System.out.printf("\n\tEnter number %d:", i+1);
			values[i] = MyVal.validInt2();
		}
		
		for (int i=0; i<values.length;i++)
		{
			if(values[i]>=10)
				count++;
		}	
		
		System.out.printf("\n\tThe amount of numbers with a value of 10 or greater is %d.", count);
	}
}
