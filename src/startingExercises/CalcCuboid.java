package startingExercises;

import java.util.Scanner;
import general.*;

public class CalcCuboid
{
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		
		double length=0, breadth=0, height=0, perimeter=0, surfaceArea=0, volume=0;
		
		System.out.print("\n\tPlease input the length of the cuboid: ");
		length = MyVal.validDouble(0, 100);
		
		System.out.print("\n\tPlease input the breadth of the cuboid: ");
		breadth = MyVal.validDouble(0, 100);
		
		System.out.print("\n\tPlease input the height of the cuboid: ");
		height = MyVal.validDouble(0, 100);
		
		perimeter = 4 * (length + height + breadth);
		surfaceArea = 2 * height * (length + breadth);
		volume = length * breadth * height;
		
		System.out.printf("\n\tThe cuboid has a perimeter of %.3f, a volume of %.3f, and a surface area of %.3f. ", perimeter, volume, surfaceArea);
	}
}
