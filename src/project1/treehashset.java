package project1;

import java.util.TreeSet;

public class treehashset {
public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("naveen");
		set.add("pv");
		set.add("naresh");
		set.add("kruti");
	
		
		System.out.println(set);
		
		
		set.add("kruti");
		
		System.out.println(set);
		
		
		System.out.println("Is Empty: "+set.isEmpty());
		
		set.remove("kruti");
		
		System.out.println("size :"+set.size());
	}

}
