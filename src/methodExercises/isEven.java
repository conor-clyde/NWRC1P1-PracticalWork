package methodExercises;

import java.util.Scanner;
import general.*;

public class isEven {

	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		int num;
		char enterMore = 'Y';
		boolean isEven;
		
		while (enterMore=='Y')
		{
			My.p("\n\tPlease enter a number: ");
			num=MyVal.validInt2();
			
			isEven = checkIfEven(num);
		
			if(isEven==true)
				My.p("\n\t" + num + " is even.");
			else
				My.p("\n\t" + num + " is not even.");
			
			My.p("\n\tWould you like to enter another number? ");
			My.p("\n\tEnter Y for Y, N for No. ");
			enterMore = Character.toUpperCase(key.next().charAt(0));
		}
	}

	public static boolean checkIfEven(int num)
	{
		if(num%2==0)
			return true;
		else
			return false;
	}

}
