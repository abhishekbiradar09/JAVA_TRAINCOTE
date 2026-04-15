package Day2_Classes;


class Base{
	String name="Animal";
	void basemethod() {
		System.out.println("Base method");
	}
}

class Child extends Base{
	
	String name="cat";
	void childmethod() {
		System.out.println("Child method");
		System.out.println("name from child "+name);
		System.out.println("name from parent "+super.name);//access parent variables  
	}
}


public class TC_Inheritance {
	
	public static void main(String[] args) {
		
		Child obj=new Child();
		
		obj.childmethod();
	}

}
