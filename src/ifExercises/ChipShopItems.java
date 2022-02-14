package ifExercises;

import java.util.Scanner;
import general.*;

public class ChipShopItems 
{
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
				
		int itemChoice=0, paymentChoice=0;
		double totalPayment=0, changeDue=0, costOfCheeseburger=4.99, costOfPepsi=2.00, costOfChips=2.50, costofMexicanBeef=5.00, costOfPizza=6.50;
		String itemName="";
				
		My.p("\n\tEnter 1 for a Cheeseburger, costing £4.99.");
		My.p("\n\tEnter 2 for a Pepsi, costing £2.00. ");
		My.p("\n\tEnter 3 for Chips, costing £2.50. ");
		My.p("\n\tEnter 4 for Mexican Beef, costing £5.00. ");
		My.p("\n\tEnter 5 for a Pizza, costing £6.50. ");
		itemChoice = MyVal.validInt(1, 5);
				
		My.p("\n\tWhat are you using to pay for the item. Please make the selection below");
		My.p("\n\tEnter 1 for a £5 note");
		My.p("\n\tEnter 2 for a £10 note");
		My.p("\n\tEnter 3 for a £20 note");
		paymentChoice = MyVal.validInt(1, 3);
			
		if (itemChoice==1)
		{
			totalPayment = costOfCheeseburger;
			itemName = "Cheeseburger";
		}
		else if (itemChoice == 2)
		{
			totalPayment = costOfPepsi;
			itemName = "Pepsi";
		}
		else  if (itemChoice==3)
		{
			totalPayment = costOfChips;
			itemName = "Chips";
		}
		else if (itemChoice==4)
		{
			totalPayment = costofMexicanBeef;
			itemName = "Mexican Beef";
		}
		else if (itemChoice==5)
		{
			totalPayment = costOfPizza;
			itemName = "Pizza";
		}
	
		if (paymentChoice==1)
			changeDue = 5 - totalPayment;
		else if (paymentChoice==2)
			changeDue = 10 - totalPayment;
		else  if (paymentChoice==3)
			changeDue = 20 - totalPayment;
		
		if (changeDue<0)
			My.p("\n\tError. Insufficent payment made.");			
		else
		{
			My.p("\n\tYou have selected " + itemName);
			System.out.printf("\n\tYour item costs £%.2f", totalPayment);
			System.out.printf("\n\tThe change you are due is £%.2f", changeDue);
		}
	}
}