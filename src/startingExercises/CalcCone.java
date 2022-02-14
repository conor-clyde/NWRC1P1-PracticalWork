package startingExercises;

import java.util.Scanner;
import general.*;

public class CalcCone 
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		
		final double pi=3.1415926;
		double height=0, radius=0, volume=0, surfaceArea=0;
		
		System.out.print("\n\tPlease enter the height of the cone: ");
		height = MyVal.validDouble(0, 100);
		
		System.out.print("\n\tPlease enter the radius of the cone: ");
		radius =  MyVal.validDouble(0, 100);
		
		volume = pi * (radius*radius) * (height/3 );
		surfaceArea = pi * radius * (radius + Math.sqrt((height*height) + (radius*radius))) ;
		
		System.out.printf("\n\tThe volume of the cone is %.3f, and its surface area is %.3f ", volume, surfaceArea);
	}
}
