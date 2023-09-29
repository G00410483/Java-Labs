import java.util.Scanner;
public class JavaStringCompare5
{
	public static void main (String []args)
	{
		double num1;


		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter input number: ");
		num1 = keyboard.nextDouble();


		if (num1 == 0)
		{
			System.out.println("Zero !");
		}
		else if (num1 > 0 && num1 < 1)
		{
			System.out.println("Small positive number !");
		}
		else if (num1 < 0 && num1 > -1)
		{
			System.out.println("Small negative number !");
		}
		else if (num1 > 1)
		{
			System.out.println("Positive number !");
		}
		else if (num1 < -1)
		{
			System.out.println("Negative number !");
		}
		else if (num1 > 1000000)
		{
			System.out.println("Large positive number !");
		}
		else if (num1 < -1000000)
		{
			System.out.println("Large negative number !");
		}
	}
}
