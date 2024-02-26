package test;

public class test6 {

	public static void main(String[] args) {
		Vehicle obj = new Car("Spark");
	    System.out.println(obj.getName());
	    System.out.println(obj.getName("BumbleBee"));
	    
	}

}

abstract class Vehicle {
	 
    String name;
    abstract public String getName(String val);
 
    public String getName() {
            return "Vehicle name: " + name;
    }
}
 
 
 
class Car extends Vehicle {
 
    public Car(String name) {
            this.name=name;
    }
 
    public String getName(String val) {
            return "Car name:" + val;
    }
 
}
