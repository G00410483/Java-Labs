import java.util.Scanner;
public class Exercise16
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter number 1: ");
		double num1 = keyboard.nextDouble();

		System.out.print("Enter number 2: ");
		double num2 = keyboard.nextDouble();

		System.out.print("Enter A S D M: ");
		char option = keyboard.next().charAt(0);

		double finalResult = calculate (num1, num2, option);
		System.out.println(finalResult);
	}
	public static double calculate(double num1, double num2, char option)
	{
		double result = 0;

		if (option == 'A')
		{
			result = num1 + num2;
		}
		else if (option == 'S')
		{
			result = num1 - num2;
		}
		else if (option == 'M')
		{
			result = num1 * num2;
		}
		else if (option == 'D')
		{
			result = num1 / num2;
		}
		return result;
	}
}