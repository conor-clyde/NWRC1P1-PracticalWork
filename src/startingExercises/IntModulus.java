package startingExercises;

import java.util.Scanner;
import general.*;

public class IntModulus {

	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		
		int num1=0, num2=0, modulus=0;
		
		System.out.print("\n\tPlease enter the first number: ");
		num1 = MyVal.validInt2();
		
		System.out.print("\n\tPlease enter the number that you wish to divide by: ");
		num2 = MyVal.validInt2();
		
		modulus = num1 % num2;
		
		System.out.print("\n\tThe modulus is " + modulus);
	}
}
