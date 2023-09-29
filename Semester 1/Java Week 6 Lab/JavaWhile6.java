import java.util.Scanner;

public class JavaWhile6
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int number1 = 0;
		char answer = 'y';



		while (answer == 'y')
		{
			System.out.print("Enter a number :");
			number1 = keyboard.nextInt();
			double mod = number1 % 2;

		if (mod == 0)
			{
			System.out.println("The number is even.");
			}
		else if (mod > 0)
			{
			System.out.println("The number is odd.");
			}

			System.out.print("Enter y to continue :");
			answer = keyboard.next().charAt(0);
		}

	}
}