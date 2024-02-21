package chap_08;
import java.util.*;


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

class Employee {
	String name;
	String jobTitle;
	int yearsOfExperience;
	
	String[] names = new String[10];
	String[] jobTitles = new String[10];
	int[] yearsOfExperiences = new int[10];
	
	public Employee(String name, String jobTitle, int yearsOfExperience) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.yearsOfExperience = yearsOfExperience;
		
		
	}
	
	public Employee() {
		this("이름 없음", "업무 없음", 0);
	}
	
	public void print(Employee instance) {
		System.out.println("이름은 " + instance.name + "이고 업무는 " + instance.jobTitle + "이고 경력은 " + instance.yearsOfExperience + "년 입니다.");
	}
}

class Park {
	int count1;
	int count2;
	Scanner sc = new Scanner(System.in);
	
	
	public void door() {
		System.out.print("open 또는 close를 입력해주세요. >>" );
		String command = sc.next();
		if(command.equals("open")) {
			System.out.println("공원이 열렸습니다.");
		} else if (command.equals("close")) {
			System.out.println("공원이 닫혔습니다.");
		} else System.out.println("open 또는 close를 입력해주세요.");	
	}
	
	public void dinoAdd(Dinasaur dino) {
		while(true) {
			if (count1>1
					) {
				System.out.println("공룡 10마리 모두 추가되었습니다.");
				break;
			}
		
		System.out.print("공룡의 이름을 입력하세요 >>");
		dino.names[count1] = sc.next();
		System.out.print("공룡의 나이를 입력하세요 >>");
		dino.ages[count1] = sc.nextInt();
		System.out.print("공룡의 종을 입력하세요 >>");
		dino.specieses[count1] = sc.next();
		
		System.out.println("이름은 " + dino.names[count1] + "이고 나이는 " + dino.ages[count1] + "이고 종은 " + dino.specieses[count1] + "입니다.");
		count1++;
		System.out.println("추가된 공룡 수 : " + count1);
		}
	}
	
	public void employeeAdd(Employee emp) {
		while(true) {
			if (count2>1) {
				System.out.println("직원 10명이 모두 추가되었습니다.");
				break;
			}
		
		System.out.print("직원의 이름을 입력하세요 >>");
		emp.names[count2] = sc.next();
		System.out.print("직원의 업무를 입력하세요 >>");
		emp.jobTitles[count2] = sc.next();
		System.out.print("직원의 경력을 입력하세요 >>");
		emp.yearsOfExperiences[count2] = sc.nextInt();
		
		System.out.println("이름은 " + emp.names[count2] + "이고 업무는 " + emp.jobTitles[count2] + "이고 경력은 " + emp.yearsOfExperiences[count2] + "년 입니다.");
		count2++;
		System.out.println("추가된 직원 수 : " + count2);
		}
	}
	
	
}

class Food {
	String name;
	String nutritionalValue;
	int cost;
	
	void Food(String name, String nutritionalValue, int cost) {
		this.name = name;
		this.nutritionalValue = nutritionalValue;
		this.cost = cost;
	}
}

//class Enclosure {
//	public static void main(String[] args) {
//		Dinasaur[] dinoes = new Dinasaur[10];
//		dinoes[0] = new Dinasaur("디노1", 25, "티라노사우르스");
//	}
//}

enum herbivore {
	dino1;
}

class Ticket {
	int price;
	String visitorName;
	int visitDate;
}


class Main {
	public static void main(String[] args) {
		Dinasaur dino1 = new Dinasaur("디노1", 17, "티라노사우르스");
		dino1.print(dino1);
		
		System.out.println("-----------------------------------------------");
		Employee emp1 = new Employee("김민균", "먹이담당", 3);
		emp1.print(emp1);
		
		System.out.println("-----------------------------------------------");
				
		Park park1 = new Park();
		
		
		park1.door();
		
		System.out.println("-----------------------------------------------");
		
		Dinasaur dino2 = new Dinasaur();
		park1.dinoAdd(dino2);
		
		System.out.println("-----------------------------------------------");
		
		Employee emp2 = new Employee();
		park1.employeeAdd(emp2);

		
		System.out.println("-----------------------------------------------");
		
//		Enclosure herbivore = Enclosure.herbivore;
//		Enclosure carnivore = Enclosure.carnivore;
//		Enclosure omnivore = Enclosure.omnivore;
//		
//		switch(herbivore) {
//		case herbivore : System.out.println("dino1, dino4");
//			break;
//		case carnivore : System.out.println("dino2, dino5");
//			break;
//		case omnivore : System.out.println("dino3");
//			break;
//		}	
		
		
		herbivore dino11 = herbivore.dino1;
		System.out.println(dino11);
	
		
		
		
	}
}
