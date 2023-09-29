import java.util.Scanner;
public class JavaTheRace
{
	public static void main(String[] args)
	{

		double time1;
		double time2;
		double time3;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter runner 1 name: ");
		String name1 = keyboard.nextLine();
		System.out.print("Enter runner 1 time: ");
		time1 = keyboard.nextDouble();
		keyboard.nextLine();

		System.out.print("Enter runner 2 name: ");
		String name2 = keyboard.nextLine();

		System.out.print("Enter runner 2 time: ");
		time2 = keyboard.nextDouble();
		keyboard.nextLine();
		System.out.print("Enter runner 3 name: ");
		String name3 = keyboard.nextLine();

		System.out.print("Enter runner 3 time: ");
		time3 = keyboard.nextDouble();

		System.out.println("-------------------------");

		if (time1 < time2 && time1 < time3)
		{
			if (time2 > time3)
			{
				System.out.println(name1 + " was the winner.");
				System.out.println(name2 + " was second.");
				System.out.println(name3 + " was third.");
			}
			else if (time2 < time3)
			{
				System.out.println(name1 + " was the winner.");
				System.out.println(name3 + " was second." );
				System.out.println(name2 + " was third." );
			}
		}
		else if (time2 < time1 && time2 < time3)
		{
			if (time1 > time3)
			{
				System.out.println(name2 + " was the winner.");
				System.out.println(name3 + " was second.");
				System.out.println(name1 + " was third.");
			}
			else if (time1 < time3)
			{
				System.out.println(name2 + " was the winner.");
				System.out.println(name1 + " was second.");
				System.out.println(name3 + " was third.");
			}
		}
		else if (time3 < time2 && time3 < time1)
			{
				if (time2 > time1)
				{
					System.out.println(name3 + " was the winner.");
					System.out.println(name1 + " was second.");
					System.out.println(name2 + " was third.");
				}
				else if (time2 < time1)
				{
					System.out.println(name3 + " was the winner.");
					System.out.println(name2 + " was second.");
					System.out.println(name1 + " was third.");
				}
		}


	}
}