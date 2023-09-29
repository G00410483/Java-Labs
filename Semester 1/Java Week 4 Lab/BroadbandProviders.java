import java.util.Scanner;
public class BroadbandProviders
{
	public static void main (String []args)
	{

		double cost1 = 9.95;
		double cost2 = 13.95;
		double cost3 = 30.0;
		String name;
		char pack;
		int hours;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter customer name: ");
		name = keyboard.nextLine();

		System.out.print("Enter broadband pacage (A, B, C): ");
		pack = keyboard.next().charAt(0);

		System.out.print("Enter hours used this month : ");
		hours = keyboard.nextInt();

		System.out.println("--------------------------");
		System.out.println("Monthly bill for " + name);
		System.out.println("--------------------------");

		double price1 = (hours - 20) * 2 + cost1;
		double price2 = (hours - 30) + cost2;

		if (hours <= 20 && pack == 'A')
		{
			System.out.println("Total hours used: " + hours);
			System.out.println("Total price is: " + cost1);
		}
		else if (hours > 20 && pack == 'A')
		{
			System.out.println("Total hours used: " + hours);
			System.out.println("Total price is: " + price1);
		}
		else if (hours <= 30 && pack == 'B')
		{
			System.out.println("Total hours used: " + hours);
			System.out.println("Total price is: " + cost2);
		}
		else if (hours > 30 && pack == 'B')
		{
			System.out.println("Total hours used: " + hours);
			System.out.println("Total price is: " + price2);
		}
		else if (pack == 'C')
		{
			System.out.println("Total hours used: " + hours);
			System.out.println("Total price is: " + cost3 + " , all- inclusive");
		}
	}
}
