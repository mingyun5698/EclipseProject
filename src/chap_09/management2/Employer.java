package chap_09.management2;

abstract public class Employer {
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


class Cleaner extends Employer{
	Cleaner(String name, int workTimeOn, int workTimeOut) {
		super(name, workTimeOn, workTimeOut);
	}
	
	String employerType() {
		return "청소부";
	}
}

class Zookeeper extends Employer{
	Zookeeper(String name, int workTimeOn, int workTimeOut) {
		super(name, workTimeOn, workTimeOut);
	}
	
	String employerType() {
		return "사육사";
	}
	
}

class Janitor extends Employer{
	Janitor(String name, int workTimeOn, int workTimeOut) {
		super(name, workTimeOn, workTimeOut);
	}
	
	String employerType() {
		return "수위";
	}
}