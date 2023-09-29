public class Exercise5
{
	public static void main(String[] args)
	{
		number(56);
	}
	public static void number(int number)
	{
		for (int i = 1; i <= 10; i++)
		{
			System.out.println(number + " times " + i + " is equal to " + (number*i));
		}
	}
}