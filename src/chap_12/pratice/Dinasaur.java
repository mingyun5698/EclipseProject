package chap_12.pratice;




public class Dinasaur {
	String species;
	int weight;
	int age;
	int healthPoint;
	
	Dinasaur(String species, int weight, int age) {
		this.species = species;
		this.weight = weight;
		this.age = age;
	}
	
	void setWeight(int weight) throws InvalidWeight {
		if(weight < 0) throw new InvalidWeight();
		this.weight = weight;
	}
	
	int getWeight() {
		return this.weight;
	}
	
	void setHealthPoint(int healthPoint) throws CriticalHealthException {
		if (healthPoint <30) throw new CriticalHealthException();
		this.healthPoint = healthPoint;
	}
	
	int getHealthPoint() {
		return healthPoint;
	}
	
	
}
