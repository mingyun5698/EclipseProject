package chap_11;

public interface _01_Interface {
	void move();
	int VALUE = 1;
	String HOW = "work";
}

class Dog implements _01_Interface{
	public void move() {
		System.out.println("dog::move");
	}
	
	public static void main(String[] args) {
		System.out.println(HOW == "work");
		Dog d1 = new Dog();
		d1.move();
	}
}



