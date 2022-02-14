package switchExercises;

import java.util.Scanner;
import general.*;

public class MenuOptions 
{
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		
		int optionChosen=0;
		
		System.out.print("\n\tPlease select an option:");
		System.out.print("\n\tOption 1.");
		System.out.print("\n\tOption 2.");
		System.out.print("\n\tOption 3.");
		System.out.print("\n\tOption 4.");
		System.out.print("\n\tOption 5.");
		System.out.print("\n\tOption 6 (exit). ");
		optionChosen = MyVal.validInt(1, 6);
		
		switch (optionChosen)
		{
			case 1: 
				My.p("\n\tYou have seleted option 1.");
				break;
			case 2: 
				My.p("\n\tYou have seleted option 2.");
				break;	
			case 3: 
				My.p("\n\tYou have seleted option 3.");
				break;
			case 4: 
				My.p("\n\tYou have seleted option 4.");
				break;
			case 5: 
				My.p("\n\tYou have seleted option 5.");
				break;
			case 6: 
				My.p("\n\tYou have seleted option 6 (exit).");
				break;		
		}
	}
}