import java.util.Scanner;
import java.util.Random;

public class Question2
{
	public static void main(String[] args)
		{

			Scanner keyboard = new Scanner(System.in);
			Random randomNumber = new Random();

			int num1, num2;
			int rand;

			System.out.println("This program will generate a random number based on input from the user.");

			System.out.print("Enter a number that random number starts at: ");
			num1 = keyboard.nextInt();
			System.out.print("Enter a number that random number ends at: ");
			num2 = keyboard.nextInt();

			for (int i = 1; i <= 10; i++)
			{
				rand = randomNumber.nextInt(num2-num1) + num1;
				System.out.println(rand);
			}
		}
}
