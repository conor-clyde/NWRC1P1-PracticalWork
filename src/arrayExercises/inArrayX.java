package arrayExercises;

import java.util.Scanner;
import general.*;

public class inArrayX {

	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		
		int[] values = new int[10];
		int x=0;
		boolean inArray = false;
		
		for (int i=0; i<values.length;i++)
		{
			System.out.printf("\n\tEnter number %d:", i+1);
			values[i] = MyVal.validInt2();
		}
		
		System.out.print("\n\tEnter x.");
		x = MyVal.validInt2();
		
		for (int i=0; i<values.length;i++)
		{
			if(values[i]==x)
			{
				inArray = true;
				break;
			}	
		}		
		
		if (inArray==true)
			System.out.printf("\n\t%d is in the array.", x);
		else
			System.out.printf("\n\t%d is not in the array.", x);
	}
}
