import java.util.Scanner;
import java.util.Random;

public class Exercise10
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random randomNumber = new Random();



		for (int i = 0; i <= 100; i++)
		{
			int rand;
			rand = randomNumber.nextInt();
		}
			check(rand);
	}
	public static boolean check(int rand)
	{
		boolean checkNumber;
		int even = 0;
		int odd = 0;

		if (rand % 2 == 0)
		{
			checkNumber = true;
			even++;
		}
		else
		{
			checkNumber = false;
			odd++;
		}
		System.out.println("Out of 100 numbers, " + even + " were even and " + odd + " were odd.");
		return checkNumber;

	}
}