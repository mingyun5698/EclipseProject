package chap_05;

public class Quiz {

	public static void main(String[] args) {
		// 1번연습
		for (int i=1; i<=100; i++) {
			System.out.println("dino" + i);
		}
		// 2번연습
		int pull = 0;
		do {
			pull++;
			System.out.println("공룡에게 밥을 줍니다.");
		
			
		} while (pull < 10);
		System.out.println("공룡이 배가 부릅니다.");
		// 3번연습
		int count = 10;
		while (count>=0) {
			System.out.println("공원 개장 카운트 다운 : " + count);
			count--;
				}	
		// 4번연습
		int[] weight = {500, 400, 1100, 600, 750};
		int sum = 0;
		for (int i=0; i<5; i++) {
			sum+= weight[i];
			
		} System.out.println("공룡의 총 무게는 " + sum + "kg 입니다.");
		
		// 5번연습
		int ticket = 10;
		
		while (ticket > 0) {
			ticket--;
			System.out.println("티켓 판매를 완료했습니다. 남은 티켓 : " + ticket);
		} System.out.println("티켓을 모두 팔았습니다.");
		// 6번연습
		int securityPoint = 0;
		int securityStandards = 10;
		do {
			securityPoint++;
			System.out.println("보안 체크 완료. 현재 보안 포인트 : " + securityPoint);
		} while(securityStandards >= securityPoint);
			System.out.println("적정 보안 기준을 넘었습니다.");
			
		// 1번 프로젝트
		int time = 11;
		
		// 2번 프로젝트
		int[] T_Rex = {8, 14, 22};
		int[] Brachiodaurus = {7, 11, 15};
		
		// 3번 프로젝트
		for (int i = 0; i<3; i++) {
			if(T_Rex[i] == time) {
				System.out.println("T_Rex는 " + time + "시에 식사시간 입니다.");
			} else if(Brachiodaurus[i] == time) {
				System.out.println("Brachiodairus는 " + time + "시에 식사시간 입니다.");
			} 
		}
		// 4번 프로젝트
		int T_RexNeedFood = 100;
		int BrachiodaurusNeedFood = 250;
		
		
		// 5번 프로젝트
		String myDino = "T_Rex";
		if(myDino == "T_Rex") {
			for (int i = 0; i<3; i++) {
				// 6번 프로젝트
				System.out.println(myDino + "는 " + T_Rex[i] + "시에 " + T_RexNeedFood + "kg 밥을 먹어야합니다.");
		}
				
			
		} else if (myDino == "Brachiodaurus") {
			for (int i = 0; i<3; i++) {
				// 6번 프로젝트
				System.out.println(myDino + "는 " + Brachiodaurus[i] + "시에 " + BrachiodaurusNeedFood + "kg 밥을 먹어야합니다.");
			}
		}
		
		// 7번 프로젝트
		time = 0;
		while(time<24) {
			if (myDino == "T_Rex") {
				for (int i=0; i<T_Rex.length; i++) {
					if(T_Rex[i] == time) {
						System.out.println(myDino + "는 " + time + "시에 " + T_RexNeedFood + "kg 밥을 먹어야합니다.");
					}
				}
			} else if (myDino == "Brachiodaurus") {
				for (int i=0; i<Brachiodaurus.length; i++) {
					if(Brachiodaurus[i] == time) {
						System.out.println(myDino + "는 " + time + "시에 " + BrachiodaurusNeedFood + "kg 밥을 먹어야합니다.");
					}
				}
			} 
		time ++;
		}
		
		
		
	} 	
	
		

}
