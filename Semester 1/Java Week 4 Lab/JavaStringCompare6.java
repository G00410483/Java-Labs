import java.util.Scanner;
public class JavaStringCompare6
{
	public static void main (String []args)
	{
		double salary;
		String rating;


		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter salary: ");
		salary = keyboard.nextDouble();
		keyboard.nextLine();
		System.out.print("Enter the performance rating (Excellent, Good, Poor): ");
		rating = keyboard.nextLine();


		if (rating.equalsIgnoreCase("Excellent"))
		{
			System.out.println("Current salary: " + salary);
			System.out.println("Amount of your raise: " + (salary*0.6));
			System.out.println("Your new salary: " + ((salary*0.6) + salary));

		}
		else if (rating.equalsIgnoreCase("Good"))
		{
			System.out.println("Current salary: " + salary);
			System.out.println("Amount of your raise: " + (salary*0.4));
			System.out.println("Your new salary: " + ((salary*0.4) + salary));

		}
		else if (rating.equalsIgnoreCase("Poor"))
		{
			System.out.println("Current salary: " + salary);
			System.out.println("Amount of your raise: " + (salary*0.1));
			System.out.println("Your new salary: " + ((salary*0.1) + salary));

		}

	}
}
