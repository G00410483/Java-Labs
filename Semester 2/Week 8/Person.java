public class Person
{
	private String firstName;
	private String lastName;
	private static int count;

	public Person(String f, String l)
	{
		f = firstName;
		l = lastName;
		count++;
	}
	public int getCount()
	{
		return count;
	}
	public static int count()
	{
		return count;
	}
}