package switchExercises;

import java.util.Scanner;
import general.*;

public class ChooseMathOperation {

	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		
		int int1=0, int2=0;
		double result=0;
		char mathOperationChosen=' ';
		
		My.p("\n\tPlease enter the first number: ");
		int1 = key.nextInt();
		
		My.p("\n\tPlease enter the second number: ");
		int2 = key.nextInt();
		
		My.p("\n\tPlease select a mathematical operation:");
		My.p("\n\tYour options are +, -, /, or * ");
		key.nextLine();
		mathOperationChosen = key.nextLine().charAt(0);
				
		switch (mathOperationChosen)
		{
			case '+': 
				result = int1 + int2;
				break;					
			case '-': 
				result = int1 - int2;
				break;	
			case '/': 
				result = int1 / int2;
				break;
					
			case '*': 
				result = int1 * int2;
				break;
		}
		
		My.p("\n\tThe result is " + result);
	}
}
