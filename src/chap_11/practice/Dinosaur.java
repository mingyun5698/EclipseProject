package chap_11.practice;
import java.util.ArrayList;
import java.util.List;

public class Dinosaur implements ableDinosaur, Comparable {
	String name;
	int age;
	
	
	Dinosaur(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	
	
	
	
	
	
	public void move() {
		System.out.println("움직인다");
	}
	
	
	public static void main(String[] args) {
		Dinosaur[] dino = new Dinosaur[3];
		
		dino[0] = new Dinosaur("디노1", 15);
		dino[1] = new Dinosaur("디노2", 7);
		dino[2] = new Dinosaur("디노3", 85);
		
		int[] age = new int[3];
		for (int i=0; i<age.length; i++) {
			age[i] = dino[i].age;
//			System.out.println(age[i]);
		}
		
		dino[0].compare(age);

		for (int i=0; i<3; i++) {
			System.out.println(age[i]);
		}
		
		ArrayList<Dinosaur> dinoo = new ArrayList<Dinosaur>();
		dinoo.add(dino[0]);
		dinoo.add(dino[1]);
		dinoo.add(dino[2]);
		
		
		
		

	}
}


interface ableDinosaur {
	void move();
}


interface Comparable {
	default void compare(int[] age) {
		int ar=0;
		for (int i =0; i<age.length-1; i++) {
			for (int j=0; j<age.length-(i+1); j++) {
				if (age[j] > age [j+1]) {
					ar = age[j];
					age[j] = age[j+1];
					age[j+1] = ar;
				}
				else continue;
			}
		}	
	}
}

