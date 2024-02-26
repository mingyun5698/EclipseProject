package chap_11;

public class _05_super implements A {
	
	public static void main(String[] args) {
		new _05_super().foo();
	}

}

interface A {
	default void foo() {
		System.out.println("A::foo");
	}
}

interface B {
	default void foo() {
		System.out.println("B::foo");
	}
}

class C {
	void foo() {
		System.out.println("C::foo");
	}
}
	
	
