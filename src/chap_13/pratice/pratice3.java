package chap_13.pratice;
import java.time.LocalDate;
import java.time.Period;

public class pratice3 {

	public static void main(String[] args) {
		LocalDate nowDate = LocalDate.now();
		LocalDate safeDate = LocalDate.of(2021, 1, 21);
		Period howLongP = Period.between(nowDate, safeDate);

		
		
		while(howLongP.getDays()<0) {
			safeDate = safeDate.plusDays(45);
			howLongP = Period.between(nowDate, safeDate);
		}
		System.out.println(howLongP.getDays());
		
	}

}
