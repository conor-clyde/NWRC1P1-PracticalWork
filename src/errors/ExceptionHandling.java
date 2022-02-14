package errors;

import java.util.InputMismatchException;
import java.util.Scanner;
import general.*;

public class ExceptionHandling
{
	public static void main(String[] args)
	{
		try
		{
			Scanner key = new Scanner(System.in);
			
			int num;
			
			num = 10/0;
			System.out.print(num);     //ArithmeticException
			
			System.out.print("\n\n\tPlease input a number: ");
			num = key.nextInt();     //InputTypeMismatch
			
			int a[] = new int[5];
			a[10] = 50;     //ArrayIndexOutOfBoundsException
			
			String s1 = "abc";
			int i=Integer.parseInt(s1);     //NumberFormatException
			
			String s2 = null;
			System.out.println(s2.length());     //NullPointerException
		}
		
		catch(ArithmeticException e)
		{
			System.out.print("\n\n\tYou have an error in your calculations.");
		}
		
		catch (InputMismatchException e)
		{
			System.out.print("\n\n\tPlease input a number.");
		}
		
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.print("\n\n\tYou are trying to acss an array element that does not exist.");
		}
		
		catch (NumberFormatException e)
		{
			System.out.print("\n\n\tYou can't parse a string.");
		}
		
		catch (NullPointerException e)
		{
			System.out.print("\n\n\tSet your string to a value befoer you calculate its length.");
		}
	}
}
