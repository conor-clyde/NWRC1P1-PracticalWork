package switchExercises;

import java.util.Scanner;
import general.*;

public class ThreeSaleItems {

	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		
		String itemName1="", itemName2="", itemName3="", itemPurchasedName="";
		char custCategory=' ';
		int itemQuantity1=0, itemQuantity2=0, itemQuantity3=0, itemPurchased=0, delZone=0;
		double itemPrice1=0, itemPrice2=0, itemPrice3=0, amountToPay=0, itemTotal1=0, itemTotal2=0, itemTotal3=0, discountGranted=0, delCost=0, finalAmountToPay=0;
		
		System.out.print("\n\tPlease enter the name of item 1: ");
		itemName1 = key.nextLine();
		System.out.print("\n\tPlease enter the quantity of item 1: ");
		itemQuantity1 = key.nextInt();
		System.out.print("\n\tPlease enter the price of item 1: ");
		itemPrice1 = key.nextDouble();	
		
		System.out.print("\n\tPlease enter the name of item 2: ");
		itemName2 = key.next();
		System.out.print("\n\tPlease enter the quantity of item 2: ");
		itemQuantity2 = key.nextInt();
		System.out.print("\n\tPlease enter the price of item 2: ");
		itemPrice2 = key.nextDouble();
		
		System.out.print("\n\tPlease enter the name of item 3: ");
		itemName3 = key.next();
		System.out.print("\n\tPlease enter the quantity of item 3: ");
		itemQuantity3 = key.nextInt();
		System.out.print("\n\tPlease enter the price of item 3: ");
		itemPrice3 = key.nextDouble();	
		
		System.out.print("\n\tPlease enter your customer category.");
		System.out.print("\n\tThe categorys are A, B, C and D: ");
		key.nextLine();
		custCategory = key.nextLine().charAt(0);
	
		System.out.print("\n\tPlease enter your delivery zone.");
		System.out.print("\n\tYour options are 1, 2, 3, 4, 5: ");
		delZone = key.nextInt();

		itemTotal1 = itemQuantity1 * itemPrice1;
		itemTotal2 = itemQuantity2 * itemPrice2;
		itemTotal3 = itemQuantity3 * itemPrice3;
		
		amountToPay = itemTotal1 + itemTotal2 + itemTotal3;
			
		switch (custCategory)
		{
			case 'A'	:
				discountGranted = amountToPay * 0.1;
				amountToPay = amountToPay - discountGranted;
				break;
			case 'B':
				discountGranted = amountToPay * 0.075;
				amountToPay = amountToPay - discountGranted;
				break;
			case 'C':
				discountGranted = amountToPay * 0.05;
				amountToPay = amountToPay - discountGranted;
				break;
			case 'D':
				discountGranted = 0.00;
				amountToPay = amountToPay - discountGranted;
				break;	
		}
		
		switch (delZone)
		{
			case 1:
				delCost = 15.00;
				amountToPay = amountToPay + delCost;
				break;
			case 2:
				delCost = 10.75;
				amountToPay = amountToPay + delCost;
				break;
			case 3:
				delCost = 10.75;
				amountToPay = amountToPay + delCost;
				break;
			case 4:
				delCost = 10.75;
				amountToPay = amountToPay + delCost;
				break;
			case 5:
				delCost = 5.00;
				amountToPay = amountToPay + delCost;
				break;	
		}
		
		if (custCategory != 'A' && custCategory != 'B' && custCategory != 'C' && custCategory != 'D')
			System.out.print("Invalid customer category entered");
		else
		{
			if (delZone < 1  || delZone > 5)
				System.out.print("Invalid delivery zone entered");
			else
			{		
				System.out.print("\n\tYou have purchased: ");
				System.out.print("\n\tA quantity of " + itemQuantity1 + " of " + itemName1 + ", which costs £" + itemPrice1 + " per item.");
				System.out.print("\n\tA quantity of " + itemQuantity2 + " of " + itemName2 + ", which costs £" + itemPrice2 + " per item.");
				System.out.print("\n\tA quantity of " + itemQuantity3 + " of " + itemName3 + ", which costs £" + itemPrice3 + " per item.");
				System.out.print("\n\n\tYour customer category grants you a discount of £" + discountGranted);
				System.out.print("\n\tYou will be charged a delivery charge of £" + delCost);
				System.out.print("\n\tYour final total is £" + amountToPay);	
			}
		}
	}
}