package switchExercises;

import java.util.Scanner;
import general.*;

public class ChipShopItems3 
{
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		
		int itemChoice=0, paymentChoice=0;
		double totalPayment=0, changeDue=0, costOfCheeseburger=4.99, costOfPepsi=2, costOfChips=2., costofMexicanBeef=5, costOfPizza=6.50;
		String itemName="";
		
		System.out.print("\n\tPlease make a selection from the following items. ");
		System.out.print("\n\tEnter 1 for a Cheeseburger, costing £4.99. ");
		System.out.print("\n\tEnter 2 for a Pepsi, costing £2.00. ");
		System.out.print("\n\tEnter 3 for Chips, costing £2.50. ");
		System.out.print("\n\tEnter 4 for Mexican Beef, costing £5.00. ");
		System.out.print("\n\tEnter 5 for a Pizza, costing £6.50. ");
		itemChoice = key.nextInt();
		
		switch (itemChoice)
		{
			case 1: 
				totalPayment = costOfCheeseburger;
				itemName = "Cheeseburger";
				break;
			case 2: 
				totalPayment = costOfPepsi;
				itemName = "Pepsi";
				break;	
			case 3: 
				totalPayment = costOfChips;
				itemName = "Chips";
				break;
			case 4: 
				totalPayment = costofMexicanBeef;
				itemName = "Mexican Beef";
				break;
			case 5: 
				totalPayment = costOfPizza;
				itemName = "Pizza";
				break;
			default: 
				System.out.print("Invalid item choce");
		}
		
		System.out.print("\n\tWhat are you using to pay for the item. Please make the selection below");
		System.out.print("\n\tEnter 1 for a £5 note");
		System.out.print("\n\tEnter 2 for a £10 note");
		System.out.print("\n\tEnter 3 for a £20 note");
		paymentChoice = key.nextInt();
		
		switch (paymentChoice)
		{
			case 1: 
				changeDue = 5 - totalPayment;
				break;
			case 2: 
				changeDue = 10 - totalPayment;
				break;	
			case 3: 
				changeDue = 20 - totalPayment;
				break;
			default: 
				System.out.print("Invalid payment choice");
		}
		
		if (changeDue < 0)
				System.out.print("\n\tError. Insufficent payment made.");
			else
			{
				System.out.print("\n\tYou have selected " + itemName);
				System.out.printf("\n\tYour item costs £%.2f", totalPayment);
				System.out.printf("\n\tThe change you are due is £%.2f", changeDue);
			}
	}
}
