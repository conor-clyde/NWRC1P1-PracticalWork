package ifExercises;

import java.util.Scanner;
import general.*;

public class CollegeAdmisson 
{
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		
		double gradePointAverage=0;
		int admissonTestScore=0;
		
		My.p("\n\tPlease enter the student's grade point average: ");
		gradePointAverage = MyVal.validDouble(0, 4);
		
		My.p("\n\tPlease enter the student's admisson test score ");
		admissonTestScore = MyVal.validInt(0,100);
		
		if(gradePointAverage >= 3.00 && admissonTestScore >= 60)
			My.p("\n\tAccept ");
		else if (gradePointAverage < 3.00 && admissonTestScore >= 80)
			My.p("\n\tAccept ");
		else
			My.p("\n\tReject ");
	}
}