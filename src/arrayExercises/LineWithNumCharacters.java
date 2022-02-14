package arrayExercises;

import java.util.Scanner;
import general.*;

public class LineWithNumCharacters 
{

	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		
		int[] values = new int[10];
		
		for (int i=0; i<values.length; i++)
		{
			System.out.printf("\n\tEnter number %d:", i+1);
			values[i] = MyVal.validInt2();
		}
		
		for (int i=0; i<values.length;i++)
		{
			for (int i2=0; i2<values[i]; i2++)
			{
				System.out.print("*");
			}
				System.out.print("\n");
		}	
	}
}
