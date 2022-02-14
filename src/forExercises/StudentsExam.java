package forExercises;

import java.util.Scanner;
import general.*;

public class StudentsExam
{
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		
		String studentName="", details="";
		int examMark=0, examMarkTotal=0;
		double overallAvg=0, studentAvg1=0, studentAvg2=0, studentAvg3=0, studentAvg4=0, studentAvg5=0;
		
		for(int studentCount = 1; studentCount < 6; studentCount++)
		{
			My.p("\n\tPlease enter the name of student " + studentCount + ": " );
			studentName = key.next();
			details = details + studentName + "\t";
			
			for (int subjectCount = 1; subjectCount < 4; subjectCount++)
			{
				My.p("\n\tPlease enter student " + studentCount + "'s mark for subject " + subjectCount + ": ");
				examMark = MyVal.validInt(0, 100);		
			
				details = details + examMark + "\t";
				examMarkTotal = examMarkTotal + examMark;	
			
				if (subjectCount ==3 && studentCount ==1)
				{
					studentAvg1 = examMarkTotal / 3.0;
					details = details + "average = " + studentAvg1 + "\t";
				}
			
				if (subjectCount ==3 && studentCount ==2)
				{
					studentAvg2 = examMarkTotal / 3.0;
					details = details + "average = " + studentAvg2 + "\t";
				}
			
				if (subjectCount ==3 && studentCount ==3)
				{
					studentAvg3 = examMarkTotal / 3.0;
					details = details + "average = " + studentAvg3 + "\t";
				}
			
				if (subjectCount ==3 && studentCount ==4)
				{
					studentAvg4 = examMarkTotal / 3.0;
					details = details + "average = " + studentAvg4 + "\t";
				}	
			
				if (subjectCount ==3 && studentCount ==5)
				{
					studentAvg5 = examMarkTotal / 3.0;
					details = details + "average = " + studentAvg5 + "\t";
				}	
			}
		
			examMarkTotal=0;
				
			details = details + "\n";		
		}
		
			My.p("\n\tThe results are as follows: \n");
			My.p(details);
	}
}
