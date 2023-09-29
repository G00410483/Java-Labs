import java.util.Scanner;
public class JavaIfElse4
{
	public static void main (String []args)
	{
		int userNumber;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a number: ");
		userNumber = keyboard.nextInt();


		if(userNumber > 0)
		{
			System.out.println("The number you entered is positive");
		}

		else if (userNumber < 0)
		{
			System.out.println("The number you entered is negative");
		}

	}
}
