public class Exercise4
{
	public static void main (String[] args)
	{
		int[] myArray = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

		int sum;
		int sum1;
		int sum2;

		sum = myArray[0] + myArray[1] + myArray[2] + myArray[3] + myArray[4] + myArray[5] + myArray[6] + myArray[7] + myArray[8] + myArray[9];
		sum1 = myArray[0] + myArray[1] + myArray[2] + myArray[3] + myArray[4];
		sum2 = myArray[5] + myArray[6] + myArray[7] + myArray[8] + myArray[9];


		System.out.println("Total value is: " + sum);
		System.out.println("Sum first 5 numbers is: " + sum1);
		System.out.println("Sum last 5 numbers is: " + sum2);


	}
}