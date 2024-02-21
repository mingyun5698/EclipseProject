package chap_09;

public class _09_sealed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle123 v1 = new Vehicle123();
		Car123 c1 = new Car123();
		Saloon123 s1 = new Saloon123();
		Volvo123 vv1 = new Volvo123();
		Ford123 f1 = new Ford123();
		
		System.out.println(v1.toString());
		System.out.println(c1.toString());
		System.out.println(s1.toString());
		System.out.println(vv1.toString());
		System.out.println(f1.toString());
		
	}

}

sealed class Vehicle123 permits Car123{
	public String toString() {
		return "Vehicle::toString()";
	}
}

//class Truck extends Vehicle {
//	
//}

sealed class Car123 extends Vehicle123 permits Saloon123{
	
}

//class Convertible extends Car{
//
//}

non-sealed class Saloon123 extends Car123 {
	
}



class Volvo123 extends Saloon123 {
	
}

class Ford123 extends Saloon123 {
	
}





