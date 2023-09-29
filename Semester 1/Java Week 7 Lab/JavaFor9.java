import java.util.Scanner;
public class JavaFor9
{
	public static void main(String[] args)
		{
			Scanner keyboard = new Scanner(System.in);

			int num1;

			System.out.print("Enter a number to start :");
			num1 = keyboard.nextInt();

			for (int i=num1; i<=num1+25; i++)
			{
				System.out.println(i);
			}

		}
}
