import java.util.Scanner;
public class JavaIf10
{
	public static void main(String[] args)

	{
	int price = 99;
	int quantity;

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter quaintity being purchesed: ");
		quantity = keyboard.nextInt();
		System.out.println("TOTAL COST IS:" + quantity*price);

		if (quantity >= 10)
		{
			System.out.println("You recived discount of:" + (price*quantity*0.1));
		}
		if (quantity < 10)
			System.out.println("There is no discount on this order");
	}
}