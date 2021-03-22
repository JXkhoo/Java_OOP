public class Course {
	private String name;
	private String code;
	private int section;
	
	public Course(String n, String c, int s)
	{
		name = n;
		code = c;
		section = s;
	}

	public String getName()
	{
		return name;
	}
}