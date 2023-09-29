import java.io.*;
import java.util.Scanner;

public class Exercise1
{
	public static void main(String[] args) throws IOException
	{
		File file = new File("gymkit.txt");
		Scanner inputFile = new Scanner(file);
		Scanner s1 = new Scanner(System.in);

		String[] gym = new String[16];

		int number = 1;

		for (int i = 0; i < gym.length; i++)
		{
			gym[i] = inputFile.nextLine();
		}

		while(number != 0)
		{
			System.out.print("Type number of machines in use (0 to end): ");
			number = s1.nextInt();

			if (number != 0)
			{
				gym[number - 1] = gym[number- 1] + " <<<<<<<- IN USE";
			}
		}

		System.out.println("*****Welcome to JAVA gym*****");
		System.out.println("-- List Of Avaliable Gym Machines --");

		for (int i = 0; i < gym.length; i++)
		{
			System.out.println((i + 1) + ". " + gym[i]);
		}


		String machine;
		boolean stock = false;

		System.out.println("");

		do
		{
			System.out.print("Search for machine: ");
			machine = s1.nextLine();

			for (int i = 0; i < gym.length; i++)
			{
				if (gym[i].equalsIgnoreCase(machine))
				{
					System.out.println(machine + " is number " + (i + 1) + " on the list.");
					stock = true;
					break;
				}
			}
			if (!stock)
			{
				System.out.println("Machine not found.");
			}
		}	while (!machine.equalsIgnoreCase("end"));

		System.out.println("");

		Member a = new Member("Arnold", "Schwartz", 'P');
		Member b = new Member("Becky", "Roberts");
		Member c = new Member("Kate", "Leigh");

		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());


		System.out.println(a.gymReport() + "\n");
		System.out.println(a.annualReport() + "\n");
		System.out.println(a.openingHours() + "\n");


	}
}