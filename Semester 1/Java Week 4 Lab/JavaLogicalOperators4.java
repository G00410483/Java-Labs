import java.util.Scanner;
public class JavaStringCompare1
{
	public static void main (String []args)
	{
		String firstName;
		String secondName;

		Scanner keyboard = new Scanner(System.in);
		System.out.print("First name: ");
		firstName = keyboard.nextLine();
		System.out.print("Second name: ");
		secondName = keyboard.nextLine();


		if(firstName == secondName)
		{

			System.out.println("The names " + firstName + " and " + secondName + " match");
		}

		else if (firstName != secondName)
		{
			System.out.println("The names " + firstName + " and " + secondName + " dont match");
		}

	}
}
