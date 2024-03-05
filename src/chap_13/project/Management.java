package chap_13.project;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Management {
	Scanner sc = new Scanner(System.in);
	List<Dinosaur>dino = new ArrayList<>();
	List<Activity>act = new ArrayList<>();
	int count;
	BirthDay b1 = new BirthDay();
	public static void main(String[] args) {
		Management management = new Management();
		management.handleMenu();
		
		
	}
	
	
	void handleMenu() {
		while(true) {
			System.out.println("1번 : 공룡 추가");
			System.out.println("2번 : 활동 추가");
			System.out.println("3번 : 나가기");
			System.out.print("번호를 입력해 주세요 >>");
			int num = sc.nextInt();
			switch(num) {
			case 1 : addDino();
			break;
			case 2 : addActivity();
			break;
			case 3 : System.exit(0);
			}
		}
	}
	
	void addDino() {
		while(true) {
			System.out.print("공룡 이름을 입력해 주세요 >>");
			String name = sc.next();
			if(name.equals("나가기")) break;
			
			else {
				System.out.print("공룡 종을 입력해 주세요 >>");
				String species = sc.next();
				System.out.print("공룡의 건강상태를 입력해 주세요 >>");
				String healthStatus = sc.next();
				dino.add(new Dinosaur(name, species, healthStatus));
				System.out.println("인덱스 : " + count);
				count++;
			}
			
		}
	}
	
	void addActivity() {
		count = 0;
		while(true) {
			if(dino.size()>act.size()) {
				System.out.print(dino.get(count).name + " 공룡이 태어난 년도(年)를 입력해주세요 >>");
				int year = sc.nextInt();
				System.out.print(dino.get(count).name + " 공룡이 태어난 월(月)을 입력해주세요 >>");
				int month = sc.nextInt();
				System.out.print(dino.get(count).name + " 공룡이 태어난 일(日)을 입력해주세요 >>");
				int day = sc.nextInt();
				act.add(new Activity(dino.get(count).name, LocalDate.of(year, month, day)));

				b1.logBirthDay(act.get(count).name, act.get(count).birthday);
				System.out.println("인덱스 : " + count);
				System.out.println(act.get(count).name + "의 생일은 "+ b1.getBirthDay(act.get(count).name) + "입니다.");
				count++;
			}
			else {
				System.out.println("공룡 생일을 모두 정했습니다. 나가기 >>");
				String ex = sc.next();
				break;
			}
		}
	}

}
