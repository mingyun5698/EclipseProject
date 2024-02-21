package chap_09;

public class _02_polymorphism {

	public static void main(String[] args) {
		Fruit fruit = new Fruit();
		Apple apple = new Apple();
		Orange orange = new Orange();
		Melon melon = new Melon();
		
		fruit.color();
		apple.color();
		orange.color();
		melon.color();
		
		color2(new Fruit());
		color2(new Apple());
		color2(new Orange());
		color2(new Melon());;;
		color2(new Orange());
		
		
		
		
	
	}
	static void color2(Fruit x) {
		x.color();
	}
	

}

class Fruit {
	void color() {
		System.out.println("과일의 색깔");
	}
	
	
}

class Apple extends Fruit {
	void color() {
		System.out.println("빨간색");
	}
}

class Orange extends Fruit {
	void color() {
		System.out.println("주황색"); 
	}
}

class Melon extends Fruit {
	void color() {
		System.out.println("초록색");
		
		
	}
}



class Vehicle1 {
	double cost = 100.0;
	static int age = 1;
	
	public void move() {
		System.out.println("Vehicle::move()");
		
	}
	
	public static void sm() {
		System.out.println("Vehicle::sm()");
	}
	
	
}

class Car1 extends Vehicle1 {
	double cost = 200.0;
	static int age = 2;
	
	public void move() {
		System.out.println("Car::move()");
	}
	
	public static void sm() {
		System.out.println("Car::sm()");
	}
	
}

class test{
	public static void main(String[] args) {
		Vehicle1 v = new Car1();
		System.out.println(v.cost);
		System.out.println(v.age);
		v.move();
		v.sm();
	}
}





	
