import java.io.*;
import java.util.*;

public class TestDivide{
	public static void main(String[]a)throws IOException,ArithmeticException{
		Scanner in = new Scanner(System.in);

		try
		{
			int denom = in.nextInt();
			if(denom<=0)
			throw new ArithmeticException("Input positive denom");
			System.out.println("Value of 100/denom:"+100/denom);
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic Exception occurs!");
		}
		catch(NumberFormatException e){
			System.out.println("Wrong data type");
		}
	}
}