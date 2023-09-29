import java.util.Random;
import java.util.Scanner;

public class JavaRandom8
{
	public static void main(String[] args)
	{
		System.out.println("LUCKY DICE GAME");

		int num1;
		int num2;

		Random randomNumber = new Random();
		Scanner keyboard = new Scanner(System.in);


		num1 = randomNumber.nextInt(6) + 1;

		System.out.print("What side will the dice land on: ");
		num2 = keyboard.nextInt();

		if (num1 == num2)
		{
			System.out.println("You won!");
		}
		else
		{
			System.out.println("You lost. Better luck next time!");
		}
	}
}