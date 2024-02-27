package chap_11.practice;
import java.util.ArrayList;
import java.util.List;

public class Dinosaur implements ableDinosaur,  Comparable<Dinosaur> {
	String name;
	int age;
	
	
	Dinosaur(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	public int compareTo(Dinosaur obj) {
		if(this.age == obj.age) {
			return 0;
		}
		else if (this.age < obj.age) {
			return -1;
		}
		else 
			return 1;
	}
	
	
	static void compare(int[] age) {
		int left=0;
		for (int i =0; i<age.length-1; i++) {
			for (int j=0; j<age.length-(i+1); j++) {
				if (age[j] > age [j+1]) {
					left = age[j];
					age[j] = age[j+1];
					age[j+1] = left;
				}
				else continue;
			}
		}	
	}
	
//	static void compare(Dinosaur dino) {
//		int left=0;
//		for (int i =0; i<dino.length-1; i++) {
//			for (int j=0; j<dino.length-(i+1); j++) {
//				if (dino[j] > dino[j+1]) {
//					left = dino[j];
//					dino[j] = dino[j+1];
//					dino[j+1] = left;
//				}
//				else continue;
//			}
//		}	
//	}
	
	
	
	
	
	
	
	
	
	public void move() {
		System.out.println("움직인다");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		Dinosaur[] dino = new Dinosaur[6];
		
		dino[0] = new Dinosaur("디노0", 15);
		dino[1] = new Dinosaur("디노1", 7);
		dino[2] = new Dinosaur("디노2", 85);
		dino[3] = new Dinosaur("디노3", 26);
		dino[4] = new Dinosaur("디노4", 66);
		dino[5] = new Dinosaur("디노5", 12);
		
		


		
		
		ArrayList<Dinosaur> dinoo = new ArrayList<Dinosaur>();
		dinoo.add(dino[0]);
		dinoo.add(dino[1]);
		dinoo.add(dino[2]);
		
		
		
		
		
		Dinosaur asd = new Dinosaur("비교", 0);
		for (int i =0; i<dino.length-1; i++) {
			for (int j=0; j<dino.length-(i+1); j++) {
				if (dino[j].compareTo(dino[j+1]) == 1 ) {
					asd = dino[j];
					dino[j] = dino[j+1];
					dino[j+1] = asd;
				}
				else continue;
			}
		}
		
		for(int i=0; i<dino.length; i++) {
			System.out.println(dino[i].name + " " + dino[i].age);
		}
		
		
		
	    
		
		

	}
}


interface ableDinosaur {
	void move();
}


//interface Comparable1 {
//	default void compare(int[] age) {
//		int left=0;
//		for (int i =0; i<age.length-1; i++) {
//			for (int j=0; j<age.length-(i+1); j++) {
//				if (age[j] > age [j+1]) {
//					left = age[j];
//					age[j] = age[j+1];
//					age[j+1] = left;
//				}
//				else continue;
//			}
//		}	
//	}
//}

