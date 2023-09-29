import java.util.Scanner;

public class RestaurantChoice
{
	public static void main(String[] args)
		{

			Scanner keyboard = new Scanner(System.in);

			String an1;
			String an2;
			String an3;

			System.out.print("Is anyone in your party vegeterian: ");
			an1 = keyboard.nextLine();
			System.out.print("Is anyone in your party vegan: ");
			an2 = keyboard.nextLine();
			System.out.print("Is anyone in your pary gluten free: ");
			an3 = keyboard.nextLine();

			if (an1.equalsIgnoreCase("yes") && an2.equalsIgnoreCase("yes") && an3.equalsIgnoreCase("yes"));
			{
				System.out.println("Your choices are:");
				System.out.println("");
			}

		}
}
