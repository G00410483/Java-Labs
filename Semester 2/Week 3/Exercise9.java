import java.util.Scanner;

public class Exercise9
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		double distance;
		int selection;

		System.out.print("Enter distance in meters: ");
		distance = keyboard.nextDouble();

		do
		{
			menu();
			System.out.print("Enter your choice: ");
			selection = keyboard.nextInt();

			switch (selection)
			{
				case 1:
					showKilometers(distance);
					break;
				case 2:
					showInches(distance);
					break;
				case 3:
					showFeet(distance);
					break;
				case 4:
					System.out.println("Bye");
					break;
			}

		} while (selection != 4);

	}
	public static void menu()
	{
		System.out.println("\nSelect the option:");
		System.out.println("1.Convert to kilometer\n2.Convert to inches\n3.Convert to feet\n4.Quit the program");
	}
	public static double showKilometers(double distance)
	{
		double kilometers = distance * 0.001;
		System.out.println(distance + " meters is " + kilometers + " kilometers\n");
		return kilometers;
	}
	public static double showInches(double distance)
	{
		double inches = distance * 39.37;
		System.out.println(distance + " meters is " + inches + " inches\n");
		return inches;
	}
	public static double showFeet(double distance)
	{
		double feet = distance * 3.281;
		System.out.println(distance + " meters is " + feet + " feet\n");
		return feet;
	}
}