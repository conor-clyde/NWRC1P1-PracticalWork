package methodExercises;

import java.util.Scanner;
import general.*;

public class PrintSquareCharacters {

	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		int num=0;
		char charEntered=' ';
		
		My.p("\n\tPlease enter the number of squares that you want the square to have.");
		num = MyVal.validInt2();
		
		My.p("\n\tPlease enter the character that you wish the square to be made with: ");
		charEntered = key.next().charAt(0);
		
		printCharSquare(num, charEntered);
	}
	
	public static void printCharSquare(int num, char charEntered)
	{
		My.p("\n");	
		
		for(int counter1=0; counter1 < num; counter1++)
		{	
			for(int counter2=0; counter2 < num; counter2++)
			{
				System.out.print(charEntered);
			}
			
			My.p("\n");
		}				
	}
}
