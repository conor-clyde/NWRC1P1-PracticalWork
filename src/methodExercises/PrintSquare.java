package methodExercises;

import java.util.Scanner;
import general.*;

public class PrintSquare 
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		
		int num=0;
		
		My.p("\n\tPlease enter the number of squares that you want the square to have.");
		num = MyVal.validInt2();
		
		printSquare(num);	
	}
	
	public static void printSquare(int num)
	{
		My.p("\n");
		
		for(int counter1=0; counter1 < num; counter1++)
		{	
			for(int counter2=0; counter2 < num; counter2++)
			{
				My.p("*");
			}
			
			My.p("\n");
		}				
	}
}
