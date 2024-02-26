package chap_11.management;


abstract public class Dinasaur implements eatable {
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
