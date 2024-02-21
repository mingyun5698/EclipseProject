package chap_09;

public class _06_abstract {

	public static void main(String[] args) {
		GraphitePencil p1 = new GraphitePencil();
		p1.write();
	}

}

abstract class Pencil{
	abstract void write();
}

abstract class WaterColorPencil extends Pencil{}

class GraphitePencil extends Pencil {
	void write() {
        System.out.println("GraphitePencil::write()");
    }
}