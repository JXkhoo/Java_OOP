public class Subject {
	private String subjName;
	private String subjCode;
	private Section[]section;
	
	public Subject(String a, String b)
	{
		subjName=a;
		subjCode=b;
		section=new Section[3];
		if(subjName=="OOP")
		{
			section[0]=new Section("Dr.Radziah","01");
			section[1]=new Section("Dr.Radziah","04");
			section[2]=new Section("Assoc. Prof. Dr. Norazah","04");
		}
		else
		{
			section[0]=new Section("Dr.Dayang Norhayati","01");
		}
	}

	public void printInfo()
	{
		System.out.println("\nSUBJECT NAME:"+subjName);
		System.out.println("SUBJECT CODE:"+subjCode);
		if(subjName=="OOP")
		{
			for(int i=0;i<3;i++)
			{
				Section sec=(Section)section[i];
				System.out.println("SECTION CODE: "+ sec.getSection());
				System.out.println("LECTURER NAME: "+ sec.getName());
			}
		}
		else
		{
			for(int i=0;i<1;i++)
			{
				Section sec=(Section)section[i];
				System.out.println("SECTION CODE: "+ sec.getSection());
				System.out.println("LECTURER NAME: "+ sec.getName());
			}
		}
	}
}