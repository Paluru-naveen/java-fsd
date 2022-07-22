package project1;

public class Strings {
public static void main(String[] args) {
System.out.println("Methods of Strings");
		
		String sl=new String("welcome to india");
		System.out.println(sl.length());

		//substring
		String sub=new String("Welcome");
		System.out.println(sub.substring(2));

		//String Comparison
		String s2="king";
		String s3="lion";
		System.out.println(s2.compareTo(s3));

		//IsEmpty
		String s4="";
		System.out.println(s4.isEmpty());

		//toLowerCase
		String s5="Naveen";
		System.out.println(s5.toLowerCase());
		
		//replace
		String s6="naveen";
		String replace=s6.replace('v', 'e');
		System.out.println(replace);

		//equals
		String x="Welcome to INDIA";
		String y="WeLcOmE tO london";
		System.out.println(x.equals(y));
 
		System.out.println("\n");
		
		
		System.out.println("Creating String  Buffer");
		//Creating StringBuffer and append method
		StringBuffer a=new StringBuffer("Welcome to india!");
		a.append("Enjoy your self");
		System.out.println(a);

		//insert method
		a.insert(0, 't');
		System.out.println(a);

		//replace method
		StringBuffer sc=new StringBuffer("Hello");
		sc.replace(0, 2, "del");
		System.out.println(sc);

		//delete method
		sc.delete(0, 1);
		System.out.println(sc);
}
}
		


		
		
		
		