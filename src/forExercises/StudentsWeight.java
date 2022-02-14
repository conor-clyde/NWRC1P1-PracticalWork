package forExercises;

import java.util.Scanner;
import general.*;

public class StudentsWeight 
{
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		
		int weightInKG=0, weightInG=0, totalWeightInKG=0, totalWeightInG=0, totalWeightOnlyInG=0, avgWeightOnlyInG=0, WeightOnlyInG=0, avgWeightInKG=0, avgWeightInG=0;
	
		for (int i = 1; i <=5; i++)
		{
			My.p("\n\tPlease enter the weight in Kilograms of student #" + i + ": ");
			weightInKG = MyVal.validInt2();
			
			My.p("\n\tPlease enter the weight in Grams of student #" + i + ": ");
			weightInG = MyVal.validInt2();
			
			totalWeightInKG = totalWeightInKG + weightInKG;
			totalWeightInG = totalWeightInG + weightInG;
		}
		
		totalWeightOnlyInG = totalWeightInG + (totalWeightInKG * 1000);
		
		avgWeightOnlyInG = totalWeightOnlyInG / 5;
		
		avgWeightInKG = avgWeightOnlyInG / 1000;
		avgWeightInG = avgWeightOnlyInG % 1000;
		
		My.p("\n\n\tThe total weight of the students is" );
		My.p("\n\t" + totalWeightInKG + "kg");
		My.p("\t" + totalWeightInG + "g");
		
		My.p("\n\n\tThe average weight of the students is" );
		My.p("\n\t" + avgWeightInKG + "kg");
		My.p("\t" + avgWeightInG + "g");
	}
}