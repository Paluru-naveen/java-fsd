package project1;


	interface first
	{
		default void show()
		{
			System.out.println("default first");
		}
	}
	interface second
	{
		default void show()
		{
			System.out.println("default second");
		}
	}
	public class diamond implements first,second
	{
		public void show()
		{
			first.super.show();
		     second.super.show();
		
			
		}
		public static void main(String args[])
		{
			diamond ob=new diamond();
			ob.show();
		}
		
	}


