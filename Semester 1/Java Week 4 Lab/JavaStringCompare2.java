import java.util.Scanner;
public class JavaStringCompare2
{
	public static void main (String []args)
	{
		String username;
		String password;

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter username: ");
		username = keyboard.nextLine();
		System.out.print("Enter password: ");
		password = keyboard.nextLine();


		if(username.equalsIgnoreCase("bob") && password.equals("pass"))
		{
			System.out.println("_____________________________________________");
			System.out.println("S Y S T E M   A C C E S S   G R A N T E D");
			System.out.println("_____________________________________________");

		}
		else
		{
			System.out.println("_____________________________________________");
			System.out.println("Username or password incorrect.");
			System.out.println("ACCESS DENIED !");
			System.out.println("_____________________________________________");
		}


	}
}
