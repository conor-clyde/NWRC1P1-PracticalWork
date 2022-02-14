package forExercises;

import java.util.Scanner;
import general.*;

public class PoundsToDollars {

	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		
		for(double inPounds = 1.00; inPounds <=10.00; inPounds += 0.5 )
			System.out.printf("\n\t£%5.2f\t\t\t$%5.2f", inPounds, inPounds * 1.54);			
	}
}
