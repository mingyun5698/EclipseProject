package test;

public class test5 {

	public static void main(String[] args) {
        C1 b = new B1();
//        b.paint();
//        b.draw();
        
        b.s();
    }
}
 
class C1 {
	public void paint() {
        System.out.print("A");
        
    }
    public void draw() {
        System.out.print("B");
        a();
    }
    
    public void a() {
    	System.out.println("1");
    }
    
    public void s() {
    	s();
    }
}
 
class B1 extends C1 {
    public void paint() {
        super.draw();
    }
    public void draw() {
        System.out.print("D");
    }
    public void a() {
    	System.out.println("2");
    }
    
    public void s() {
    	System.out.println("1");
    }
    
}
