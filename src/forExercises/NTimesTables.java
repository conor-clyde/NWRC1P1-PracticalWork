package forExercises;

import java.util.Scanner;
import general.*;

public class NTimesTables
{
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		
		int inputNumber = 0;
		
		My.p("\n\tPlease enter a number to see its times table: ");
		inputNumber = MyVal.validInt2();
		
		for (int i = 1; i <=12; i++ )
			System.out.printf("\n\t%2d * %2d = %2d", i, inputNumber, i*inputNumber );
	}
}
