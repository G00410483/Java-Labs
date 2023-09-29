import java.util.Scanner;

public class Exercise3
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int num1, num2, num3, num4;

		System.out.print("Enter an integer: ");
		num1 = keyboard.nextInt();

		System.out.print("Enter an integer: ");
		num2 = keyboard.nextInt();

		System.out.print("Enter an integer: ");
		num3 = keyboard.nextInt();

		System.out.print("Enter an integer: ");
		num4 = keyboard.nextInt();

		average(num1, num2, num3, num4);
	}
	public static void average(int num1, int num2, int num3, int num4)
	{
		System.out.println("The average of all the numbers entered is: " + (num1+num2+num3+num4)/4);
	}
}