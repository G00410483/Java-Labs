import java.util.Scanner;

public class Exercise2
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int num1, num2;

		System.out.print("Enter an integer: ");
		num1 = keyboard.nextInt();

		System.out.print("Enter an integer: ");
		num2 = keyboard.nextInt();

		higher(num1, num2);
	}
	public static void higher(int num1, int num2)
	{
		if (num1 > num2)
		{
			System.out.println(num1 + " is grater than " + num2);
		}
		else if (num1 < num2)
		{
			System.out.println(num2 + " is grater than " + num1);
		}
	}
}