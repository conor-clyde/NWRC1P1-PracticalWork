package general;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyVal 
{
	static Scanner key = new Scanner(System.in);
	
/*	
	public static int validIntSecondMethod(int min, int max)
	{
		int num = 0;
		boolean ok;
		
		do
		{
			ok = true;
			My.p("\n\tNumber: ");
			
			if (!key.hasNextInt())
			{
				My.p(String.format("\n\tPlease enter a number (%2d - %2d, args)", min, max));
				key.hasNextLine();
				ok = false;
			}
			else
			{
				num = key.nextInt();
				
				if(num<min || num>max)
				{
					ok = false;
					My.p(String.format("\n\tError: Range is %2d - %2d. Please re-enter.", min, max));
					key.nextLine();
				}
			}
		}while(!ok);
		
		return num;
	}
*/
	
	public static int validInt(int min, int max)
	{
		int num = 0;
		boolean ok;
		
		do
		{
			try
			{
				ok = true;
				num = key.nextInt();
				key.nextLine();
				
				if(num<min || num>max)
				{
					ok = false;
					My.p(String.format("\n\tError: Range is %2d - %2d. Please re-enter. ", min, max));
				}
			}
			catch (InputMismatchException e)
			{
				My.p("\n\tError: Illegal character(s) input. Please re-enter. ");
				key.nextLine();
				ok = false;
			}	
		}while(!ok);
		
		return num;
	}
	
	public static int validInt2()
	{
		int num = 0;
		boolean ok;
		
		do
		{
			try
			{
				ok = true;
				num = key.nextInt();
				key.nextLine();
				
			}
			catch (InputMismatchException e)
			{
				My.p("\n\tError: Illegal character(s) input. Please re-enter. ");
				key.nextLine();
				ok = false;
			}	
		}while(!ok);
		
		return num;
	}
	
	
	public static double validDouble(int min, int max)
	{
		double num = 0;
		boolean ok;
		
		do
		{
			try
			{
				ok=true;
				num = key.nextDouble();
				key.nextLine();
				
				if(num<min || num>max)
				{
					ok = false;
					My.p(String.format("\n\tError: Range is %2d - %2d. Please re-enter,", min, max));
				}
			}
			catch (InputMismatchException e)
			{
				My.p("\n\tError: Illegal character(s); input. Please re-enter. ");
				key.nextLine();
				ok=false;
			}		
		}while(!ok);
		
		return num;
	}
	
	public static double validDouble2()
	{
		double num=0;
		boolean ok;
		
		do
		{
			try
			{
				ok=true;
				num = key.nextDouble();
				key.nextLine();
				
			}
			catch (InputMismatchException e)
			{
				My.p("\n\tError: Illegal character(s); input. Please re-enter. ");
				key.nextLine();
				ok=false;
			}		
		}while(!ok);
		
		return num;
	}
	
	public static char validChar(String message)
	{
		char c;
		boolean valid;
		
		do
		{
			valid = true;
			System.out.println(message);
			c = key.next().charAt(0);
			if (c == 'y' || c == 'Y' || c == 'n' || c == 'N')
			{
				valid = true;
			}
			else
			{
				valid = false;
				System.out.println("Error! Must input Y/N");
			}
			
		} while (!valid);
		
		return c;
	}

}
