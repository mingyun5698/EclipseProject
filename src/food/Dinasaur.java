package food;



abstract public class Dinasaur {
	String name;
	int age;
	String species;
	
	abstract String dinoType();
	
	Dinasaur(String name, int age, String species) {
		this.name = name;
		this.age = age;
		this.species = species;
	}
}

class herbivorousDino extends Dinasaur {
	
	String dinoType() {
		return "초식공룡";
	} 
	
	herbivorousDino(String name, int age, String species){
		super(name, age, species);
	}
}

class CarnivorousDino extends Dinasaur {
	
	String dinoType() {
		return "육식공룡";
	} 
	
	CarnivorousDino(String name, int age, String species){
		super(name, age, species);
	}
}
