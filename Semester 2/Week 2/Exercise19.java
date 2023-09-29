import java.util.Scanner;
import java.util.Random;

public class Exercise19
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter marks: ");
		int mark = keyboard.nextInt();

		String myVar = markReturn(mark);
		System.out.println("Grade for this score is: " + myVar);
	}
	public static String markReturn(int mark)
	{
		String score;

		if (mark <= 100 && mark >= 85)
		{
			score = "A+";
			return score;
		}
		else if (mark <= 84 && mark >= 70)
		{
			score = "A";
			return score;
		}
		else if (mark <= 69 && mark >= 60)
		{
			score = "B";
			return score;
		}

		else if (mark <= 60 && mark >= 50)
		{
			score = "C";
			return score;
		}
		else if (mark <= 50 && mark >= 40)
		{
			score = "D";
			return score;
		}
		else if (mark <= 40 && mark >= 30)
		{
			score = "E";
			return score;
		}
		else
		{
			score = "N/A";
			return score;
		}

	}
}