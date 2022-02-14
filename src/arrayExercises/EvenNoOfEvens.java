package arrayExercises;

import java.util.Scanner;
import general.*;

public class EvenNoOfEvens
{

	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		
		int[] values = new int[10];
		int evenCount=0;
		
		for (int i=0; i<values.length;i++)
		{
			System.out.printf("\n\tEnter number %d:", i+1);
			values[i] = MyVal.validInt2();
		}
		
		for (int i=0; i<values.length;i++)
		{
			if(values[i]%2==0)
				evenCount++;
		}	
		
		if (evenCount%2==0)
			System.out.print("\n\tTrue.");
		else
			System.out.print("\n\tFalse.");
	}

}
