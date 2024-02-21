package chap_07;

public class Quiz {

	
	// 1번 문제 메소드
	public static void fmq(int age) {
		if (age<2) {
			System.out.println("갓 부화한 것 입니다.");
		}
		
		if (age>1 || age<16) {
			System.out.println("청소년기 입니다.");
		}
		
		if(age>15) {
			System.out.println("성체입니다.");
		}
		
		if(age>15) {
			System.out.println("성체입니다.");
		}
		
		
	}
	
	// 2번 문제 메소드
	public static int needFood(int weight) {
		return weight/20;
	}
	
	
	// 3번 문제 메소드
	public static int avgAge(int...args) {
		int sum=0;
		for(int i:args) {
			sum += i;
		} return sum/args.length;
	
		
	}
	// 4번 문제 메소드
	public static void time(int time) {
		if (time>=9 | time<=18) {
			System.out.println("공원이 열려있습니다. 오픈시간 09:00 ~ 18:00");
		}
		else {
			System.out.println("공원이 닫혀있습니다. 오픈시간 09:00 ~ 18:00");
		}
	}
	
	// 5번 문제 메소드
	public static void greeting(String name) {
		System.out.println("메조이틱 공원에 어서오세요 " + name + "님 환영합니다.");
	}
	
	// 6번 문제 메소드
	
	public static void fullNumber(int number) {
		int fullNumber = 500;
		int nowNumber = 450 + number;
		if (nowNumber > fullNumber) {
			System.out.println("최대 방문객을 넘어 공원출입을 할 수 없습니다. " + (nowNumber - fullNumber) + "명이 초과 됩니다.");
		} else {
			System.out.println("환영합니다. 인원 가능한 남은 수 : " + (fullNumber-nowNumber));
		}
		
	}
	
	
	public static void main(String[] args) {
		fmq(5);
		System.out.println("500kg의 공룡이 먹을 음식의 양은 " + needFood(500) + "kg 입니다.");
		
		int[] age = {15, 65, 21, 55, 12};
		
		System.out.println("공룡들의 평균 나이는 " + avgAge(age[0], age[1], age[2], age[3], age[4]) + "살 입니다.");
		
		time(15);
		
		greeting("홍길동");
		
		fullNumber(80);
	}

}
