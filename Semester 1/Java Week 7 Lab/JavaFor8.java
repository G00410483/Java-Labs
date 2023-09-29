import java.util.Scanner;
public class JavaFor8
{
	public static void main(String[] args)
		{
			Scanner keyboard = new Scanner(System.in);

			int num1;
			int num2;

			System.out.print("Enter a number to start :");
			num1 = keyboard.nextInt();
			System.out.print("Enter a number to finish :");
			num2 = keyboard.nextInt();

			for (int i=num1; i<=num2; i++)
			{
				System.out.println(i);
			}

		}
}
