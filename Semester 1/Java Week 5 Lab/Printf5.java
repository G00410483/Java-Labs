import java.util.Scanner;
public class Printf5
{
	public static void main(String[] args)
	{
		String name;
		double percentage;
		double wage = 20076.345;

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter employee name: ");
		name = keyboard.nextLine();
		System.out.printf("Wage is currently EUR %,.2f\n", wage);

		System.out.print("Enter percentage increase: ");
		percentage = keyboard.nextDouble();
		System.out.printf("Percentage wage increase is: %.3f\n", percentage);
		System.out.printf("Wage increase in value is: %,.2f\n", percentage*wage/100);
		System.out.printf("%S's percentage wage increase is: %,.2f\n", name, wage+(percentage*wage/100));




	}
}