package arrayExercises;

import java.util.Scanner;
import general.*;

public class PlaceXAtI {

	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		
		int[] values = new int[10];
		int x=0, index=0;
		
		for (int i=0; i<values.length;i++)
		{
			System.out.printf("\n\tEnter number %d:", i+1);
			values[i] = MyVal.validInt2();
		}
		
		System.out.print("\n\tEnter x.");
		x = MyVal.validInt2();
		
		System.out.print("\n\tEnter an index position.");
		index = MyVal.validInt(0, 9);
				
		for (int i = 9; i > index; i--) 
		{
			values[i] = values[i-1];
		}
		
		values[index] = x;
		
		for (int i = 0; i < values.length; i++) 
			System.out.print("\n\t" + values[i]);
	}
}
