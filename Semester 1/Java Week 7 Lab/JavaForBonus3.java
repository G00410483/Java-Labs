import java.util.Scanner;
import java.util.Random;
public class JavaForBonus3
{
	public static void main(String[] args)
	{

		Scanner keyboard = new Scanner(System.in);
		Random randomNumber = new Random();

		int rand1;
		int rand2;
		int num1;
		int sum = 0;

		System.out.println("Type in the answer of the equation: ");

		for (int numTurn = 1; numTurn <= 10; numTurn++)
		{
			rand1 = randomNumber.nextInt(26) + 5;
			rand2 = randomNumber.nextInt(26) + 5;
			System.out.print(rand1 + " + " + rand2 + " = ");
			num1 = keyboard.nextInt();

			if (num1 == rand1 + rand2)
			{
				sum++;
			}
		}

		System.out.println("Well done! You got " + sum + " correct.");


	}
}