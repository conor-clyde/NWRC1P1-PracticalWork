package methodExercises;

import java.util.Scanner;
import general.*;

public class GreatestCommonDivisor {

	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		int num1 = 0, num2 = 0, gcd = 0;
		
		My.p("\n\tPlease enter number 1: ");
		num1=MyVal.validInt2();
		
		My.p("\n\tPlease enter number 2: ");
		num2=MyVal.validInt2();
		
		gcd = returnGCD(num1, num2);
		
		System.out.print("\n\tThe greatest common divsor is " + gcd);
	}
	
	public static int returnGCD(int num1, int num2)
	{
		while(num1 != num2)
        {
            if(num1 > num2)
                num1 -= num2;
            else
                num2 -= num1;
        }
		return num1;
	}
}
