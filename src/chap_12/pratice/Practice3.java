package chap_12.pratice;

public class Practice3 {

	public static void main(String[] args) {
		Dinasaur dino = new Dinasaur("티라노사우루스", 500, 25);
		try {
			dino.setWeight(-500);
			System.out.println(dino.getWeight());
		} catch(InvalidWeight e) {
			System.out.println("몸무게가 음수입니다.");
		} finally {
			System.out.println("공룡 몸무게 검사가 완료되었습니다.");
		}
	}

}
