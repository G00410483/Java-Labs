public class Exercise6
{
	public static void main(String[] args)
	{
		checkNum(95);
		checkNum(1000);
		checkNum(4756);
	}
	public static void checkNum(double num)
	{
		if (num == 1000)
		{
			System.out.println("Numbers are same");
		}
	 	else if (num < 1000)
		{
			System.out.println("Is less then 1000");
		}
		else if (num > 1000)
		{
			System.out.println("Is grater than 1000");
		}

	}
}