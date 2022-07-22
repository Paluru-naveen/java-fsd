package project1;


	class deptinfo{
		int id;
		String name;

	void display() {
		System.out.println(id+" "+name);
		}
	}

	public class defaultconstructor {

	public static void main(String[] args) {

		deptinfo d1=new deptinfo();
		deptinfo d2=new deptinfo();

		d1.display();
		d2.display();
		}
	}



