package chap_09;

public class _08_final {

	public static void main(String[] args) {
		Pen p1 = new Pen();
		FountainPen p2 = new FountainPen();
		

		p1.write();
		p2.write();
	}

}


final class Earth{
	
}

//class SubEarth extends Earth{}

class Pen {
	final void write() {
		System.out.println("ㅇㅇ");
	}
	
//	final abstract scribble();
}

class FountainPen extends Pen {
//	void write() {
//		System.out.println("ㅇㅇㅇ");
//	}
}



