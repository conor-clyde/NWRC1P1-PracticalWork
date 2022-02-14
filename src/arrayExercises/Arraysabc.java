package arrayExercises;

import java.util.Scanner;
import general.*;

public class Arraysabc 
{

	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		
		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[20];

		for (int i=0; i<a.length; i++)
		{
			System.out.printf("\n\tPlease enter number #%d of array a.", i+1);
			a[i] = MyVal.validInt2();
		}
		
		for (int i=0; i<a.length; i++)
		{
			System.out.printf("\n\tPlease enter number #%d of array b.", i+1);
			b[i] = MyVal.validInt2();
		}
		
		for (int i=0; i<(a.length); i++)
		{
			c[i] = a[i];
		}
		
		for (int i=0; i<(b.length); i++)
		{
			c[i+10] = b[i];
		}
		
		for (int i=0; i<(c.length); i++)
		{
			System.out.print("\n\t" + c[i]);
		}
	}
}
