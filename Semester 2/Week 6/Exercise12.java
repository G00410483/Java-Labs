import java.util.Scanner;

public class Exercise12
{
	public static void main (String[] args)
	{
		Scanner s1 = new Scanner(System.in);

		String[] company = {"Microsoft", "Apple", "Oracle", "Amazon"};
		String[] name = {"Bill Gates", "Steve Jobs", "Larry Ellison", "Jeff Bezos"};
		int[] employees = { 166475, 147000, 135000, 1298000 };
		int[] yearFounded = { 1975, 1976, 1977, 1998 };

		int option = 0;

		do
		{
			System.out.println("VIEW COMPANY INFORMATION");
			System.out.println("CHOOSE FROM ONE OF THE OPTIONS BELOW");

			for (int i = 0; i < company.length; i++)
			{
				System.out.println("Index " + i + ": " + company[i]);
			}
			System.out.println("Enter option: ");
			option = s1.nextInt();

			System.out.println("COMPANY: " + company[option]);
			System.out.println("FOUNDER: " + name[option]);
			System.out.println("NUMBER OF EMPLOYEES: " + employees[option]);
			System.out.println("YEAR FOUNDED: " + yearFounded[option]);
			System.out.println("YEARS ACTIVE: " + (2022 - yearFounded[option]));
			System.out.println("==========================================");
			System.out.println("==========================================");
		} while (option != -1);
	if (option == -1)
	{
		System.exit(0);
	}
	}
}