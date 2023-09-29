import java.util.Scanner;

public class Exercise11
{
	public static void main (String[] args)
	{
		int countH = 0;
		int countT = 0;

		Scanner keyboard = new Scanner(System.in);
		Coin c1 = new Coin();

		System.out.print("The side initially facing up: ");
		String input = keyboard.nextLine();

		System.out.println("Flipping the coin 20 times:");

		for (int i = 1; i <= 20; i++)
		{
			c1.Toss();
			System.out.println("\tToss: " + c1.getSideUp());

			if (c1.getSideUp().equals("Heads"))
			{
				countH++;
			}
			else if (c1.getSideUp().equals("Tails"))
			{
				countT++;
			}
		}
	}
}
