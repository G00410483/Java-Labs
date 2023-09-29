import java.util.Scanner;
public class JavaLogicalOperators3
{
	public static void main (String []args)
	{
		int year;

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Year: ");
		year = keyboard.nextInt();

		System.out.println("Checking if year " + year + " is outside the range for 20th century");

		if(year < 1901 || year > 2000)
		{

			System.out.println("This year was not in 20th century");
		}

		else
		{
			System.out.println("This year was in 20th century.");
		}

	}
}
