package project1;

import java.util.LinkedHashSet;

public class linkedhashsetexample {
public static void main(String[] args) {
		
		LinkedHashSet<String> set= new LinkedHashSet<String>();
		
		set.add("naveen");
		set.add("india");
		set.add("world");
		set.add("yeswanth");
		System.out.println(set);
		set.add("krutika");
		System.out.println(set);
		System.out.println("is empty: "+set.isEmpty());
		
		
		set.remove("krutika");
		System.out.println(set);
		System.out.println("Size: "+ set.size());
		
		set.add(null);
		System.out.println(set);
		
	}


}
