package methodExercises;

import java.util.Scanner;
import general.*;

public class IsPerfectNumber
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		int num = 0;
		boolean isPerfectNum;
		
        My.p("\n\tPlease enter a number: ");
        num = MyVal.validInt2();
					
		isPerfectNum = checkIfPerfectNum(num);	
		
		if(isPerfectNum==true)
			My.p("\n\t" + num + " is a perfect number.");
		else
			My.p("\n\t" + num + " is not a perfect number.");
	}

	public static boolean checkIfPerfectNum(int num)
	{
		int sum = 0;
		
        for(int i = 1; i < num; i++)
        {
           if (num % i == 0)
            {
                sum = sum + i;
            }
        }
        
        if(sum == num)
        {
            return true;
        }
        else
        {
            return false;
        }    
	}
}
