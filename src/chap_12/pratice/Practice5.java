package chap_12.pratice;

public class Practice5 {

	public static void main(String[] args) throws CriticalHealthException {
		Dinasaur dino = new Dinasaur("티라노사우루스", 500, 25);
		try {
			dino.setHealthPoint(10);
		} catch(CriticalHealthException e) {
			System.out.println(e.getMessage());
			dino.setHealthPoint(30);
			System.out.println("운동 후 공룡의 건강점수 : " + dino.getHealthPoint());
		}
	}

}
