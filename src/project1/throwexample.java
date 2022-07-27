package project1;

public class throwexample {
	public static void main(String args[])
	{
		
	
	int d=67,b=5,result;
	try
	{
		if(b==0)
		{
			System.out.println("cannot divide by zero");
		}
		else
		{
			result=d/b;
			System.out.println("result:"+result);
		}
	
	}
	
	catch(ArithmeticException Ex)        
	{
	System.out.print("\n\tError : " + Ex.getMessage());
	
		
	}
System.out.println("end of the program");
	}
}



