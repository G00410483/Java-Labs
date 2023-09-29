import java.util.Scanner;
public class Exercise15
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter currency amount: ");
		double amount = keyboard.nextDouble();

		System.out.print("Is this dollar or euros: ");
		char option = keyboard.next().charAt(0);

		if (option == 'D' || option == 'd')
		{
			double result1 = dollarToEuros(amount);
			System.out.println(result1);
		}
		else if (option == 'E' || option == 'e')
		{
			double result1 = eurosToDollars(amount);
			System.out.println(result1);
		}
	}
	public static double eurosToDollars(double amount)
	{
		double res1;
		res1 = amount / 1.12;
		return res1;
	}
	public static double dollarToEuros(double amount)
	{
		double res2;
		res2 = amount * 0.90;
		return res2;
	}
}