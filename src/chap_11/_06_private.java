package chap_11;

public class _06_private implements EfficientTennis {
	
	public void volley() {
		System.out.println("volley");
	}
	
	public static void main(String[] args) {
		EfficientTennis a1 = new _06_private();
		
		a1.backhand();
		EfficientTennis.forehand();
	}

}

interface EfficientTennis {
	private static void hit(String stroke) {
		System.out.println("Move into position");
		System.out.println("Hitting a " + stroke);
		System.out.println("Move back into ready position");
	}
	
	default void backhand() {
		hit("backhand");
	}
	
	static void forehand() {
		hit("forehand");
	}
	
	private void smash() {
		hit("smash");
	}
	
	void volley();
	
	
}
