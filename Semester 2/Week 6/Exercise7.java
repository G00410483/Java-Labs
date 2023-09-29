import java.util.Scanner;

public class Exercise7
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter value 0: ");
		int v0 = keyboard.nextInt();

		System.out.print("Enter value 1: ");
		int v1 = keyboard.nextInt();

		System.out.print("Enter value 2: ");
		int v2 = keyboard.nextInt();

		System.out.print("Enter value 3: ");
		int v3 = keyboard.nextInt();

		int[] myArray = {v0, v1, v2, v3};

		System.out.println("The array values are:");

		for (int i = 0; i < myArray.length; i++)
		{
			System.out.println("Index " + i + " value is: " + myArray[i]);
		}


	}
}