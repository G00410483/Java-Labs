public class Exercise12
{
	public static void main(String[] args)
	{
		average (12, 14, 15);
	}
	public static void average(double num1, double num2, double num3)
	{
		double sum = num1 + num2 + num3;
		System.out.println("Sum of al three numbers is : " + sum);
		System.out.println("Average is: " + (sum / 3));
	}
}