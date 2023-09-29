import java.util.Scanner;
import java.util.Random;

public class Exercise20
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("WELCOME TO JAVA PHONE COMPANY\n------------------------------");

		int accNumber;
		char option;
		int minutes;
		char option2;

		do
		{
			System.out.print("Enter account number: ");
			accNumber = keyboard.nextInt();

			System.out.print("Enter service type (B, S, P): ");
			option = keyboard.next().charAt(0);

			System.out.print("Enter minutes used: ");
			minutes = keyboard.nextInt();

			if (option == 'b' || option == 'B')
			{
				double finalPrice = basic(minutes);
				System.out.println("\n\nMONTHLY BILL FOR ACCOUNT " + accNumber);
				System.out.println("BASIC PLAN");
				System.out.println("TOTAL COST: " + finalPrice);
			}
			if (option == 's' || option == 'S')
			{
				double finalPrice = standard(minutes);
				System.out.println("\n\nMONTHLY BILL FOR ACCOUNT " + accNumber);
				System.out.println("STANDARD PLAN");
				System.out.println("TOTAL COST: " + finalPrice);
			}
			if (option == 'p' || option == 'P')
			{
				double finalPrice = premium(minutes);
				System.out.println("\n\nMONTHLY BILL FOR ACCOUNT " + accNumber);
				System.out.println("PREMIUM PLAN");
				System.out.println("TOTAL COST: " + finalPrice);
			}
			System.out.print("\n\nCalculate another bill (Y/N): ");
		option2 = keyboard.next().charAt(0);

		}while (option2 == 'Y' || option2 == 'y');
	}
	public static double basic(int minutes)
	{
		double price = (minutes*0.21) + 7.99;
		return price;
	}
	public static double standard(int minutes)
	{
		if (minutes > 100)
		{
			double price = ((minutes-100)*0.05) + 10;
			return price;
		}
		else
		{
			double price = 10;
			return price;
		}
	}
	public static double premium(int minutes)
	{
		if (minutes > 200)
		{
			double price = ((minutes-200)*0.01) + 25;
			return price;
		}
		else
		{
			double price = 25;
			return price;
		}
	}

}