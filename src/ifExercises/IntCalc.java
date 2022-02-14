package ifExercises;

import java.util.Scanner;
import general.*;

public class IntCalc 
{
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		
		int int1=0, int2=0, optionChosen=0, outputNumber=0;
		
		My.p("\n\tPlease enter the first number: ");
		int1 = MyVal.validInt2();
		
		My.p("\n\tPlease enter the second number: ");
		int2 = MyVal.validInt2();
		
		My.p("\n\tPlease select one of the following options.");
		My.p("\n\tEnter 1 to add the two numbers togther.");
		My.p("\n\tEnter 2 to subtract the second number from the first number.");
		My.p("\n\tEnter 3 to multiply the two numbers together.");
		My.p("\n\tEnter 4 to multiply first number by the second number.");
		optionChosen = MyVal.validInt(1, 5);
		
		if (optionChosen==1)
			outputNumber = int1 + int2;
		else if (optionChosen==2)
			outputNumber = int1 - int2;
		else if (optionChosen==3)
			outputNumber = int1 * int2;
		else if (optionChosen == 4)
			if (int2 == 0)
				My.p("Error. Cannot divide by Zero.");
			else
				outputNumber = int1 / int2;
	
		My.p("\n\tThe final number is " + outputNumber);
	}
}