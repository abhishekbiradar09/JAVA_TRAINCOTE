package Day3_Classes;

public class Car {

	int noofcylinders;
	int noofvolves;
	int enginepower;
	boolean ispowertsteering;
	
	Car(){
		noofcylinders=3;
		noofvolves=4;
		enginepower=48;
		ispowertsteering=false;
	}
	
	Car(boolean ispowertsteering){
		this();
		this.ispowertsteering=false;
	}
	Car(int noofcylinders,int noofvolves,int enginepower ){
		this.noofcylinders=noofcylinders;
		this.noofvolves=noofvolves;
		this.enginepower=enginepower;
	}
	
	public static void main(String[] args) {
		Car car=new Car(2,5,50);
		System.out.println(car.ispowertsteering);
	}
	
	
}
