package methodExercises;

import general.*;

public class PrintPrimeNumbers {

	public static void main(String[] args)
	{
		My.p("\n\tPrime numbers:");
            
       for (int num = 2; num <=10000; num++)
       {  
           printPrimeNums(num);
       }
}

	public static void printPrimeNums(int num)
	{
		 int remainder;
	     for (int i = 2; i <= num / 2; i++) 
	     {
	            remainder = num % i;
	           
	            if (remainder == 0) 
	            {
	                return;	
	            }
	      }
 		My.p("\n\t" + num);
}
}
