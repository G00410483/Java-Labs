import java.util.Scanner;
public class LayzDays
{
	public static void main (String []args)
	{
		System.out.println("-  -  -  W E L C O M E    T O  -  -  -");
		System.out.println("");
		System.out.println("-  -  -      LAZY RESORST      -  -  -");
		System.out.println("");
		System.out.println("-  -  -         Ireland        -  -  -");
		System.out.println("");
		System.out.println("");
		double temp;
		String location;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter current temperature: ");
		temp = keyboard.nextDouble();
		System.out.println("");

		System.out.print("Enter location: ");
		location = keyboard.nextLine();
		location = keyboard.nextLine();
		System.out.println("");

		if (location.equalsIgnoreCase("Galway"))
		{
			if (temp >= 20)
			{
				System.out.println("Activity: Swimming");
			}
			else if (temp < 20 && temp >= 15)
			{
				System.out.println("Activity: Tennis");
			}
			else if (temp < 15 && temp >= 10)
			{
				System.out.println("Activity: Golf");
			}
			else if (temp < 10 && temp >= 5)
			{
				System.out.println("Activity: Hiking");
			}
			else if (temp < 5 || temp > 30)
			{
				System.out.println("Visit our gift shop !");
			}
		}
		if (location.equalsIgnoreCase("Athlone"))
		{
			if (temp >= 20)
			{
				System.out.println("Activity: Sailing");
			}
			else if (temp < 20 && temp >= 15)
			{
				System.out.println("Activity: Tennis");
			}
			else if (temp < 15 && temp >= 10)
			{
				System.out.println("Activity: Angling");
			}
			else if (temp < 10 && temp >= 5)
			{
				System.out.println("Activity: Hiking");
			}
			else if (temp < 5 || temp > 30)
			{
				System.out.println("Visit our gift shop !");
			}
		}
		System.out.println("");
	}
}
