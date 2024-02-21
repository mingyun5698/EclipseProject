package chap_09;

public class _04_methodoverloading {

	public static void main(String[] args) {
		Calcul cal = new Calcul();
		System.out.println(cal.cal1(5));
		System.out.println(cal.cal1(5, 5));
		System.out.println(cal.cal1());;
		
	}

}

class Calcul {
	
	int cal1(int x) {
		return x;
	}
	
	int cal1(int x, int y) {
		return x+y;
	}
	
	int cal1() {
		return cal1(15);
	}
				
}
