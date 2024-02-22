package chap_10;

public class _02_UpCasting {
	
	public static void doAction(Machine machine) {
		machine.on();
	}
	
	public static void main(String[] args) {
		Machine mt = new Tractor();
		doAction(mt);
		doAction(new Tractor());
		}

}

class Machine{
	void on() {System.out.println("Machine::on()");}
}
	
class Tractor extends Machine {
	void on() {System.out.println("Tractor::on()");}
}
