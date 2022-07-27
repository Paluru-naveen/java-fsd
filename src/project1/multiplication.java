package project1;

 class multiplication {
	 //polymorphism
	   public int multiplication (int x, int y) 
	    { 
	        return (x * y); 
	    } 
	    public int multiplication (int x, int y, int z) 
	    { 
	        return (x * y *z); 
	    } 
	    public  double multiplication(double x, double y) 
	    { 
	        return (x * y); 
	    } 
	    public static void main(String args[]) 
	    { 
	        multiplication s = new multiplication(); 
	        System.out.println(s.multiplication(10, 20)); 
	        System.out.println(s.multiplication(10, 20, 30)); 
	        System.out.println(s.multiplication(10.5, 20.5)); 
	    } 
	}



