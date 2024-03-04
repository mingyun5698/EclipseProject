package chap_13.pratice;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashMap;

public class pratice2 {

	private HashMap<String, LocalTime>eventlog;
	
	public void EventKeeper() {
		eventlog = new HashMap<>();
	}
	public void logEvent(String event, LocalTime eventTime) {
		eventlog.put(event, eventTime);
	}
	
	
	
	public static void main(String[] args) {
		
		LocalTime t1 = LocalTime.of(8, 30);
		pratice2 p1 = new pratice2();
		
	}

}
