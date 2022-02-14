package methodExercises;

import java.util.Scanner;
import general.*;

public class IsMultiple {

	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		
		int int1=0, int2=0;
		boolean isMultiple;
		
		My.p("\n\tPlease enter the first number: ");
		int1=MyVal.validInt2();
		
		My.p("\n\tPlease enter the second number: ");
		int2=MyVal.validInt2();
		
		isMultiple = checkIfMultiple(int1, int2);
		
		if(isMultiple==true)
			My.p("\n\t" + int2 + " is a multiple of " + int1);
		else
			My.p("\n\t" + int2 + " is not a multiple of " + int1);
	}

	public static boolean checkIfMultiple(int int1, int int2)
	{
		if(int1%int2==0)
			return true;
		else
			return false;
	}
}
