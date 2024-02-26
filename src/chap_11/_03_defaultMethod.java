package chap_11;

public class _03_defaultMethod {

	public static void main(String[] args) {
		Moveable c1 = new Cheetah();
		Moveable e1 = new Elephant();
		
		c1.move();
		e1.move();
	}

}

interface Moveable {
	default void move() {
		System.out.println("fast");
	}
}

class Cheetah implements Moveable {
	public void move() {
		System.out.println("Moving very fast");
	}
}

class Elephant implements Moveable {
}
