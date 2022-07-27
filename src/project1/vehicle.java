package project1;

public class vehicle {

	String name;
	int model;
	String color;
	public vehicle(String name,int model,String color)
{
	this.name=name;
	this.model=model;
	this.color=color;
}
	public String getname()
	{
		return name;
	}
	public int getmodel()
	{
		return model;
	}
	public String getcolor()
	{
		return color;
	} 
	@Override
    public String toString() 
    { 
        return("Hi my name is "+ this.getname()+    "model is"+this.getmodel()+     " color is"+ this.getcolor() + "."); 
    } 
    public static void main(String[] args) 
    { 
        vehicle bajaj= new vehicle("maruthi",2022, "black"); 
        System.out.println(bajaj.toString()); 
    } 
}
