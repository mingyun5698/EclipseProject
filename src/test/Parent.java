package test;

public class Parent {
	int x = 1111;

    Parent() {
        this(5);
    }

    Parent(int x) {
        this.x = x;
    }

    int getX() {
        return x;
    }
}

class Child extends Parent {
    int x;

    Child() {
        this(50);
    }

    Child(int x) {
        super.x = x;
    }
    
//    int getX() {
//        return x;
//    }
}
 

class main {
	public static void main(String[] args) {
		Parent c0 = new Child();
		System.out.println(c0.getX());
		System.out.println(c0.x);
		
		Parent c1 = new Child(51);
		System.out.println(c1.getX());
		System.out.println(c1.x);
		
		Child c2 = new Child();
		System.out.println(c2.getX());
		System.out.println(c2.x);
		
		Child c3 = new Child(123);
		System.out.println(c3.getX());
		System.out.println(c3.x);

	}
	
}
