import java.util.Scanner;
public class JavaConvertsCurrency
{
	public static void main(String[] args)
	{
	float dollars;
	float euros;
	char choice;

	Scanner keyboard = new Scanner(System.in);

	System.out.printf("Enter A for converting dollars to euros or B for converting euros to dollars : \n");
	choice = keyboard.next().charAt(0);

	if (choice == 'a' || choice == 'A')
	{
		System.out.printf("Enter dollars: \n");
		dollars = keyboard.nextFloat();
		System.out.printf("%,f dollars is %,.2f euros.", dollars, dollars*0.86143522);
	}
	else if (choice == 'b' || choice == 'B')
	{
		System.out.printf("Enter euros: \n");
		euros = keyboard.nextFloat();
		System.out.printf("%,f euros is %,.2f dollars.", euros, euros/0.86143522);
	}




	}
}