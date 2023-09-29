import java.util.Scanner;
public class Exercise13
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int myVar = calc(19, 2);
		System.out.println(myVar);
	}
	public static int calc(int num1, int num2)
	{
		int result;
		result = num1 + num2;
		return result;
	}
}