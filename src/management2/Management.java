package management2;
import java.util.*;

public class Management {
	
	
	Dinasaur[] dino = new Dinasaur[3];
	Scanner sc = new Scanner(System.in);
	int count=0;
	
	public static void main(String[] args) {
		Management management = new Management();
		management.handleMenu();
		
		
		
	}
	
	
	void menuList() {
		System.out.println("1번 : 공룡 추가");
		System.out.println("2번 : 공룡 수정");
		System.out.println("3번 : 공룡 삭제");
		System.out.println("4번 : 공룡 리스트");
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
		case 5 : System.out.println("메뉴를 종료합니다.");
		System.exit(0);

		}
	}
	}
	
	
	
	
	
	
	void addDino() {
		while(true) {				
			
			if (count==3) {
				System.out.println("배열이 모두 가득차서 공룡추가기능을 종료합니다");
				System.out.print("종료하기 위해 아무거나 입력해주세요  >> ");
				String ex = sc.next();
				break;
			}
			
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
	
			for (int i=0; i<dino.length; i++) {
				
				String dinoType = dino[i].dinoType();
				
				if (dino[i].name.equals("삭제된 공룡")) continue;
				
				else {
				System.out.println(i + "번 공룡 : "  + dinoType + " " + dino[i].name + " " + dino[i].age + " " + dino[i].species);
				}
			}
		
		
			
		
		
		System.out.print("수정할 공룡 번호를 입력해 주세요 (나가기=9999) >>");
		int dinoNumber = sc.nextInt();
		
		
		if(dinoNumber == 9999) break;
		
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
			
		
			for (int i=0; i<dino.length; i++) {
				
				String dinoType = dino[i].dinoType();
				
				if (dino[i].name.equals("삭제된 공룡")) continue;
				
				else {
				System.out.println(i + "번 공룡 : "  + dinoType + " " + dino[i].name + " " + dino[i].age + " " + dino[i].species);
				}
			}
		
		System.out.print("삭제할 공룡 번호를 입력해 주세요 (나가기=9999) >>");
		int dinoNumber = sc.nextInt();
		if (dinoNumber==9999) break;
		
		dino[dinoNumber].name = "삭제된 공룡";
	}
	}
	
	void arrangeDino() {
		for (int i=0; i<dino.length; i++) {
			
			String dinoType = dino[i].dinoType();
			
			if (dino[i].name.equals("삭제된 공룡")) continue;
			
			else {
			System.out.println(i + "번 공룡 : "  + dinoType + " " + dino[i].name + " " + dino[i].age + " " + dino[i].species);
			}
		}
		System.out.print("나가려면 아무거나 입력하세요 >>");
		String ex = sc.next();
	}

	
	
	
	
	
	
	
}
