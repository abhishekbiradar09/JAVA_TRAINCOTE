package Day3_Classes;

class Parent{
	void show() {
		System.out.println("Parent method");
	}
}

class Child1 extends Parent{
	
	void show() {
		System.out.println("Child method");
		
	}
}
public class TC_Override {
public static void main(String[] args) {
	
	Parent p=new Child1();
	Child1 d =(Child1)p;//downcasted// upcasting cannot acess child obj
    d.show();
	p.show();
}
}
