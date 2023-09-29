import java.util.Scanner;

public class Exercise10
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter test score 1: ");
		int score1 = keyboard.nextInt();

		System.out.print("Enter test score 2: ");
		int score2 = keyboard.nextInt();

		System.out.print("Enter test score 3: ");
		int score3 = keyboard.nextInt();


		Testscore test = new Testscore();
		test.setTestscore(score1, score2, score3);

		System.out.println("The average test is : " + test.getAverage());

	}
}
