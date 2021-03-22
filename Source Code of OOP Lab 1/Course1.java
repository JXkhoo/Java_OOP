public class Course1 {
	private String name;
	private String code;
	private int section;
	private Student1[]stuList;
	private int numOfStudent;
	
	public Course1(String n, String c, int s)
	{
		name = n;
		code = c;
		section = s;
		stuList = new Student1[60];
	}

	public String getName()
	{
		return name;
	}

	public void addStudent(Student1 st)
	{
		stuList[numOfStudent]=st;
		numOfStudent++;
		st.register(this);
	}

	public void printAllInfo()
	{
		System.out.println("\nCOURSE NAME:"+name);
		System.out.println("NUMBER OF STUDENT(s):"+numOfStudent);
		System.out.println("LIST OF STUDENT(s):");
		for(int i=0;i<numOfStudent;i++)
		{
			Student1 st=(Student1)stuList[i];
			System.out.println((i+1) +"." +st.getName());
		}
	}

}