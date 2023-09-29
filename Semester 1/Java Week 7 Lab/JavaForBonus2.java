import java.util.Scanner;
import java.util.Random;
public class JavaForBonus2
{
	public static void main(String[] args)
	{

		Scanner keyboard = new Scanner(System.in);
		Random randomNumber = new Random();

		int rand;
		rand = randomNumber.nextInt(100) + 1;
		int num1;
		boolean correct = false;

		for (int numGuess = 1; numGuess <= 6 && !correct; numGuess++)
		{
			System.out.print("Guess the number between 1 and 100: ");
			num1 = keyboard.nextInt();

			if (num1 > rand)
			{
				System.out.println("Too high.");
			}
			else if (num1 < rand)
			{
				System.out.println("Too low.");
			}
			else if (num1 == rand)
			{
				System.out.println("Congrats! You won.");
				correct = true;
			}
			else if (num1 != rand || numGuess == 6)
			{
				System.out.println("Sorry, you didn't win. The answer was: " + rand);
			}


		}

	}
}