package chap_13.pratice;

import java.time.LocalDate;
import java.time.Period;

public class Dinosaur {
	LocalDate birthday;	
	String name;
	LocalDate nowDate = LocalDate.now();
	LocalDate safeDate = LocalDate.of(2024, 2, 15);
	
	public Dinosaur(String name, LocalDate birthday) {
		this.name = name;
		this.birthday = birthday;
	}
	
	

}
