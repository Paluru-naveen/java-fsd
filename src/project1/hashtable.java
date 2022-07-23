package project1;

import java.util.*;

public class hashtable{
	public static void main(String args[])
	{
		Hashtable<String,Integer>empids= new Hashtable<String,Integer>();
		empids.put("naveen", 123);
		empids.put("harsha",456);
		empids.put("yeswanth", 99);
		System.out.println(empids);
		System.out.println(empids.get("harsha"));
		System.out.println(empids.containsKey("naveen"));
		System.out.println(empids.containsValue(123));
		empids.put("harsha", 444);
		System.out.println(empids);
		empids.replace("naveen", 7644575);
		System.out.println(empids);
	}

}


