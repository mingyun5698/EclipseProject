package chap_11.management;


public class Ticket {
	int amount;

	int[] remain = new int[2];
	
	

	int addTicket(int add) {
		remain[0] += add;
		return this.remain[0];
	}
	
	
	int deleteTicket(int use) {
		if(remain[0] < use) {
			remain[0] = 0;
		}
		else remain[0] -= use;
		return this.remain[0];
	}
}
class SeasonTicket extends Ticket {
	
	
	int addTicket(int add) {
		remain[1] += add;
		return this.remain[1];
		
	}
	
	int deleteTicket(int use) {
		
		if(remain[1] < use) {
			remain[1] = 0;
		}
		
		else remain[1] -= use;
		
		return this.remain[1];
	}
}
