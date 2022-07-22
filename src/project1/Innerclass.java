package project1;


public class Innerclass {

	 private String msg="Welcome to Java"; 
	 
	 class Inner1{  
	  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
	 }
	 private String msg1="Inner Classes";

	 void display(){  
		 class Inner{  
			 void msg1(){
				 System.out.println(msg1);
			 }  
	  }  
	  
	  Inner l=new Inner();  
	  l.msg1();  
	 }


	public static void main(String[] args) {

	Innerclass obj=new Innerclass();
		Innerclass.Inner1 in=obj.new Inner1();  
		in.hello();  
	
		Innerclass  ob=new Innerclass();
		ob.display();



	}
}


