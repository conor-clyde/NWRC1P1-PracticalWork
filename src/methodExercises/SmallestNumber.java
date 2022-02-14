package methodExercises;

import java.util.Scanner;
import general.*;

public class SmallestNumber {

	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		double num1 = 0.0, num2 = 0.0, num3 = 0.0, smallestNum = 0.0;
		
		My.p("\n\tPlease enter number 1.");
		num1=MyVal.validInt2();
		
		My.p("\n\tPlease enter number 2.");
		num2=MyVal.validInt2();
		
		My.p("\n\tPlease enter number 3.");
		num3=MyVal.validInt2();
			
		smallestNum = returnSmallest(num1, num2, num3);
		
		My.p("\n\tThe smallest number is " + smallestNum);
	}

	public static double returnSmallest(double num1, double num2, double num3)
	{
		if (num1<num2 && num1<num3)
			return num1;
		else if (num2<num1 && num2<num3)
			return num2;
		else
			return num3;			
	}
}
