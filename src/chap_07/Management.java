package chap_07;
import java.util.*;

// public class Management {
// 	 static String[] dinoNames = new String[5];
// 	 static Scanner sc = new Scanner(System.in);
	
// 	public void start() {
// 		while (true) {
// 			displayMenu();
// 			int choice = sc.nextInt();
// 			handleMenuChoice(choice);
// 		}
// 	}
	
	
	
// 	public void displayMenu() {
// 		System.out.println("Welcome to Mesozoic Eden Assistant!");
// 		System.out.println("1. Add Dinosaur");
// 		System.out.println("2. Check Park Hours");
// 		System.out.println("3. Greet Guest");
// 		System.out.println("4. Check Visitors Count");
// 		System.out.println("5. Manage Staff");
// 		System.out.println("6. Exit");
// 		System.out.print("Enter your choice: ");
// 	}
	
// 	public void handleMenuChoice(int choice) {
// 		switch (choice) {
// 		case 1: addDinosaur();
// 			break;
// 		case 2: checkParkHours();
// 			break;
// 		case 3: greetGuest();
// 			break;
// 		case 4: checkVisitorsCount();
// 			break;
// 		case 5: manageStaff();
// 			break;
// 		case 6: System.out.println("Exiting...");
// 			System.exit(0);
// 			break;
// 		}
// 	}
	
// 	public static void addDinosaur() {
// 		System.out.print("첫번째 공룡의 이름을 쓰세요 -> ");
// 		dinoNames[0] = sc.next();
// 		System.out.print("두번째 공룡의 이름을 쓰세요 -> ");
// 		dinoNames[1] = sc.next();
// 		System.out.print("세번째 공룡의 이름을 쓰세요 -> ");
// 		dinoNames[2] = sc.next();
// 		System.out.print("네번째 공룡의 이름을 쓰세요 -> ");
// 		dinoNames[3] = sc.next();
// 		System.out.print("다섯번째 공룡의 이름을 쓰세요 -> ");
// 		dinoNames[4] = sc.next();
// 		System.out.println("추가된 공룡의 이름 : " + dinoNames[0] + ", "+ dinoNames[1] + ", "+ dinoNames[2] + ", "+ dinoNames[3] + ", "+ dinoNames[4]);
// 	}
	
// 	public static void checkParkHours() {
// 		System.out.println("공원 개장 시간은 09:00 ~ 18:00 입니다. ");
// 	}
	
// 	public static void greetGuest() {
// 		System.out.print("당신의 이름을 입력하세요 -> ");
// 		String name = sc.next();
// 		System.out.println("환영합니다. " + name + "님. 현재 있는 공룡은 " + dinoNames[0] + ", "+ dinoNames[1] + ", "+ dinoNames[2] + ", "+ dinoNames[3] + ", "+ dinoNames[4] + "가 있습니다.");
// 	}
	
// 	public static void checkVisitorsCount() {
// 		System.out.print("입장 인원을 입력하세요 -> ");
// 		int number = sc.nextInt();
// 		if (number > 50) {
// 			System.out.println(number-50 + "명이 초과되어 입장할 수 없습니다. 입장 가능한 인원 : 50명");
// 		} else {
// 			System.out.println("환영합니다. 남은 입장 수 : " + (50-number));
// 		}
// 	}
	
// 	public static void manageStaff() {
// 		System.out.print("직원의 이름을 입력하세요 -> ");
// 		String staffName = sc.next();
// 		System.out.print("직원의 나이를 입력하세요 -> ");
// 		int staffAge = sc.nextInt();
// 		System.out.println("직원의 이름은 " + staffName + "이며 나이는 " + staffAge + "살 입니다.");
// 	}
	
	
// 	public static void main(String[] args) {
// 		Management main = new Management();
// 		main.start();
// 	}

}

static String[] dinoNames = new String[100];
    static Scanner sc = new Scanner(System.in);
    static int count1 = 0;
    static int count2 = 0;

    public void start() {
        while (true) {
            displayMenu();
            int choice = sc.nextInt();
            handleMenuChoice(choice);
        }
    }



    public void displayMenu() {
        System.out.println("Welcome to Mesozoic Eden Assistant!");
        System.out.println("1. 공룡이름추가");
        System.out.println("2. 공룡이름삭제");
        System.out.println("3. 공원 오픈 시간 확인");
        System.out.println("4. 환영 인사");
        System.out.println("5. 방문객 수 체크");
        System.out.println("6. 스태프 관리");
        System.out.println("7. 종료");
        System.out.print("Enter your choice: ");
    }

    public void handleMenuChoice(int choice) {
        switch (choice) {
            case 1: addDinosaur();
                break;
            case 2 : deleteDinosaur();
                break;
            case 3: checkParkHours();
                break;
            case 4: greetGuest();
                break;
            case 5: checkVisitorsCount();
                break;
            case 6: manageStaff();
                break;
            case 7: System.out.println("Exiting...");
                System.exit(0);
                break;
        }
    }

    public static void addDinosaur() {
        System.out.println("추가시킬 공룡을 입력하세요");
        count1 = 0;
        while(true) {
            System.out.print(">");
            String name=sc.nextLine();

            if(name.equals("그만"))break;

            dinoNames[count1]=name;
            count1++;

            System.out.print("공룡 이름:[");
            for (int i=0; i<count1; i++) {
                System.out.print(dinoNames[i]);
                if(i==count1-1) break;
                System.out.print(" ");
            }
            System.out.println(" ]");
        }



    }

    public static void deleteDinosaur() {
        if (count1 < 2) {
            System.out.println("현재 추가된 공룡이 없습니다.");
        } else {
            System.out.print("공룡 이름:[");
            for (int i=0; i<count1; i++) {
                System.out.print(dinoNames[i]);
                if(i==count1-1) break;
                System.out.print(" ");
            }
            System.out.println(" ]");
            int arrsize = dinoNames.length;
            count2 = 0;

            while (true) {
                List<String> str = new ArrayList<>(Arrays.asList(dinoNames));
                System.out.println("삭제할 공룡 번호를 써주세요 > ");
                int ind = sc.nextInt();

                if (ind == 9999) break;

                else if (ind > count1-1 || ind < 1) {
                    System.out.println("없는 번호입니다.");
                }


                else {
                    str.remove(ind);
                    dinoNames = str.toArray(new String[arrsize]);
                    count2++;

                    System.out.print("공룡 이름:[");
                    for (int i = 0; i < count1 - count2; i++) {
                        System.out.print(dinoNames[i]);
                        if (i == count1 - count2 - 1) break;
                        System.out.print(" ");
                    }
                    System.out.println(" ]");
                }
            }
        }
    }

    public static void checkParkHours() {
        System.out.println("공원 개장 시간은 09:00 ~ 18:00 입니다. ");
    }

    public static void greetGuest() {
        System.out.print("당신의 이름을 입력하세요 -> ");
        String name = sc.next();
        System.out.print("환영합니다. " + name + "님. 공원 개장 시간은 09:00 ~ 18:00 이며 현재 있는 공룡은 " );
        System.out.print("[");
        for (int i = 0; i < count1 - count2; i++) {
            System.out.print(dinoNames[i]);
            if (i == count1 - count2 - 1) break;
            System.out.print(" ");
        }
        System.out.println(" ] 가 있습니다.");
    }

    static int[] ab = new int[100];
    public static void checkVisitorsCount() {

        int number;
        int nowNumber = ab[0];

        System.out.print("입장 인원을 입력하세요 (현재인원 : " + nowNumber + ") -> ");
        number = sc.nextInt();
        nowNumber += number;

        if(nowNumber>500) {
            System.out.println("더이상 입장하실 수 없습니다. 현재 관광객 수 : " + (500) + "명");
            ab[0] = 500;
        } else {
        System.out.println("입장 가능합니다. 현재 관광객 수 : " + (nowNumber) + "명");
            ab[0] = nowNumber;
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
