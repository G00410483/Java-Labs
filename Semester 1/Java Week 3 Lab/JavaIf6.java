import java.util.Scanner;
public class JavaIf6
{
	public static void main(String[] args)
	{
		double num1;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter number:");
		num1 = keyboard.nextDouble();
		if (num1 >= 100)
		{
		System.out.println("Number you entered is 100 or grater");
		}
		if (num1 <= 100)
		{
		System.out.println("Number you entered is 100 or less");
		}
	}
}
