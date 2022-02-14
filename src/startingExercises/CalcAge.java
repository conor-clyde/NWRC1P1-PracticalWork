package startingExercises;

import java.util.Scanner;
import general.*;
import general.*;

public class CalcAge 
{

	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		
		int birthYear=0, currentYear=0, age=0;
		
		System.out.print("\n\tPlease input your birth year: ");
		birthYear = MyVal.validInt2();
		
		System.out.print("\n\tPlease input the current year: ");
		currentYear = MyVal.validInt2();
		
		age = currentYear - birthYear;
		
		System.out.print("\n\tYour age is " + age);
	}
}
