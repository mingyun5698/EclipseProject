package chap_11.management;

import java.util.Scanner;

public class Management {


		Dinasaur[] dino = new Dinasaur[3];
		Employer[] emp = new Employer[3];
		Dinasaur asd = new Dinasaur("비교", 0, "비교");
		Scanner sc = new Scanner(System.in);
		Ticket ticket = new Ticket();
		Ticket ticket2 = new SeasonTicket();
		


		public static void main(String[] args) {
			Management management = new Management();
			management.handleMenu();
		}



		void menuList() {
			System.out.println(" ");
			System.out.println("1번 : 공룡 추가");
			System.out.println("2번 : 공룡 수정");
			System.out.println("3번 : 공룡 삭제");
			System.out.println("4번 : 공룡 리스트");
			System.out.println("5번 : 공룡 먹이");
			System.out.println("6번 : 직원 추가");
			System.out.println("7번 : 직원 수정");
			System.out.println("8번 : 직원 삭제");
			System.out.println("9번 : 직원 리스트");
			System.out.println("10번 : 티켓 관리");
			System.out.println("11번 : 시즌 티켓 관리");
			System.out.println("12번 : 특별손님 맞이");
			System.out.println("13번 : 나이순으로 공룡 정렬");
			System.out.println("14번 : 타입순으로 공룡 정렬");
			System.out.println("15번 : 나가기");
			System.out.print("번호를 입력해 주세요 >>");
		}
		void handleMenu() {
			while(true) {
				
			
			menuList();
			int menuNumber = sc.nextInt();
			switch(menuNumber) {
			case 1 : addDino();
			break;
			case 2 : modifyDino();
			break;
			case 3 : deleteDino();
			break;
			case 4 : arrangeDino();
			break;
			case 5 : dinoFeed();
			break;
			case 6 : addEmployer();
			break;
			case 7 : modifyEmployer();
			break;
			case 8 : deleteEmployer();
			break;
			case 9 : arrangeEmployer();
			break;
			case 10 : manageTicket();
			break;
			case 11 : manageSeasonTicket();
			break;
			case 12 : handleSpecialEvents();
			break;
			case 13 : bubbleSort();
			break;
			case 14 : typeArray();
			break;
			case 15 : System.out.println("메뉴를 종료합니다.");
			System.exit(0);

			}
		}
		}

		void addDino() {
			int count=0;
			while(true) {				
				
				if (count==3) {
					System.out.println(" ");
					System.out.println("배열이 모두 가득차서 공룡추가기능을 종료합니다");
					System.out.print("종료하기 위해 아무거나 입력해주세요  >> ");
					String ex = sc.next();
					break;
				}
				
				System.out.println(" ");
				System.out.print("공룡 타입을 입력해주세요. (초식공룡/육식공룡/바다공룡) >>");
				String dinoType = sc.next();
				
				if(dinoType.equals("초식공룡")) {
					System.out.print("공룡 이름을 입력해 주세요 >>");
					String dinoName = sc.next();
					System.out.print("공룡 나이를 입력해 주세요 >>");
					int dinoAge = sc.nextInt();
					System.out.print("공룡 종을 입력해 주세요 >>");
					String dinoSpecies = sc.next();
				
					dino[count] = new herbivorousDino(dinoName, dinoAge, dinoSpecies);
					
					count++;
					System.out.println("현재 공룡 수 : " + count);
				}
				
				else if(dinoType.equals("육식공룡")) {
					System.out.print("공룡 이름을 입력해 주세요 >>");
					String dinoName = sc.next();
					System.out.print("공룡 나이를 입력해 주세요 >>");
					int dinoAge = sc.nextInt();
					System.out.print("공룡 종을 입력해 주세요 >>");
					String dinoSpecies = sc.next();
				
					dino[count] = new carnivorousDino(dinoName, dinoAge, dinoSpecies);
					count++;	
					System.out.println("현재 공룡 수 : " + count);
				}
				
				else if(dinoType.equals("바다공룡")) {
					System.out.print("공룡 이름을 입력해 주세요 >>");
					String dinoName = sc.next();
					System.out.print("공룡 나이를 입력해 주세요 >>");
					int dinoAge = sc.nextInt();
					System.out.print("공룡 종을 입력해 주세요 >>");
					String dinoSpecies = sc.next();
				
					dino[count] = new seaDino(dinoName, dinoAge, dinoSpecies);
					count++;
					System.out.println("현재 공룡 수 : " + count);
					
					
				}
				else {
					System.out.println("공룡 타입을 정확히 입력해주세요");
				}
			}
		}
		
		void modifyDino() {
			while(true) {
				System.out.println(" ");
				for (int i=0; i<dino.length; i++) {
					
					String dinoType = dino[i].dinoType();
					
					if (dino[i].name.equals("삭제된 공룡")) continue;
					
					else {
					System.out.println(i + "번 공룡 : "  + dinoType + " 이름:" + dino[i].name + " 나이:" + dino[i].age + " 종:" + dino[i].species);
					}
				}
			
			
				
			
			
			System.out.print("수정할 공룡 번호를 입력해 주세요 (나가기=9999) >>");
			int dinoNumber = sc.nextInt();
			
			
			if(dinoNumber == 9999) break;
			
			System.out.println(" ");
			System.out.println("바꿀 내용의 공룡 종류를 입력해 주세요 (초식공룡/육식공룡/바다공룡) >> ");
			String dinoType = sc.next();
			
			if(dinoType.equals("초식공룡")) {
				System.out.print("공룡 이름을 입력해 주세요 >>");
				String dinoName = sc.next();
				System.out.print("공룡 나이를 입력해 주세요 >>");
				int dinoAge = sc.nextInt();
				System.out.print("공룡 종을 입력해 주세요 >>");
				String dinoSpecies = sc.next();
			
				dino[dinoNumber] = new herbivorousDino(dinoName, dinoAge, dinoSpecies);
				
				
			}
			
			if(dinoType.equals("육식공룡")) {
				System.out.print("공룡 이름을 입력해 주세요 >>");
				String dinoName = sc.next();
				System.out.print("공룡 나이를 입력해 주세요 >>");
				int dinoAge = sc.nextInt();
				System.out.print("공룡 종을 입력해 주세요 >>");
				String dinoSpecies = sc.next();
			
				dino[dinoNumber] = new carnivorousDino(dinoName, dinoAge, dinoSpecies);
				
				
			}
			
			if(dinoType.equals("바다공룡")) {
				System.out.print("공룡 이름을 입력해 주세요 >>");
				String dinoName = sc.next();
				System.out.print("공룡 나이를 입력해 주세요 >>");
				int dinoAge = sc.nextInt();
				System.out.print("공룡 종을 입력해 주세요 >>");
				String dinoSpecies = sc.next();
			
				dino[dinoNumber] = new seaDino(dinoName, dinoAge, dinoSpecies);
				
			}
				
		}
		}
		
		void deleteDino() {
			while(true) {
				System.out.println(" ");	
			
				for (int i=0; i<dino.length; i++) {
					
					String dinoType = dino[i].dinoType();
					
					if (dino[i].name.equals("삭제된 공룡")) continue;
					
					else {
					System.out.println(i + "번 공룡 : "  + dinoType + " 이름:" + dino[i].name + " 나이:" + dino[i].age + " 종:" + dino[i].species);
					}
				}
			
			System.out.print("삭제할 공룡 번호를 입력해 주세요 (나가기=9999) >>");
			int dinoNumber = sc.nextInt();
			if (dinoNumber==9999) break;
			
			dino[dinoNumber].name = "삭제된 공룡";
		}
		}
		
		void arrangeDino() {
			System.out.println(" ");
			for (int i=0; i<dino.length; i++) {
				
				String dinoType = dino[i].dinoType();
				
				if (dino[i].name.equals("삭제된 공룡")) continue;
				
				else {
				System.out.println(i + "번 공룡 : "  + dinoType + " 이름:" + dino[i].name + " 나이:" + dino[i].age + " 종:" + dino[i].species);
				}
			}
			System.out.print("나가려면 아무거나 입력하세요 >>");
			String ex = sc.next();
		}
		
		void dinoFeed() {
			while (true){
				
			System.out.println(" ");
			System.out.print("공룡 번호: ");
			for(int i=0; i<dino.length; i++) {
				
				if(dino[i].name.equals("삭제된 공룡")) continue;
				
				
				else {
				System.out.print(i + " ");
				}
			}
			System.out.println(" ");
			
			System.out.print("먹이를 줄 공룡의 번호를 입력해 주세요 (나가기=9999) >>");
			int dinoNum = sc.nextInt();
			
			if (dinoNum==9999) break;
			
			else {
				System.out.print(dinoNum + "번 공룡은 " + dino[dinoNum].dinoType() + "이며 ");
			dino[dinoNum].eat(dino[dinoNum]);
			}
			
			}
			
		}
		
		void addEmployer() {
			int count2=0;
			while(true) {				
				
				if (count2==3) {
					System.out.println(" ");
					System.out.println("배열이 모두 가득차서 직원추가기능을 종료합니다");
					System.out.print("종료하기 위해 아무거나 입력해주세요  >> ");
					String ex = sc.next();
					break;
				}
				
				System.out.println(" ");
				System.out.print("직업 을 입력해주세요. (청소부/사육사/수위) >>");
				String EmployerType = sc.next();
				
				if(EmployerType.equals("청소부")) {
					System.out.print("직원 이름을 입력해 주세요 >>");
					String employerName = sc.next();
					System.out.print("직원 출근 시간을 입력해 주세요 >>");
					int workTimeOn = sc.nextInt();
					System.out.print("직원 퇴근 시간을 입력해 주세요 >>");
					int workTimeOut = sc.nextInt();
				
					emp[count2] = new Cleaner(employerName, workTimeOn, workTimeOut);
					
					count2++;
					System.out.println("현재 직원 수 : " + count2);
				}
				
				else if(EmployerType.equals("사육사")) {
					System.out.print("직원 이름을 입력해 주세요 >>");
					String employerName = sc.next();
					System.out.print("직원 출근 시간을 입력해 주세요 >>");
					int workTimeOn = sc.nextInt();
					System.out.print("직원 퇴근 시간을 입력해 주세요 >>");
					int workTimeOut = sc.nextInt();
				
					emp[count2] = new Zookeeper(employerName, workTimeOn, workTimeOut);
					
					count2++;
					System.out.println("현재 직원 수 : " + count2);
				}
				
				else if(EmployerType.equals("수위")) {
					System.out.print("직원 이름을 입력해 주세요 >>");
					String employerName = sc.next();
					System.out.print("직원 출근 시간을 입력해 주세요 >>");
					int workTimeOn = sc.nextInt();
					System.out.print("직원 퇴근 시간을 입력해 주세요 >>");
					int workTimeOut = sc.nextInt();
				
					emp[count2] = new Janitor(employerName, workTimeOn, workTimeOut);
					
					count2++;
					System.out.println("현재 직원 수 : " + count2);
				}
				
				else {
					System.out.println("직업을 정확히 입력해주세요");
				}
			}
		}
		
		void modifyEmployer() {
			while(true) {
				System.out.println(" ");
		
		for (int i=0; i<emp.length; i++) {
			
			String empType = emp[i].employerType();
			
			if (emp[i].name.equals("삭제된 직원")) continue;
			
			else {
			System.out.println(i + "번 직원   "  + "업무:" + empType + " 이름:" + emp[i].name + " 출근시간:" + emp[i].workTimeOn + "시 퇴근시간:" + emp[i].workTimeOut + "시");
			}
		}


		


			System.out.print("수정할 직원 번호를 입력해 주세요 (나가기=9999) >>");
				int empNumber = sc.nextInt();


				if(empNumber == 9999) break;
				
				System.out.println(" ");
				System.out.println("바꿀 내용의 직원 종류를 입력해 주세요 (청소부/사육사/수위) >> ");
					String empType = sc.next();

					if(empType.equals("청소부")) {
						System.out.print("직원 이름을 입력해 주세요 >>");
						String employerName = sc.next();
						System.out.print("직원 출근 시간을 입력해 주세요 >>");
						int workTimeOn = sc.nextInt();
						System.out.print("직원 퇴근 시간을 입력해 주세요 >>");
						int workTimeOut = sc.nextInt();

							emp[empNumber] = new Cleaner(employerName, workTimeOn, workTimeOut);
						}

					if(empType.equals("사육사")) {
						System.out.print("직원 이름을 입력해 주세요 >>");
						String employerName = sc.next();
						System.out.print("직원 출근 시간을 입력해 주세요 >>");
						int workTimeOn = sc.nextInt();
						System.out.print("직원 퇴근 시간을 입력해 주세요 >>");
						int workTimeOut = sc.nextInt();

						emp[empNumber] = new Zookeeper(employerName, workTimeOn, workTimeOut);
					}
					
					if(empType.equals("수위")) {
						System.out.print("직원 이름을 입력해 주세요 >>");
						String employerName = sc.next();
						System.out.print("직원 출근 시간을 입력해 주세요 >>");
						int workTimeOn = sc.nextInt();
						System.out.print("직원 퇴근 시간을 입력해 주세요 >>");
						int workTimeOut = sc.nextInt();

						emp[empNumber] = new Zookeeper(employerName, workTimeOn, workTimeOut);
					}	
			}
		}
		
		void deleteEmployer() {
			while(true) {
				
				System.out.println(" ");
				for (int i=0; i<emp.length; i++) {
					
					String empType = emp[i].employerType();
					
					if (emp[i].name.equals("삭제된 직원")) continue;
					
					else {
						System.out.println(i + "번 직원   "  + "업무:" + empType + " 이름:" + emp[i].name + " 출근시간:" + emp[i].workTimeOn + "시 퇴근시간:" + emp[i].workTimeOut + "시");
						}
				}
			
			System.out.print("삭제할 직원 번호를 입력해 주세요 (나가기=9999) >>");
			int empNumber = sc.nextInt();
			if (empNumber==9999) break;
			
			emp[empNumber].name = "삭제된 직원";
		}
	}
		
		void arrangeEmployer() {
			System.out.println(" ");
			for (int i=0; i<emp.length; i++) {
				
				String empType = emp[i].employerType();
				
				
				if (emp[i].name.equals("삭제된 직원")) continue;
				
				else {
					System.out.print(i + "번 직원의 이름은 "  + emp[i].name + "이며 "  + emp[i].workTimeOn + "시부터 " + emp[i].workTimeOut + "시까지 ");
					emp[i].dodo();
					}
			}
			System.out.print("나가려면 아무거나 입력하세요 >>");
			String ex = sc.next();
		}
		void manageTicket() {
			
			
			while (true){
				System.out.println(" ");	
			System.out.print("추가할 티켓 수를 입력해 주세요>> ");
			
			
			int ticketadd = sc.nextInt();
			if(ticketadd == 9999) break;
			
			int remain = ticket.addTicket(ticketadd);
			System.out.println("남은 티켓은 : " + remain);
			ticket.amount = remain;
			
			System.out.println(" ");
			System.out.print("사용할 티켓 수를 입력해 주세요>> ");
			int ticketUse = sc.nextInt();
			if(ticketUse == 9999) break;
			
			remain = ticket.deleteTicket(ticketUse);
			System.out.println("남은 티켓은 : " + remain);
			ticket.amount = remain;
		 }
		}
		void manageSeasonTicket() {

			
			while (true){
				System.out.println(" ");
				System.out.print("추가할 시즌 티켓 수를 입력해 주세요>> ");
				
				
				int ticketadd = sc.nextInt();
				if(ticketadd == 9999) break;
				
				int remain = ticket2.addTicket(ticketadd);
				System.out.println("남은 시즌 티켓은 : " + remain);
				ticket2.amount = remain;
				
				System.out.println(" ");
				System.out.print("사용할 시즌 티켓 수를 입력해 주세요>> ");
				int ticketUse = sc.nextInt();
				if(ticketUse == 9999) break;
				
				remain = ticket2.deleteTicket(ticketUse);
				System.out.println("남은 시즌 티켓은 : " + remain);
				ticket2.amount = remain;
			 }
			}
		void handleSpecialEvents() {
			System.out.println(" ");
			System.out.print("특별 손님 성함을 써주세요 >>");
			String name = sc.next();
			System.out.println(" ");
			System.out.print("Mesozoic 공원에 진심으로 " + name + "님을 환영합니다. 공룡은 ");
			for (int i=0; i<dino.length; i++) {
				
				
				if (dino[i].name.equals("삭제된 공룡")) continue;
				
				else {
				System.out.print(dino[i].species + " ");
				}
			}
			System.out.println("가 있습니다.");
			System.out.print("나가려면 아무거나 입력해주세요 >>");
			String ex = sc.next();
		}
		
		void bubbleSort() {
			for (int i =0; i<dino.length-1; i++) {
				for (int j=0; j<dino.length-(i+1); j++) {
					if (dino[j].age > dino[j+1].age) {
						asd = dino[j];
						dino[j] = dino[j+1];
						dino[j+1] = asd;
					}
					else continue;
				}
			}
			
			System.out.println(" ");
			for (int i=0; i<dino.length; i++) {
				
				String dinoType = dino[i].dinoType();
				
				if (dino[i].name.equals("삭제된 공룡")) continue;
				
				else {
				System.out.println(i + "번 공룡 : "  + dinoType + " 이름:" + dino[i].name + " 나이:" + dino[i].age + " 종:" + dino[i].species);
				}
			}
			System.out.print("나가려면 아무거나 입력하세요 >>");
			String ex = sc.next();
		}
		
		void herbivorousDinotypeArray() {
			System.out.print("초식공룡 : ");
			for(int i=0; i<dino.length; i++) {
				if (dino[i].dinoType().equals("초식공룡")) {
					System.out.print(dino[i].species + " ");
				} else continue;
				System.out.println(" ");
			}
		}
		void carnivorousDinotypeArray() {
			System.out.print("육식공룡 : ");
			for(int i=0; i<dino.length; i++) {
				if (dino[i].dinoType().equals("육식공룡")) {
					System.out.print(dino[i].species + " ");
				} else continue;
				System.out.println(" ");
			}
		}
		void seaDinotypeArray() {
			System.out.print("바다공룡 : ");
			for(int i=0; i<dino.length; i++) {
				if (dino[i].dinoType().equals("바다공룡")) {
					System.out.print(dino[i].species + " ");
				} else continue;
				System.out.println(" ");
			}
			System.out.print("나가기 위해 아무거나 입력 >>");
			String ex = sc.next();
		}
		
		void typeArray() {
			herbivorousDinotypeArray();
			carnivorousDinotypeArray();
			seaDinotypeArray();
		}
		
}





