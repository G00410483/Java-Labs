import java.util.Scanner;

public class JavaWhile7
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		String password = "Pass";


		while (!password.equalsIgnoreCase("mypass"))
		{
			System.out.print("Enter the password: ");
			password = keyboard.nextLine();
		}
		System.out.println("System access!");


	}
}