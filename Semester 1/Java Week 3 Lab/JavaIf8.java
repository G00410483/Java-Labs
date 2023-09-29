import java.util.Scanner;
public class JavaIf8
{
	public static void main(String[] args)
	{
		double num1;
		double num2;

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter number 1:");
		num1 = keyboard.nextDouble();
		System.out.print("Enter numer 2:");
		num2 = keyboard.nextDouble();

		if (num1 > num2)
		{
		System.out.println("Number 1, " + num1 + " is greater than number 2, " + num2);
		}
		if (num2 > num1)
		{
		System.out.println("Number 2, " + num2 + " is greater than number 1, " + num1);
		}
		if (num1 == num2)
		{
		System.out.println("The numbers are same");
		}

	}
}
