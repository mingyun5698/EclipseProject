package chap_11;

public class _04_static implements I {

	public static void main(String[] args) {
		System.out.println(I.m());
		// 스태틱 메소드는 물려받지 못한다.
	}

}

interface I {
	static int m() {
		return 3;
	}
}
