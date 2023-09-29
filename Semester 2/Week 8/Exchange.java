public class Exchange
{
	public static double euroToDollar(double euro)
	{
		return 1.1914447 * euro;
	}
	public static double dollarToEuro(double dollar)
	{
		return dollar / 1.1914447;
	}
	public static double euroToSterling(double euro)
	{
		return 0.8660 * euro;
	}
	public static double sterlingToEuro(double sterling)
	{
		return sterling / 0.8660;
	}
	public static double dollarToSterling(double dollar)
	{
		return 0.7274 * dollar;
	}
	public static double sterlingToDollar(double sterling)
	{
		return sterling / 0.7274;
	}

}