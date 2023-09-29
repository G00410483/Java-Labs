import java.util.Scanner;

public class JavaWhile5
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int number1 = 0;


		while (number1 >= 0 && number1 <= 50)
		{
			System.out.print("Enter a number :");
			number1 = keyboard.nextInt();


		}

	}
}