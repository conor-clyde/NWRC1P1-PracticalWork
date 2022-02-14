package methodExercises;

import java.util.Scanner;
import general.*;

public class QualityPoints 
{

	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		
		int studentAvg = 0, qualityPoints = 0;
		
		My.p("\n\tPlease enter the student's average: ");
		studentAvg = MyVal.validInt(0, 100);
		
		qualityPoints = qualityInsurance(studentAvg);
		
		My.p("\n\tQuality Points: " + qualityPoints);
	}
	
	public static int qualityInsurance(int studentAvg)
	{
		if(studentAvg <101 && studentAvg >89)
			return 4;
		else if (studentAvg <90 && studentAvg>79)
			return 3;
		else if (studentAvg<80 && studentAvg>69)
			return 2;
		else if (studentAvg<70 && studentAvg>59)
			return 1;
		else
			return 0;
	}
}
