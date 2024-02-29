package chap_11.management;

import chap_12.Exception.*;

public class Dinasaur implements eatable {
	
	String name;
	int age;
	String species;
	int happyPoint;
	int healthyPoint;
	int safetyPoint;
	
	String dinoType() {
		return "어쩌구";
		}
	
	Dinasaur(String name, int age, String species) {
		this.name = name;
		this.age = age;
		this.species = species;
	}
	
	public void eat(Dinasaur dino) {
		System.out.println("풀을 먹습니다.");
	}
	
	void setHappyPoint(int happyPoint) throws DinosaurHappyException1, DinosaurHappyException2, DinosaurHappyException3 {
		if (happyPoint < 0) throw new DinosaurHappyException1();
		else if (happyPoint < 30) throw new DinosaurHappyException2();
		else if (happyPoint > 100) throw new DinosaurHappyException1();
		else if (happyPoint >= 30 && happyPoint <=100) throw new DinosaurHappyException3();
		this.happyPoint = happyPoint;
	}
	
	int getHappyPoint() {
		return this.happyPoint;
	}
	
	void setHealthyPoint(int healthyPoint)  throws DinosaurIllException1, DinosaurIllException2, DinosaurIllException3 {
		if (healthyPoint < 0) throw new DinosaurIllException1();
		else if (healthyPoint < 3) throw new DinosaurIllException2();
		else if (healthyPoint > 10) throw new DinosaurIllException1();
		else if (healthyPoint >= 3 && healthyPoint <=10) throw new DinosaurIllException3();
		this.healthyPoint = healthyPoint;
	}
	
	int getHealthyPoint() {
		return this.healthyPoint;
	}
	
	void setSafetyPoint(int safetyPoint) throws DinosaurSafetyException1, DinosaurSafetyException2, DinosaurSafetyException3 {
		if (safetyPoint < 0) throw new DinosaurSafetyException1();
		else if (safetyPoint < 5) throw new DinosaurSafetyException2();
		else if (safetyPoint > 10) throw new DinosaurSafetyException1();
		else if (safetyPoint >= 5 && safetyPoint <=10) throw new DinosaurSafetyException3();
		this.safetyPoint = safetyPoint;
	}
	
	int getSafetyPoint() {
		return this.safetyPoint;
	}
	
	

	
	


}

interface eatable {
	void eat(Dinasaur dino);
}

class herbivorousDino extends Dinasaur implements eatable  {
	public void eat(Dinasaur dino) {
		System.out.println("풀을 먹습니다.");
	}
	
	String dinoType() {
		return "초식공룡";
	}
	
	herbivorousDino(String name, int age, String species){
		super(name, age, species);
	}
	
	
}

class carnivorousDino extends Dinasaur implements eatable {
	public void eat(Dinasaur dino) {
		System.out.println("고기를 먹습니다.");
	}
	
	carnivorousDino(String name, int age, String species){
		super(name, age, species);
	}
	
	String dinoType() {
		return "육식공룡";
	}
}

class seaDino extends Dinasaur implements eatable {
	public void eat(Dinasaur dino) {
		System.out.println("물고기를 먹습니다.");
	}
	
	seaDino(String name, int age, String species){
		super(name, age, species);
	}
	
	String dinoType() {
		return "바다공룡";
	}
	
	
}
