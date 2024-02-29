package test;

public class test10 {
	public static void main(String[] args) {
		foo(20);
	}
	
	static void foo(int n) {
		if(n==0) return;
		n-=5;
		foo(n);
		System.out.println(n + " ");
		}
		
		
	
}
