import java.util.Scanner;

public class Exercise12
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		Die dP = new Die();
		Die dC = new Die();

		String option = "y";

		int pointsP = 0;
		int pointsC = 0;

		do
		{
		System.out.print("Roll the dice (y/n): ");
		option = keyboard.nextLine();



		if (option.equalsIgnoreCase("y"))
		{
			dP.roll();
			dC.roll();
			pointsP = pointsP + dP.getValue();
			pointsC = pointsC + dC.getValue();
			System.out.println("Points: " + pointsP);
		}
		else if (option.equalsIgnoreCase("n"))
		{
			break;
		}


		} while (option.equalsIgnoreCase("y") && pointsP <= 21);

		System.out.println("Game over ! \n");
		System.out.println("Users points: " + pointsP);
		System.out.println("Computers points: " + pointsC);

		if (pointsP > pointsC)
		{
			System.out.println("User wins");
		}
		else
		{
			System.out.println("Computer wins");
		}
	}
}
