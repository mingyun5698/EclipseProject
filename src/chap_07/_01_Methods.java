package chap_07;

public class _01_Methods {
	public static void simpleExample() {
        System.out.println("Executing simpleExample() method…");
   }
	public static void main(String[] args) {
		System.out.println("main: before call to simpleExample()");
        simpleExample(); // method call
        System.out.println("main: after call to simpleExample()");

	}

}
