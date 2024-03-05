package chap_13;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.*;
import java.text.SimpleDateFormat;

public class _08_DateAPI {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		
		
		LocalDate L1 = LocalDate.of(2024,3,1);
		LocalTime L2 = LocalTime.of(15, 3, 30);
		
		System.out.println(L1);
		System.out.println(L2);
		
		LocalDate birthDate = LocalDate.of(1997, 10, 07);
		LocalDate currentDate = LocalDate.of(2024,03,04);
		
		Period howLong = Period.between(birthDate, currentDate);
		System.out.println(howLong);
		
		LocalTime lt1  = LocalTime.of(12, 0, 20);
		LocalTime lt2  = LocalTime.of(14, 45, 40);
		Duration howLongD2 = Duration.between(lt1, lt2);
		System.out.println(howLongD2);  //PT2H45M20S
		
		LocalDate date  = LocalDate.now();
		DateTimeFormatter  isoDate = DateTimeFormatter.ISO_DATE;
		System.out.println(date.format(isoDate));   
		          
	} 
}
