package methodExercises;

import java.util.Scanner;
import general.*;

public class IsPrimeNumber {

	public static void main(String[] args)
	{
        Scanner key = new Scanner(System.in);
		
		int num = 0;
        boolean isPrime = true;
        
        My.p("\n\tPlease enter a number: ");
        num = MyVal.validInt2();
        
        isPrime = checkIfPrimeNum(num);
            
        if (isPrime)
        	My.p("\n\t" + num + " is a prime number.");    
        else
            My.p("\n\t" + num + " isn't a prime number.");
	}

	public static boolean checkIfPrimeNum(int num)
	{
		 int remainder;
	     for (int i = 2; i <= num / 2; i++) 
	     {
	            remainder = num % i;
	           
	            if (remainder == 0) 
	            {
	                return false;		
	            }
	      }
	      return true;
}
}
