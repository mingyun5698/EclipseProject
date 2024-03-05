package chap_13.pratice;

import java.time.DayOfWeek;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.*;

public class pratice2 {

	private HashMap<String, LocalTime>eventlog;
	
	
	Scanner sc = new Scanner(System.in);
	
	LocalDateTime Mealtime = LocalDate.now().atTime(12,0,0);
	DayOfWeek CleanTime = DayOfWeek.FRIDAY;
	DayOfWeek trainingDay = DayOfWeek.SATURDAY;
	LocalTime trainingTime = LocalTime.of(15, 30);

	
	void workTime() {
		while(true) {
			System.out.print("청소시간, 급식시간, 비상훈련중 하나를 입력하세요. >>");
			String work = sc.next();
			
			if(work.equals("급식시간")) {
				System.out.println("급식시간 : " + Mealtime);
			}
			
			else if(work.equals("청소시간")) {
				System.out.println("청소시간 : " + CleanTime);
			}
			
			else if(work.equals("비상훈련")) {
				System.out.println("비상훈련시간 : " + trainingDay +" " + trainingTime);
			}
		}
		
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		new pratice2().workTime();
	
		
	}

}
