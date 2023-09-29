public class Exercise1
{
	public static void main(String[] args)
	{
		System.out.printf("%.2f %n", Exchange.euroToDollar(100));
		System.out.printf("%.2f %n", Exchange.dollarToEuro(100));
		System.out.printf("%.2f %n", Exchange.euroToSterling(100));
		System.out.printf("%.2f %n", Exchange.sterlingToEuro(100));
		System.out.printf("%.2f %n", Exchange.dollarToSterling(100));
		System.out.printf("%.2f %n", Exchange.sterlingToDollar(100));
	}
}