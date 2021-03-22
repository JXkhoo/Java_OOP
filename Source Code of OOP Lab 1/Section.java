public class Section {
	private String lectureName;
	private String sectionNum;

	public Section(String a, String b)
	{
		lectureName=a;
		sectionNum=b;
	}

	public String getName()
	{
		return lectureName;
	}

	public String getSection()
	{
		return sectionNum;
	}
}