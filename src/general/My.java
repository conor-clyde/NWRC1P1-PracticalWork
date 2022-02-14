package general;

import java.util.Scanner;
import general.*;

public class My
{
	static Scanner key = new Scanner (System.in);
	
	public static void p (String s)
	{
		System.out.print(s);
	}
	
	public static char again(String s)
	{
		Scanner key = new Scanner (System.in);
		
		String input;
		char ch;
		
		do
		{
			p("\n\t" + s + " ");
			input=key.next();
			ch=input.toUpperCase().charAt(0);
			
			if(ch!='Y' && ch!='N')
				p("\n\n\tError - Please enter Y or N.");
		}while(ch!='Y' && ch!='N');
		
		return ch;
		}
	
	public static void pressKey()
	{
		p("\n\n\tPress return key to continue...");
		key.nextLine();
	}
	
	public static void skip(int n)
	{
		for(int i=0; i<n; i++)
			System.out.println();
	}
}
