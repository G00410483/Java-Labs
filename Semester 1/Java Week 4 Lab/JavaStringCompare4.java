import java.util.Scanner;
public class JavaStringCompare4
{
	public static void main (String []args)
	{
		int num1;
		int num2;
		int num3;

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		num1 = keyboard.nextInt();
		System.out.print("Enter 2nd number: ");
		num2 = keyboard.nextInt();
		System.out.print("Enter 3rd number: ");
		num3 = keyboard.nextInt();



		if(num1 < num2 && num2 < num3)
		{
			System.out.println("Numbers are increasing in size !");
		}
		else if (num1 > num2 && num2 > num3)
		{
			System.out.println("Numbers are decreasding in size !");
		}
		else
		{
			System.out.println("Numbers are neither increasing or decreasing !");
		}

	}
}
