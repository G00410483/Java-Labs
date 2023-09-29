import java.util.Scanner;
public class JavaIf9
{
	public static void main(String[] args)
	{
		double num1;

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter number 1:");
		num1 = keyboard.nextDouble();
		double num2 = num1 % 2;

		if (num2 == 0)
		{
		System.out.println("The number entered is even");
		}
		if (num2 == 1)
		{
		System.out.println("The number entered is odd");
		}

	}
}
