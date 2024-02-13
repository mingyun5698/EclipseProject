package chap_07;
import java.util.*;

public class Management {
	 static String[] dinoNames = new String[5];
	 static Scanner sc = new Scanner(System.in);
	
	public void start() {
		while (true) {
			displayMenu();
			int choice = sc.nextInt();
			handleMenuChoice(choice);
		}
	}
	
	
	
	public void displayMenu() {
		System.out.println("Welcome to Mesozoic Eden Assistant!");
		System.out.println("1. Add Dinosaur");
		System.out.println("2. Check Park Hours");
		System.out.println("3. Greet Guest");
		System.out.println("4. Check Visitors Count");
		System.out.println("5. Manage Staff");
		System.out.println("6. Exit");
		System.out.print("Enter your choice: ");
	}
	
	public void handleMenuChoice(int choice) {
		switch (choice) {
		case 1: addDinosaur();
			break;
		case 2: checkParkHours();
			break;
		case 3: greetGuest();
			break;
		case 4: checkVisitorsCount();
			break;
		case 5: manageStaff();
			break;
		case 6: System.out.println("Exiting...");
			System.exit(0);
			break;
		}
	}
	
	public static void addDinosaur() {
		System.out.print("첫번째 공룡의 이름을 쓰세요 -> ");
		dinoNames[0] = sc.next();
		System.out.print("두번째 공룡의 이름을 쓰세요 -> ");
		dinoNames[1] = sc.next();
		System.out.print("세번째 공룡의 이름을 쓰세요 -> ");
		dinoNames[2] = sc.next();
		System.out.print("네번째 공룡의 이름을 쓰세요 -> ");
		dinoNames[3] = sc.next();
		System.out.print("다섯번째 공룡의 이름을 쓰세요 -> ");
		dinoNames[4] = sc.next();
		System.out.println("추가된 공룡의 이름 : " + dinoNames[0] + ", "+ dinoNames[1] + ", "+ dinoNames[2] + ", "+ dinoNames[3] + ", "+ dinoNames[4]);
	}
	
	public static void checkParkHours() {
		System.out.println("공원 개장 시간은 09:00 ~ 18:00 입니다. ");
	}
	
	public static void greetGuest() {
		System.out.print("당신의 이름을 입력하세요 -> ");
		String name = sc.next();
		System.out.println("환영합니다. " + name + "님. 현재 있는 공룡은 " + dinoNames[0] + ", "+ dinoNames[1] + ", "+ dinoNames[2] + ", "+ dinoNames[3] + ", "+ dinoNames[4] + "가 있습니다.");
	}
	
	public static void checkVisitorsCount() {
		System.out.print("입장 인원을 입력하세요 -> ");
		int number = sc.nextInt();
		if (number > 50) {
			System.out.println(number-50 + "명이 초과되어 입장할 수 없습니다. 입장 가능한 인원 : 50명");
		} else {
			System.out.println("환영합니다. 남은 입장 수 : " + (50-number));
		}
	}
	
	public static void manageStaff() {
		System.out.print("직원의 이름을 입력하세요 -> ");
		String staffName = sc.next();
		System.out.print("직원의 나이를 입력하세요 -> ");
		int staffAge = sc.nextInt();
		System.out.println("직원의 이름은 " + staffName + "이며 나이는 " + staffAge + "살 입니다.");
	}
	
	
	public static void main(String[] args) {
		Management main = new Management();
		main.start();
	}

}
