package chap_11.management;

abstract public class Employer implements doable {
	String name;
	int workTimeOn;
	int workTimeOut;
	
	Employer(String name, int workTimeOn, int workTimeOut) {
		this.name = name;
		this.workTimeOn = workTimeOn;
		this.workTimeOut = workTimeOut;
	}
	
	abstract String employerType();
}

interface doable{
	void dodo();
}

class Cleaner extends Employer implements doable{
	Cleaner(String name, int workTimeOn, int workTimeOut) {
		super(name, workTimeOn, workTimeOut);
	}
	
	String employerType() {
		return "청소부";
	}
	
	public void dodo() {
		System.out.println("청소를 합니다.");
	}
}

class Zookeeper extends Employer implements doable {
	Zookeeper(String name, int workTimeOn, int workTimeOut) {
		super(name, workTimeOn, workTimeOut);
	}
	
	String employerType() {
		return "사육사";
	}
	
	public void dodo() {
		System.out.println("사육을 합니다.");
	}
	
}

class Janitor extends Employer implements doable {
	Janitor(String name, int workTimeOn, int workTimeOut) {
		super(name, workTimeOn, workTimeOut);
	}
	
	String employerType() {
		return "수위";
	}
	
	public void dodo() {
		System.out.println("경비를 봅니다.");
	}
}
