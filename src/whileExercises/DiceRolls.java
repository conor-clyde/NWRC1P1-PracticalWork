package whileExercises;

import java.util.Scanner;
import general.*;

public class DiceRolls {

	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);

		int num=0, timesRolled=0;
		
		do
		{
			timesRolled++;
			num = (int)(Math.random()*((6-1)+1))+1;
			My.p(num + "\t");
		} while (num != 6);
		
		My.p("\n\n\tThe dice was rolled " + timesRolled + " times.");
	}
}
