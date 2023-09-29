import java.util.Scanner;
public class PayrollSystem
{
	public static void main(String[] args)
	{

		String username;
		String password;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter username: ");
		username = keyboard.nextLine();
		System.out.print("Enter password: ");
		password = keyboard.nextLine();

		if (username.equalsIgnoreCase("Admin") && password.equals("123"))
		{
			System.out.println("A C C E S S   G R A N T E D   !");
		}
		else
		{
			System.out.println("You are not authorised to access the system !");
		}

		String name;
		double pay1 = 25000;
		double pay2 = 32000;
		double pay3 = 44000;

		System.out.print("Enter employee name: ");
		name = keyboard.nextLine();

		if (name.equals("Hillary"))
		{
			System.out.println(name + "'s current salary @ " + pay1);
		}
		else if (name.equals("Donald"))
		{
			System.out.println(name + "'s current salary @ " + pay2);
		}
		else if (name.equals("Joe"))
		{
			System.out.println(name + "'s current salary @ " + pay3);
		}

		double raise;

		System.out.print("Give a raise of: ");
		raise = keyboard.nextDouble();

		if (name.equals("Hillary"))
		{
			System.out.println(name + "'s current salary is " + (pay1+raise));
		}
		if (name.equals("Donald"))
		{
			System.out.println(name + "'s current salary is " + (pay2+raise));
		}
		if (name.equals("Joe"))
		{
			System.out.println(name + "'s current salary is " + (pay3+raise));
		}
	}
}