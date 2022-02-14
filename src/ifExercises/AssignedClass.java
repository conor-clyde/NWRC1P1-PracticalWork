package ifExercises;

import java.util.Scanner;
import general.*;

public class AssignedClass 
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		
		int testMark=0;
		String studentName="", assignedClass="";
		
		System.out.print("\n\tPlease enter your name: ");
		studentName = key.next();
		
		System.out.print("\n\tPlease enter your mark: ");
		testMark = MyVal.validInt2();
		
		if (testMark > 60)
			assignedClass = "A";
		else
			assignedClass = "B";
		
		System.out.print("\n\tHello " + studentName + ", your assigned class is class " + assignedClass);
	}
}