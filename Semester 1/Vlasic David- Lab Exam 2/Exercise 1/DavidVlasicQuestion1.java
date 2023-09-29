//David Vlasic, G00410483
import java.util.Scanner;

public class DavidVlasicQuestion1
{
	public static void main(String[] args)
	{

		Scanner keyboard = new Scanner(System.in);

		int number1;

		System.out.print("Enter a number to count from: ");//User enters value
		number1 = keyboard.nextInt();

		for (int i = number1; i <= number1+10; i++)//Start of the loop
		{
			System.out.println("Counting up ... " + i);
		}

	}
}
