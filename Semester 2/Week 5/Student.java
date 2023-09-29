public class Student
{
	private String name;
	private String surname;
	private int age;

	public Student(String name)
	{
		this.name = name;
	}
	public Student(String name, String surname)
	{
		this.name = name;
		this.surname = surname;
	}
	public Student()
	{
		this.name = "No name provided";
		this.surname = "No name provided";
	}
	public String getName()
	{
		return name;
	}
	public String getSurname()
	{
		return surname;
	}
	public int getAge()
	{
		return age;
	}

}