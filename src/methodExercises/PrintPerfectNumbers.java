package methodExercises;

import general.*;

public class PrintPerfectNumbers {

	public static void main(String[] args)
	{  	
		My.p("\n\tPerfect numbers:");
		for(int num=1; num<=1000 ; num++)
		{
			printPerfectNums(num);
	}
	}

	public static void printPerfectNums(int num)
	{
			int sum = 0;
			String numFactors = "";
		
        for(int i = 1; i < num; i++)
        {
           if (num % i == 0)
            {
                sum = sum + i;
                numFactors = numFactors + " " + i;
            }
        }
        
        if(sum == num)
        	 {
        		My.p("\n\t" + num);
        		My.p("\n\tFactors:" + numFactors);
        	 }
		}
}
