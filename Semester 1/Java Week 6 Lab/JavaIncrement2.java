import java.util.Scanner;

public class JavaIncrement2
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int test = 5;
		while (test > 0)
		{
			System.out.println("This is inside the while loop. Test value is " + test + ".");
			test--;
		}

	}
}