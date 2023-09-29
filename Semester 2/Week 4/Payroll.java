public class Payroll
{
	private String name;
	private int idNumber;
	private double payRate;
	private int hoursWorked;

	public void setPayroll(String name1, int idNumber1, double payRate1, int hoursWorked1)
	{
		name = name1;
		idNumber = idNumber1;
		payRate = payRate1;
		hoursWorked = hoursWorked1;
	}
	public String getName()
	{
		return name;
	}
	public int getidNumber()
	{
		return idNumber;
	}
	public double getpayRate()
	{
		return payRate;
	}
	public int gethoursWorked()
	{
		return hoursWorked;
	}
	public double grossPay()
	{
		return payRate * hoursWorked;
	}
}
