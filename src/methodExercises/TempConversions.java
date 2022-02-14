package methodExercises;

import java.util.Scanner;
import general.*;

public class TempConversions {

	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		int choice=0, originalValue=0;
		double convertedValue=0.0;
		
		My.p("\n\tEnter 1 if you would like to convert from degrees Fahrenheit to degrees Celsius.");
		My.p("\n\tEnter 2 if you would like to convert from degrees Celsius to degrees Fahrenheit. ");
		choice = MyVal.validInt(1, 2);
		
		switch(choice)
		{
		case 1:
			My.p("\n\tPlease enter the value in degrees Fahrenheit: ");
			originalValue = MyVal.validInt2();
		
			convertedValue = celsius(originalValue);
			My.p("\n\tIn degrees Celsius, this is " + convertedValue + "");
			break;
			
		case 2:
			My.p("\n\tPlease enter the value in degrees Celsius: ");
			originalValue = MyVal.validInt2();
			
			convertedValue = fahrenheit(originalValue);
			My.p("\n\tIn degrees Fahrenheit, this is " + convertedValue + "°F");
			break;
		}
	}
	
	public static int celsius(int originalValue)
	{
		return ((originalValue-32)*5)/9;
	}	
	
	public static double fahrenheit(int originalValue)
	{	
		return (originalValue*1.8) + 32;
	}	
}
