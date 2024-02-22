package chap_08.management;
import java.util.Scanner;



public class Management {
	Scanner sc = new Scanner(System.in);
	int count1;
	int count2;

	Dinasaur dino = new Dinasaur();
	Employee emp = new Employee();

	public static void main(String[] args) {
		Management manage = new Management();
		manage.start();					
	}	
	public void start() {
		while (true) {
		displayMenu();
		int choice = sc.nextInt();
		handleMenuChoice(choice);
			}
		}
	
	public void displayMenu() {
		System.out.println("Welcome to Mesozoic Eden Park Manager!");
		System.out.println("1. 공룡 추가");
		System.out.println("2. 공룡 수정");
		System.out.println("3. 공룡 삭제");
		System.out.println("4. 직원 추가");
		System.out.println("5. 티켓 관리");
		System.out.println("6. 공룡, 직원 상태 확인");
		System.out.println("7. 특별손님 입장");
		System.out.println("8. 나가기");
		System.out.print("사용하실 기능 번호를 입력해주세요: ");
		}
	
	public void handleMenuChoice(int choice) {						
		switch (choice) {		
		case 1: addDino(dino);
			break;
		case 2: modifyDino();
			break;
		case 3: deleteDino();
			break;
		case 4: employeeAdd(emp);
			break;
		case 5: manageTickets();
			break;
		case 6: checkParkStatus();
			break;
		case 7: handleSpecialEvents();
			break;
		case 8: System.out.println("Exiting...");
			System.exit(0);
			break;
		
			}
		}						
	public void addDino(Dinasaur dino) {
		System.out.println("---------------------------------------");
		while(true) {
			if (count1>4
					) {
				System.out.println("공룡 5마리 모두 추가되었습니다.");
				break;
			}								
		System.out.print("공룡의 이름을 입력하세요 >>");
		dino.names[count1] = sc.next();
		System.out.print("공룡의 나이를 입력하세요 >>");
		dino.ages[count1] = sc.nextInt();
		System.out.print("공룡의 종을 입력하세요 >>");
		dino.specieses[count1] = sc.next();
		System.out.println("이름은 " + dino.names[count1] + "이고 나이는 " + dino.ages[count1] + "이고 종은 " + dino.specieses[count1] + "입니다.");
		count1++;
		System.out.println("추가된 공룡 수 : " + count1);
		}
	}
	
	public void employeeAdd(Employee emp) {
		System.out.println("---------------------------------------");
		while(true) {
			if (count2>4) {
				System.out.println("직원 5명이 모두 추가되었습니다.");
				break;
			}
		
		System.out.print("직원의 이름을 입력하세요 >>");
		emp.names[count2] = sc.next();
		System.out.print("직원의 업무를 입력하세요 >>");
		emp.jobTitles[count2] = sc.next();
		System.out.print("직원의 경력을 입력하세요 >>");
		emp.yearsOfExperiences[count2] = sc.nextInt();
		
		System.out.println("이름은 " + emp.names[count2] + "이고 업무는 " + emp.jobTitles[count2] + "이고 경력은 " + emp.yearsOfExperiences[count2] + "년 입니다.");
		count2++;
		System.out.println("추가된 직원 수 : " + count2);
		}
	}
	
	int[] ticket = new int[100];
	void manageTickets() {
		System.out.println("---------------------------------------");
		
		
		
		int remain = 500;
		remain = 500-ticket[0];

		while(true) {						
			System.out.print("들어갈 입장객 수를 써주세요 >>");
			int enter = sc.nextInt();
			
			remain -= enter;
			
			if(enter==9999) break;
			
			else if (remain <= 0) {
			 System.out.println(enter + remain + "명이 입장합니다. 티켓이 전부 소진되어 더이상 입장할 수 없습니다.");
			 System.out.print("아무거나 입력해주세요 >>");
			 String a = sc.next();
			 ticket[0] = 500;
			 break;
			}
			
			
			
			else if(remain == 0) {
				System.out.println(enter + " 명이 입장합니다. 티켓이 전부 소진되어 더이상 입장할 수 없습니다.");
			}
			
			else {
				System.out.println(enter + "명이 입장합니다. 남은 티켓 : " + remain);
				ticket[0] = 500-remain;
			}																
		}
	}
	void checkParkStatus() {
		
	
		for (int i=0; i<count1; i++) {
			if(dino.names[i].equals("삭제")) continue;
			else {
				System.out.println(dino.names[i] + "의 나이는 " + dino.ages[i] + "살 이고 종은 " + dino.specieses[i] + "입니다.");
			}
			
		}
		
		for (int i=0; i<count2; i++) {
			System.out.println(emp.names[i] + "의 업무는 " + emp.jobTitles[i] + "이고 경력은 " + emp.yearsOfExperiences[i] + "년 입니다.");
		}
		System.out.print("아무거나 입력해주세요 >>");
		String a = sc.next();
	
	}
	
	void handleSpecialEvents() {
		System.out.println("---------------------------------------");
		System.out.print("이름을 입력해 주세요 >>");
		String name = sc.next();
		System.out.print("환영합니다. " + name + "님 공룡들은 " );
		for (int i=0; i<count1; i++) {
			if(dino.names[i].equals("삭제")) continue;
			System.out.print(dino.names[i] + " ");
		} System.out.println("가 있습니다.");
		System.out.print("나가려면 아무거나 입력해주세요 >>");
		name = sc.next();
	}
	
	
	void modifyDino() {
		System.out.println("---------------------------------------");
		System.out.print("수정할 공룡 번호를 입력해주세요 >> ");
		int number = sc.nextInt();
		System.out.print("이름을 수정해 주세요. >> ");
		String name = sc.next();
		dino.names[number] = name; 
		System.out.print("나이를 수정해 주세요. >> ");
		int age = sc.nextInt();
		dino.ages[number] = age; 
		System.out.print("공룡 종을 수정해주세요 >> ");
		String spice = sc.next();
		dino.specieses[number] = spice;
		System.out.println("아무거나 입력하면 나가집니다 >>");
		String exit = sc.next();
	}
	
	void deleteDino() {
		System.out.println("---------------------------------------");
		System.out.print("공룡들은 " );
		for (int i=0; i<count1; i++) {
			System.out.print(dino.names[i] + " ");
		} System.out.println("가 있습니다.");
		
		
		System.out.print("삭제할 공룡 번호를 입력해주세요(null로 바꾸기) >> ");
		int number = sc.nextInt();
		dino.names[number] = "삭제"; 
		dino.ages[number] = 0; 
		dino.specieses[number] = null;
		
		System.out.println("아무거나 입력하면 나가집니다 >>");
		String ex = sc.next();
	}
}
