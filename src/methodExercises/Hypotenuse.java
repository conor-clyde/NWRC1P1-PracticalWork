package methodExercises;

import java.util.Scanner;
import general.*;

public class Hypotenuse 
{
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		
		double side1=0, side2=0, hypotenuse=0;
		
		My.p("\n\tPlease enter side 1:");
		side1=MyVal.validDouble2();
		
		My.p("\n\tPlease enter side 2:");
		side2=MyVal.validDouble2();
		
		hypotenuse = calcHypotenuse(side1, side2);

		System.out.printf("\n\tThe hypotenuse is %.2f", hypotenuse);
	}
	
	public static double calcHypotenuse(double side1, double side2)
	{
		return Math.sqrt(side1*side1 + side2*side2);
	}
}
