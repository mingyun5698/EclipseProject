package chap_13.project;

import java.time.LocalDate;
import java.util.HashMap;

public class BirthDay {
	private HashMap<String, LocalDate> birthDay;
	
	public BirthDay() {
		birthDay = new HashMap<>();
	}
	
	public void logBirthDay(String name, LocalDate birthday) {
		birthDay.put(name, birthday);
	}
	
	LocalDate getBirthDay(String dinoName) {
		return this.birthDay.get(dinoName);
	}
}
