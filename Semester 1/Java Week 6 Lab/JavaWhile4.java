
import java.util.Scanner;

public class JavaWhile4
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int number1 = 0;
		int sum = 0;


		while (number1 >= 0)
		{
			System.out.print("Enter a number :");
			number1 = keyboard.nextInt();
			sum = sum + number1;

		}
		System.out.println("Sum of those numbers is:" + sum);
	}
}