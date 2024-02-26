package chap_11;

public class _02_InterfaceInheritance {
	public static void main(String[] args) {
		Volleyball v1 = new Volleyball();
		v1.bounce();
		v1.doSpherical();
		
		MoveableObject m1 = new Volleyball();
		
	}
	
	
}

interface MoveableObject {
	
}

interface Spherical {
	void doSpherical();
}

interface Bouncable extends MoveableObject, Spherical {
	void bounce();
}

class Volleyball implements Bouncable {
	public void doSpherical() {
		System.out.println("ValleyBall::doSpherical");
	}
	public void bounce() {
		System.out.println("ValleyBall::bounce");
	}
}

abstract class Baceball implements Bouncable{
	
}


