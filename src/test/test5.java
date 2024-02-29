package test;

public class test5 {

	public static void main(String[] args) {
        C1 b = new B1();
        b.paint();
        b.draw();
        
        
    }
}
 
class C1 {
	public void paint() {
        System.out.print("A");
        draw();
    }
    public void draw() {
        System.out.print("B");
        draw();
        
    }
    
   
}
 
class B1 extends C1 {
    public void paint() {
        super.draw();
    }
    public void draw() {
        System.out.print("D");
    }
    
}
