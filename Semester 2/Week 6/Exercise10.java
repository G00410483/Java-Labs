import java.util.Scanner;

public class Exercise10
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("How many names do you wish to enter: ");
		int numOfNames = keyboard.nextInt();
		keyboard.nextLine();

		String[] name = new String[numOfNames];

		for (int x = 0; x < numOfNames; x++)
		{
			System.out.print("Enter name for index " + x + ": ");
			name[x] = keyboard.nextLine();
		}

		System.out.println("\nNames entered\n");

		for (int i = 0; i < numOfNames; i++)
		{
			System.out.println("Name index " + i + " is: " + name[i]);
		}

		System.out.println("\n\n");
		int nameAmend = 0;
		String newValue= "";

		do
		{
			System.out.print("Amend name entered?(Enter index to change or minus 1 to exit): ");
			nameAmend = keyboard.nextInt();
			keyboard.nextLine();

			if (nameAmend > 0)
			{

				System.out.println("Current name for index " + nameAmend + " is : " + name[nameAmend]);
				System.out.print("Enter new value: ");
				newValue = keyboard.nextLine();
				name[nameAmend] = newValue;
			}

		} while (nameAmend != -1);

		if (nameAmend == -1)
		{
			System.out.println("Changes completed!");
		}

		for (int i = 0; i < numOfNames; i++)
		{
			System.out.println("Name index " + i + " is: " + name[i]);
		}

	}
}