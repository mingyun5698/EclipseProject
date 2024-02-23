package test;

public class test2 {
	public static void main(String[] args) {
		A1 a1 = new A1();
		A1 a2 = new A2();
		A2 a3 = new A2();
		
		System.out.println(a1.a);
		System.out.println(a2.a);
		System.out.println(a3.a);		
		
		System.out.println("------------------------------");
		
		a1.greeting();
		a2.greeting();
		a3.greeting();
		
		System.out.println("------------------------------");
		
		
		System.out.println(a1.getA());
		System.out.println(a2.getA());
		System.out.println(a3.getA());
		
	}
}


class A1 {
	void a1() {	
	}
	
	int a = 1;
	
	void greeting() {
		System.out.println("1");
	}
	
	int getA() {
		return a;
	}
	
	A1 (int a) {
		this.a = a;
	}
	
	A1 () {
		this(500);
	}
}

class A2 extends A1 {
	void a2() {		
	}
	
	int a = 2;
	
	void greeting() {
		System.out.println("2");
	}
	
	A2 (int a) {
		this.a = a;
	}
	
	A2 () {
		super(200);
	}
}