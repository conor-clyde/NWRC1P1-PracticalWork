package startingExercises;

import java.util.Scanner;
import general.*;

public class ConvToCelsius {

	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);

		double fahrenheit=0, celsius=0;
		
		System.out.print("\n\tPlease enter the value in degrees fahrenhet: ");
		fahrenheit = MyVal.validDouble2();
		
		celsius = ((fahrenheit - 32) * 5 ) / 9;
		
		System.out.printf("\n\tIn degrees celsius, this is %.0f°C", celsius);
	}
}
