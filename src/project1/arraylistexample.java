package project1;

import java.util.ArrayList;

public class arraylistexample {
public static void main(String[] args) {
		
		ArrayList<String> list= new ArrayList<String>();
		
		list.add("naveen");
		list.add("yeswanth");
		list.add("pavan");
		list.add("kumar");
		list.add("chetan");
		
		System.out.println(list);
		
		list.remove(3);
		System.out.println(list);
		
		System.out.println(list.contains("niyati"));
		
		System.out.println("element from index 3: "+list.get(3));
		
		System.out.println("size of list: "+list.size());
		
		
		list.add(0,"test");
		
		System.out.println(list);
		
		
		System.out.println("size of list: "+list.size());
		
		
		
		for(String s:list) {
			System.out.println(s);
		}
		
		
		
		
		
}

}