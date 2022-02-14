package arrayExercises;

import java.util.Scanner;
import general.*;

public class TenItems 
{
	//Needs Fixed
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		String[] itemName = new String[10];
		double[] itemPrice = new double[10];
		int[] itemQuantity = new int[10];
		
		for (int i=0; i<10; i++)
		{
			
		System.out.printf("\n\tEnter the name of item #%d.", i+1);
		itemName[i] = key.next();
		
		System.out.printf("\n\tEnter the price of item #%d.", i+1);
		itemPrice[i] = key.nextDouble();
		
		System.out.printf("\n\tEnter the quantity of item #%d.", i+1);
		itemQuantity[i] = key.nextInt();
		}

	}

}
