package chap_08.management;


class Dinasaur {
	String name;
	int age;
	String species;
	
	String[] names = new String[10];
	int[] ages = new int[10];
	String[] specieses = new String[10];
	
	public Dinasaur(String name, int age, String species) {
		this.name = name;
		this.age = age;
		this.species = species;
	}
	
	public Dinasaur() {
		this("이름없음", 0, "종 없음");
	}
	
	public void print(Dinasaur instance) {
		System.out.println("이름은 " + instance.name + "이고 나이는 " + instance.age + "살 이고 종은 " + instance.species + "입니다.");
	}
	
	
}
