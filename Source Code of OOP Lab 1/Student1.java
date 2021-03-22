public class Student1 {
	private String name;
	private String matrix;
	private String major;
	private Course1[] courseList;
	private int numOfCourse;
	
	public Student1(String n, String m, String j)
	{
		name = n;
		matrix = m;
		major = j;
		courseList = new Course1[10];
	}
	
	public String getName()
	{ return name; }

	public String getMatrix()
	{ return matrix; }

	public String getMajor()
	{ return major; }

	public void register(Course1 cs)
	{
		courseList[numOfCourse]=cs;
		numOfCourse++;
	}

	public int getNumOfCourse()
	{
		return numOfCourse;
	}

	public void printAllInfo()
	{
		System.out.println("\nSTUDENT NAME:"+name);
		System.out.print("NUMBER OF SUBJECT(s) TAKEN:");
		System.out.println(numOfCourse);
		System.out.println("LIST OF SUBJECT(s) TAKEN:");
		for(int i=0;i<numOfCourse;i++)
		{
			Course1 s=(Course1)courseList[i];
			System.out.println((i+1) +"." +s.getName());
		}
	}
}