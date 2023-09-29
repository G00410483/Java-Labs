public class Temperature
{
	private double ftemp;

	public void setFarenheit(double ftemp1)
	{
		ftemp = ftemp1;
	}
	public double getFarenheit()
	{
		return ftemp;
	}
	public double getCelsius()
	{
		return 0.5555 * (ftemp - 32);
	}
	public double getKelvin()
	{
		return (0.5555 * (ftemp -32) + 273);
	}
}
