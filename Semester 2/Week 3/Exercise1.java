public class Exercise1
{
	public static void main(String[] args)
	{
		higher(2, 5);
	}
	public static void higher(int num1, int num2)
	{
		if (num1 > num2)
		{
			System.out.println(num1 + " is grater than " + num2);
		}
		else if (num1 < num2)
		{
			System.out.println(num2 + " is grater than " + num1);
		}
	}
}