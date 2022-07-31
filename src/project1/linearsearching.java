package project1;

import java.util.Scanner;

public class linearsearching {
	public static void main(String args[])
	{
		
	Scanner sc=new Scanner(System.in);
		int arr[]= {22,43,54,66,78,99};
		System.out.println("enter the value to be searched");
		int key=sc.nextInt();
		boolean found=false;
		for(  int val   :  arr)
		{
			if(val==key)
			{
				found=true;
			break;
			
		}
		}
	
	if(found==true)
	{
		System.out.println("key value is present");
	}
	else
	{
		System.out.println("key value is not present");
	}
}
}
