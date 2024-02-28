package chap_12.management;
import java.util.Scanner;

public class Management {
	
	Dinosaur dino = new Dinosaur();
	Scanner sc = new Scanner(System.in);
	int a;
	int b;
	int c;
	
	
	public static void main(String[] args) {
		Management management = new Management();
		management.handleMenu();
		
	}
	
	
	void handleMenu() {
		
		while(true) {
			System.out.println("1. 공룡 행복 지수");
			System.out.println("2. 공룡 건강 지수");
			System.out.println("3. 공룡 안전 지수");
			System.out.println("4. 나가기");
			System.out.print("메뉴 번호를 입력해 주세요 >> ");
			int number = sc.nextInt();
			switch(number) {
			case 1: handleHappyPoint();
			break;
			case 2: handleHealtyPoint();
			break;
			case 3: handleSafetyPoint();
			break;
			case 4: System.out.println("종료"); 
				System.exit(0);
			}
		}
		
	}
	
	void handleHappyPoint() {
		while(true) {
			try {
				System.out.print("공룡의 행복지수를 입력해주세요 0~100 >> " );
				a = sc.nextInt();
				dino.setHappyPoint(a);
			} catch (DinosaurHappyException1 e) {
				System.out.println("행복지수의 범위를 초과했습니다. 다시 입력해 주세요.");
			} catch (DinosaurHappyException2 e) {
				System.out.println("행복지수를 30점 이상으로 올려야힙니다.");
				System.out.println("현재 행복 지수 : " + a);
				break;
			} catch (DinosaurHappyException3 e) {
				System.out.println("현재 행복 지수 : " + a);
				break;
			}
				
			
			}
		System.out.print("나가기 위해 아무거나 입력해하세요 >>" );
		String ex = sc.next();
		
		}
	
	void handleHealtyPoint() {
		while(true) {
			try {
				System.out.print("공룡의 건강지수를 입력해주세요 0~10 >> " );
				b = sc.nextInt();
				dino.setHealthyPoint(b);;
			} catch (DinosaurIllException1 e) {
				System.out.println("건강지수의 범위를 초과했습니다. 다시 입력해 주세요.");
			} catch (DinosaurIllException2 e) {
				System.out.println("건강지수를 3점 이상으로 올려야합니다.");
				System.out.println("현재 건강 지수 : " + b);
				break;
			} catch (DinosaurIllException3 e) {
				System.out.println("현재 건강 지수 : " + b);
				break;
			}
				

			
			}
		System.out.print("나가기 위해 아무거나 입력해하세요 >>" );
		String ex = sc.next();
		
		}
	
	void handleSafetyPoint() {
		while(true) {
			try {
				System.out.print("공룡의 안전 지수를 입력해주세요 0~10 >> " );
				c = sc.nextInt();
				dino.setSafetyPoint(c);
			} catch (DinosaurSafetyException1 e) {
				System.out.println("안전 지수의 범위를 초과했습니다. 다시 입력해 주세요.");
			} catch (DinosaurSafetyException2 e) {
				System.out.println("안전 지수를 5점 이상으로 올려야합니다.");
				System.out.println("현재 안전 지수 : " + c);
				break;
			} catch (DinosaurSafetyException3 e) {
				System.out.println("현재 안전 지수 : " + c);
				break;
			}
			
			}
		System.out.print("나가기 위해 아무거나 입력해하세요 >>" );
		String ex = sc.next();
		
		}
			
		
		
	

}
