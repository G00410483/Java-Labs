import java.util.Scanner;
public class JavaIfElse7
{
	public static void main (String []args)
	{
		int score;

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter score number: ");
		score = keyboard.nextInt();

		if(score < 40)
		{
			System.out.println("Score of " + score + " is less than 40. Grade is E!");
		}

		else if (score >= 40 && score <= 49)
		{
			System.out.println("Score of " + score + ". Grade is D!");
		}
		else if (score >= 50 && score <= 59)
		{
			System.out.println("Score of " + score + ". Grade is C!");
		}
		else if (score >= 60 && score <= 69)
		{
			System.out.println("Score of " + score + ". Grade is B!");
		}
		else if (score >= 70 )
		{
			System.out.println("Score of " + score + ". Grade is A!");
		}
	}
}
