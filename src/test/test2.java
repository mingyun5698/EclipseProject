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
	}
}


class A1 {
	void a1() {	
	}
	
	int a = 1;
	
	void greeting() {
		System.out.println("1");
	}
}

class A2 extends A1 {
	void a2() {		
	}
	
	int a = 2;
	
	void greeting() {
		System.out.println("2");
	}
}