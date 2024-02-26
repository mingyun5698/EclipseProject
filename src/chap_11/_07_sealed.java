package chap_11;

public class _07_sealed {

	public static void main(String[] args) {
		
	}

}

sealed interface Driveable permits Vehicle {
	void drive();
}

sealed class Vehicle implements Driveable permits Car{
	public void drive() {
		System.out.println("drive::Vehicle");
	}
}

sealed class Car extends Vehicle permits Saloon {
	public void drive() {
		System.out.println("drive::Car");
	}
}

non-sealed class Saloon extends Car {
	public void drive() {
		System.out.println("drive::Saloon");
	}
}

class Volvo extends Saloon{
	public void drive() {
		System.out.println("drive::Volvo");
	}
}

class Ford extends Saloon{
	public void drive() {
		System.out.println("drive::Ford");
	}
}

//class Window extends Vehicle {
//	
//}
//
//class Chair extends Car{
//	
//}
//
//class Table implements Driveable{
//	
//}

