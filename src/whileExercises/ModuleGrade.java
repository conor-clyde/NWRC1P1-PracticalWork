package whileExercises;

import java.util.Scanner;
import general.*;

public class ModuleGrade 
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		
		String studentName="", details="";
		int result=0, noStudents=0, noReferrals=0, noPasses=0, noMerits=0, noDistinctions=0;
		double percentageReferrals=0, percentagePasses=0, percentageMerits=0, percentageDistinctions=0;
		char enterMore='Y';
	
		do
		{
			noStudents++;
			
			My.p("\n\tPlease enter the name of student #" + noStudents + ": ");
			studentName = key.next();
	
			My.p("\n\tPlease enter the result that " + studentName + " got: ");
			result = MyVal.validInt(0, 100);
			
			if (result < 40)
				noReferrals++;
			else if (result >=40 && result <60)
				noPasses++;
			else if (result >=60 && result <75)
				noMerits++;
			else if (result >=75 && result <=100)
				noDistinctions++;
			else
			{
				My.p("\n\tInvalid result entered");
				return;
			}
			
			if (noStudents > 4)
			{
				My.p("\n\tWould you like to enter another student. ");
				My.p("\n\tEnter Y for yes, N for no. ");
				key.nextLine();
				
				enterMore = Character.toUpperCase( key.next().charAt(0) );					
			}
		} while (enterMore == 'Y' || enterMore == 'y');
		
		percentageReferrals = (noReferrals * 100) / noStudents;
		percentagePasses = (noPasses * 100) / noStudents;
		percentageMerits = (noMerits * 100) / noStudents;
		percentageDistinctions = (noDistinctions * 100) / noStudents;
		
		My.p("\n\tThere are " + noReferrals + " referrals, ");
		My.p(noPasses + " passes, ");
		My.p(noMerits + " merits, and ");
		My.p(noDistinctions + " distinctions.");
		
		My.p("\n\tReferrals: " + percentageReferrals + "%" );
		My.p("\n\tPasses: " + percentagePasses + "%" );
		My.p("\n\tMerits: " + percentageMerits + "%" );
		My.p("\n\tDistinctions: " + percentageDistinctions + "%" );
	}
}