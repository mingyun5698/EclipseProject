package chap_11.practice;

public interface eatable {
	void eat();
}

class Carnivore implements eatable{
	public void eat() {
		System.out.println("고기를 먹는다.");
	}
}

class Herbivore implements eatable {
	public void eat() {
		System.out.println("풀을 먹는다.");
	}
}
