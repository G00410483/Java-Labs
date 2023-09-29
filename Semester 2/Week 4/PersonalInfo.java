public class PersonalInfo
{
	private String name;
	private int age;
	private String adress;
	private String number;

	public void setPerson(String name1, int age1, String adress1, String number1)
	{
		name = name1;
		age = age1;
		adress = adress1;
		number = number1;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String getAdress()
	{
		return adress;
	}
	public String getNumber()
	{
		return number;
	}
}
