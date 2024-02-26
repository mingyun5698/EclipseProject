package chap_11.practice;

abstract public class Vehicle {
	abstract void travel();
}

class Jeep extends Vehicle {
	public void travel() {
		System.out.println("공룡 우리를 지나갑니다.");
	}
}

class Helcopter extends Vehicle {
	public void travel() {
		System.out.println("쥬라기 파크 공중을 지나갑니다.");
	}
}
