package chap_09;

public class _05_super {

	public static void main(String[] args) {
		Greeting g1 = new Greeting();
		Greeting2 g2 = new Greeting2();
		
		g1.greeting();
		g2.greeting();

	}

}

class Greeting{
	void greeting() {
		System.out.println("안녕하세요");
	}
}

class Greeting2 extends Greeting{
	void greeting() {
		super.greeting();
		System.out.println("반갑습니다.");
	}
}
