import java.util.Scanner;

public class Exercise8
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		String[] name = new String[4];

		for (int x = 0; x < 4; x++)
		{
			System.out.print("Enter name " + x + ": ");
			name[x] = keyboard.nextLine();
		}

		String[] myArray = {name[0], name[1], name[2], name[3]};

		System.out.println("\nEntered names:\n");

		for (int i = 0; i < myArray.length; i++)
		{
			System.out.println("Index " + i + " is: " + myArray[i]);
		}


	}
}