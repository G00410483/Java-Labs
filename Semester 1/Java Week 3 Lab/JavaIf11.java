import java.util.Scanner;
public class JavaIf11
{
	public static void main(String[] args)
	{
		double num1;

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter day number: ");
		num1 = keyboard.nextDouble();

		if (num1 == 1)
		{
		System.out.println("Monday");
		}
		if (num1 == 2)
		{
		System.out.println("Tuesday");
		}
		if (num1 == 3)
		{
		System.out.println("Wednesday");
		}
		if (num1 == 4)
		{
		System.out.println("Thursday");
		}
		if (num1 == 5)
		{
		System.out.println("Friday");
		}
		if (num1 == 6)
		{
		System.out.println("Saturday");
		}
		if (num1 == 7)
		{
		System.out.println("Sunday");
		}
		if (num1 >= 8)
		{
		System.out.println("You entered wrong number");
		if (num1 <= 0)
		System.out.println("You entered wrong number");
		}

	}
}
