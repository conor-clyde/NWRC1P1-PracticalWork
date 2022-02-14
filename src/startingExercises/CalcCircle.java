package startingExercises;

import java.util.Scanner;
import general.*;

public class CalcCircle
{
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		
		final double pi = 3.1415926;
		int rad1 = 0, rad2 = 0, rad3 = 0;
		double c1 = 0, c2 = 0, c3 = 0, area1 = 0, area2 = 0, area3 = 0;
		
		System.out.print("\n\tPlease input the radius of the first circle: ");
		rad1 = MyVal.validInt(0, 100);
		
		System.out.print("\n\tPlease input the radius of the second circle: ");
		rad2 = MyVal.validInt(0, 100);
		
		System.out.print("\n\tPlease input the radius of the third circle: ");
		rad3 = MyVal.validInt(0, 100);
		
		c1 = 2 * pi * rad1;
		c2 = 2 * pi * rad2;
		c3 = 2 * pi * rad3;
		
		area1 = pi * (rad1 * rad1);
		area2 = pi * (rad2 * rad2);
		area3 = pi * (rad3 * rad3);
		
		System.out.printf("\n\tThe circumference of the first circle is %.3f, and its area is %.3f", c1, area1);
		System.out.printf("\n\tThe circumference of the second circle is %.3f, and its area is %.3f", c2, area2);
		System.out.printf("\n\tThe circumference of the third circle is %.3f, and its area is %.3f", c3, area3);
	}
}
