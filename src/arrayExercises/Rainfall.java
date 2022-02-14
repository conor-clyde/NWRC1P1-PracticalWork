package arrayExercises;

import java.util.Scanner;
import general.*;

public class Rainfall 
{

	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		int[] monthlyRainfall = new int[12];
		int totalRainfall=0, max=0, min=0;
		double avgRainfall=0.0;
		
		for (int i=0; i<monthlyRainfall.length; i++)
		{
		System.out.printf("\n\tPlease enter the amount of rainfall in month #%d", i+1);
		monthlyRainfall[i] = MyVal.validInt2();
		}
		
		monthlyRainfall[max]=monthlyRainfall[0];
		monthlyRainfall[min]=monthlyRainfall[0];
		
		
		
		for (int i=0; i<monthlyRainfall.length; i++)
		{
			totalRainfall += monthlyRainfall[i];
		}

		avgRainfall=(double)totalRainfall/12;

		for (int i=0; i<monthlyRainfall.length; i++)
		{
			if(monthlyRainfall[i]>monthlyRainfall[max])
				max = i;
			
			if(monthlyRainfall[i]<monthlyRainfall[min])
				min = i;
		}	
		
		System.out.printf("\n\tThe total rainfall for the year is %d.", totalRainfall);
		System.out.printf("\n\tThe average rainfall per month is %.2f.", avgRainfall);
		System.out.printf("\n\tThe month was the highest rainfall was month #%d.", max+1);
		System.out.printf("\n\tThe month with the lowest rainfall was month #%d.", min+1);
	}
}
