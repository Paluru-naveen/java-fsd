package project1;


	class emp{
		int id;
		String name;

		emp(String n,int i)
		{
		name=n;
		id=i;
		}

		void display() {
		System.out.println(name+" "+id);
		}
	}

	public class parameterizedconstructor {
	public static void main(String[] args) {

		emp e1=new emp("naveen",25);
		emp e2=new emp("harsha",12);
		e1.display();
		e2.display();
			}
	}





