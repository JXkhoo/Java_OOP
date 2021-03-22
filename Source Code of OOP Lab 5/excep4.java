import java.util.*;

class myexception extends Exception{
	myexception(String s)
	{
		super(s);
	}
}

public class excep4
{
	public static void main(String a[]){
		String st1;

		Scanner in = new Scanner(System.in);
		st1 = in.nextLine();
		try{

			if(st1.equals("Hello"))
			System.out.println("String is right");
			else
			throw new myexception("Invalid String");
		}
		catch(myexception ex){
			System.out.println(ex.getMessage());
		}
	}
}