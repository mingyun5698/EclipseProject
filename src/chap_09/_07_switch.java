package chap_09;

public class _07_switch {
	
	
	

	
	
	
	public static void main(String[] args) {
		
		
		
		
		
	}

}

class V  {
	public String toString() {
		return "Vehicle::toString()";
}
}

class C extends V {
	void onRoad() {
		
	}
int numDoors = 2;
	
	int getNumDoors() {
		return this.numDoors;
	}

}

class B extends V {
	
}

class T extends V {
	
}

class Convertible2 extends C {
	int numDoors = 2;
	
	int getNumDoors() {
		return this.numDoors;
	}
}

class Saloon2 extends C {
int numDoors = 4;
	
	int getNumDoors() {
		return this.numDoors;
	}
}
