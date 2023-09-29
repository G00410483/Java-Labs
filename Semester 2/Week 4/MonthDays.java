public class MonthDays
{
	private int month;
	private int year;

	public void setMonth(int month1)
	{
		month = month1;
	}
	public void setYear(int year1)
	{
		year = year1;
	}
	public int getNumberOfDays()
	{
		int numberOfDays;

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
		{
			numberOfDays = 31;
			return numberOfDays;
		}
		else if (month == 2 && year%4 == 0)
		{
			numberOfDays = 28;
			return numberOfDays;
		}
		else if (month == 2 && year%4 != 0)
		{
			numberOfDays = 29;
			return numberOfDays;
		}
		else
		{
			numberOfDays = 30;
			return numberOfDays;
		}

	}
}
