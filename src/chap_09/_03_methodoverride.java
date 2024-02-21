package chap_09;

public class _03_methodoverride {

	public static void main(String[] args) {
		Cal1 cal1 = new Cal1();
		Cal2 cal2 = new Cal2();
		
		
		System.out.println(cal1.cl(5, 5));
		System.out.println(cal2.cl(5, 5));

	}

}

class Cal1 {
	int cl(int x, int y) {
		return x+y;
	}
}

class Cal2 extends Cal1 {
	int cl(int x, int y) {
		return x-y;
	}
}
