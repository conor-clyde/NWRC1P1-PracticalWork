package methodExercises;

import java.util.Scanner;
import general.*;

public class PrintTempConversions {

	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		
		int choice = 0;
		double convertedValue = 0.0;
		
		My.p("\n\tEnter 1 to see the chart showing the Fahrenheit equivalent of all Celsius temperature for 0 to 100 degrees ");
		My.p("\n\tEnter 2 to see the chart showing the Celsius equivalents of all Fahrenheit temperatures from 32 to 212.");
		choice = MyVal.validInt(1, 2);
		
		switch(choice)
		{
		case 1:
			celsiusConversionTable();
			break;

		case 2:
			fahrenheitConversionTable();
			break;
			
		default:
			My.p("\n\tInvalid option chosen.");
		}
	}
	
	public static void celsiusConversionTable()
	{
		double celsius=0.0;
		
		My.p("\n\tF\tC");
		for (int fahrenheit=0; fahrenheit<=100; fahrenheit++)
		{
			My.p("\n\t" + fahrenheit + "\t");
			celsius = ((fahrenheit-32.0)*5.0)/9.0;
			System.out.printf("%.2f", celsius);
		}
	}	
	
	public static void fahrenheitConversionTable()
	{
		double fahrenheit=0.0;
		
		My.p("\n\tC\tF");
		for (int celsius=0; celsius<=100; celsius++)
		{
			My.p("\n\t" + celsius + "\t");
			fahrenheit = (celsius*1.8) + 32;
			System.out.printf("%.2f", fahrenheit);
		}
	}	
}
