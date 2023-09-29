import java.util.Scanner;

public class Exercise15
{
	public static void main (String[] args)
	{
		Scanner s1 = new Scanner(System.in);

		int[] numId = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};

		char choice = 'y';

		do
		{
			for (int i = 0; i < numId.length; i++)
			{
				System.out.println("Employee ID " + i + ": " + numId[i]);
			}
			System.out.println("Chose index to edit: ");
			int option = s1.nextInt();

			System.out.println("Employee ID: " + numId[option]);
			System.out.print("Enter hours worked: ");
			double hours = s1.nextDouble();
			System.out.print("Enter hourl pay rate: ");
			double payRate = s1.nextDouble();

			System.out.println("\n\n");
			System.out.println("Employee ID: " + numId[option]);
			System.out.println("Hours worked: " + hours);
			System.out.println("Hourly pay rate: " + payRate);
			System.out.println("Wages :" + (payRate * hours));
			System.out.println("\n\n");

			System.out.print("Edit another one (Y/N): ");
			choice = s1.next().charAt(0);
			System.out.println("\n\n");


		} while (choice == 'y');
	}
}