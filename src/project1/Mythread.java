package project1;

public class Mythread extends Thread
{
	

public void run()
	{
		System.out.println(" thread started running..");
}
	public static void main( String args[] )
	{
		Mythread t = new  Mythread();
		t.start();
	}
}
