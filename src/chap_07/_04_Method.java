package chap_07;

public class _04_Method {
	public static void m1(int...args){ // varargs
	     int sum = 0;
	     for(int i:args) {
	        sum += i;
	     }
	     System.out.println(sum);}
	public static void main(String[] args) {
		   m1();                      // 0
		     m1(1);                     // 1
		     m1(1, 2);                 // 3
		     m1(1, 2, 3);               // 6

	}

}
