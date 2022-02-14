package forExercises;

import java.util.Scanner;
import general.*;

public class FourTimesTables 
{
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		
		for (int i = 1; i <=12; i++ )
		{
			System.out.printf("\n\t%2d * %2d = %2d", i, 4, i*4 );
		}
	}
}
