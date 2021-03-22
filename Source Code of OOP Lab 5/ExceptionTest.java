public class ExceptionTest{
	public static void main(String[]a){
		int number;
		String str;

		try
		{
			str="xyz";
			number=Integer.parseInt(str);
			System.out.println("A");
		}
		catch(NumberFormatException e){
			System.out.println("B");
		}
		catch(IllegalArgumentException e){
			System.out.println("C");
		}
		finally{
			System.out.println("D");
		}
		System.out.println("E");
	}
}