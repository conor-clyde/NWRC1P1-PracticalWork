package arrayExercises;

import java.util.Scanner;
import general.*;

public class SwapMaxMin {

	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		
		int[] values = new int[10];
		int max=0, min=0;
		
		for (int i=0; i<values.length; i++)
		{
			System.out.printf("\n\tEnter number %d:", i+1);
			values[i] = MyVal.validInt2();
		}
		
		values[max]=values[0];
		values[min]=values[0];
		
		//System.out.print("\nMax position now has: " + values[max]);
		//System.out.print("\nMin position now has: " + values[min]);
		
		for (int i=0; i<values.length; i++)
		{
			if(values[i]>max)
				max = i;
			
			if(values[i]<min)
				min = i;
		}	
		
		//System.out.print("\n\nMax position now has: " + values[max]);
		//System.out.print("\nMin position now has: " + values[min]);
		
		int temp=values[min];
		values[min]=values[max];
		values[max]=temp;
		
		//System.out.print("\n\nMax position now has: " + values[max]);
		//System.out.print("\nMin position now has: " + values[min]);
		
		for (int i = 0; i < values.length; i++) 
			System.out.print("\n\t" + values[i]);
	}
}
