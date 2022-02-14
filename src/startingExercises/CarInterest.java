package startingExercises;

import java.util.Scanner;
import general.*;

public class CarInterest
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		
		int noYears=0;
		double carPrice=0, interestRate=0, totalInterestToPay=0, amountPaidByEndOfFirstYear=0, amountPaidByEndOfSecondYear=0, amountPaidByEndOfThirdYear=0, amountPaidByEndOfFourthYear=0, amountPaidByEndOfFifthYear=0; 
		
		System.out.print("\n\tPlease input the price of the car: ");
		carPrice = MyVal.validDouble2();
		
		System.out.print("\n\tPlease input the interest rate: ");
		interestRate = MyVal.validDouble2();
		
		System.out.print("\n\tPlease input the amount of years that you will pay over: ");
		noYears = MyVal.validInt2();

		amountPaidByEndOfFirstYear = carPrice + ( carPrice * interestRate );
		
		amountPaidByEndOfSecondYear = amountPaidByEndOfFirstYear + ( amountPaidByEndOfFirstYear * interestRate );
		
		amountPaidByEndOfThirdYear = amountPaidByEndOfSecondYear + ( amountPaidByEndOfSecondYear * interestRate );
		
		amountPaidByEndOfFourthYear = amountPaidByEndOfThirdYear + ( amountPaidByEndOfThirdYear * interestRate );
		
		amountPaidByEndOfFifthYear = amountPaidByEndOfFourthYear + ( amountPaidByEndOfFourthYear * interestRate );
		
		totalInterestToPay = amountPaidByEndOfFifthYear - carPrice;
		
		System.out.printf("\n\tYou will pay a total interest of %.3f", totalInterestToPay);
		System.out.printf("\n\tThe total you will pay is %.3f", amountPaidByEndOfFifthYear);
	}
}
