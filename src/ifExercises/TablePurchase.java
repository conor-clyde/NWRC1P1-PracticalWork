package ifExercises;

import java.util.Scanner;
import general.*;

public class TablePurchase
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
				
		int woodTypeSelection=0, tableSizeSelection=0;
		double woodTypeCost=0, largeTableCost=35, finalCost=0;
		String woodTypeChosen="", tableSizeChosen="";
		
		My.p("\n\tPlease decide on the type of wood that you want for your table.");
		My.p("\n\tEnter 1 for Pine.");
		My.p("\n\tEnter 2 for Oak.");
		My.p("\n\tEnter 3 for Mahogany.");
		woodTypeSelection = MyVal.validInt(1, 3);
		
		if (woodTypeSelection==1)
		{
			woodTypeCost = 300.00;
			woodTypeChosen = "Pine";
		}
		else if (woodTypeSelection==2)
		{
			woodTypeCost = 225.00;
			woodTypeChosen = "Oak";
		}
		else
		{
			woodTypeCost = 310.00;
			woodTypeChosen = "Mahogany";
		}		
		
		My.p("\n\tYou have chosen " + woodTypeChosen);
		System.out.printf("\n\tThis choice will cost you £%.2f", woodTypeCost);
		
		My.p("\n\n\tPlease decide on the size of table that you want.");
		My.p("\n\tEnter 1 for a small table, you will be charged no extra cost for this choice.");
		My.p("\n\tEnter 2 for a large table, you will be charged an additonal cost of £35.00.");
		tableSizeSelection = MyVal.validInt(1, 2);
		
		if (tableSizeSelection==2)
			finalCost = woodTypeCost + largeTableCost;
		else
			finalCost = woodTypeCost;
	
		System.out.printf("\n\tThe final cost of your purchase is £%.2f", finalCost);
	}
}