import java.util.Scanner;

public class Exercise9
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		double[] sales = new double[12];

		for (int x = 0; x < sales.length; x++)
		{
			System.out.print("Enter sales for month " + (x +1) + ": ");
			sales[x] = keyboard.nextDouble();
		}

		System.out.println("\nEntered names:\n");

		for (int i = 0; i < sales.length; i++)
		{
			System.out.println("Month " + (i +1) + " is: " + sales[i]);
		}


	}
}