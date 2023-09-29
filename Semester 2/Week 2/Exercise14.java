import java.util.Scanner;
public class Exercise14
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		double res1 = timesTen(10);
		System.out.println(res1);

		int res2 = square(10);
		System.out.println(res2);

		System.out.print("Enter the first name: ");
		String name = keyboard.nextLine();
		System.out.println(name);
	}
	public static double timesTen(double num1)
	{
		double res1;
		res1 = num1 * 10;
		return res1;
	}
	public static int square(int num2)
	{
		int res2;
		res2 = num2 * num2;
		return res2;
	}
	public static String getName(String name)
	{
		return name;
	}
}