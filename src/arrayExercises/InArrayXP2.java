package arrayExercises;

import java.util.Scanner;
import general.*;

public class InArrayXP2 
{

	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);

		int[] values = new int[10];
		int x=0, indexOfX=0;
		
		for (int i=0; i<values.length;i++)
		{
			System.out.printf("\n\tEnter number %d:", i+1);
			values[i] = MyVal.validInt2();
		}
		
		System.out.print("\n\tEnter x.");
		x = MyVal.validInt2();
				
		for (int i = 0; i < values.length; i++) 
		{
			if (x==values[i])
			{

				for (int i2=i; i2 < values.length-1; i2++)
					values[i2] = values[i2+1];  
			}		
		}
		
		values[9]=0;
		
		for (int i = 0; i < values.length; i++) 
			System.out.print("\n\t" + values[i]);
	}
}


