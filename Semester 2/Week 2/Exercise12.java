import java.util.Scanner;
public class Exercise12
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter number 1: ");
		double num1 = keyboard.nextDouble();
		System.out.print("Enter number 2: ");
		double num2 = keyboard.nextDouble();
		System.out.print("Enter number 3: ");
		double num3 = keyboard.nextDouble();

		average (num1, num2, num3);
	}
	public static void average(double num1, double num2, double num3)
	{
		double sum = num1 + num2 + num3;
		System.out.println("Sum of al three numbers is : " + sum);
		System.out.println("Average is: " + (sum / 3));
	}
}