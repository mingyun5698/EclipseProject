package chap_03;

public class Quiz {

	public static void main(String[] args) {
		boolean isCarnivore = true;
		String name = "디노";
		
		if (isCarnivore) {
			System.out.println(name + "는 " + "육식공룡 입니다.");
		} else {
			System.out.println(name + "는 " + "초식공룡 입니다.");
		}
		
		String species = "T-rex";
		
		switch(species) {
		case "T-rex" :
			System.out.println("위험한 육식공룡 이므로 주의하세요.");
			break;
		case "triceratops" :
			System.out.println("초식공룡 이므로 먹이는 풀만 주세요.");
			break;
		default:
			System.out.println("없는 공룡 입니다.");
				
		}
		
		int dinosaurType = 5;
		int yearsExperience = 7;
		
		if (yearsExperience > dinosaurType ) {
			System.out.println("공룡을 다루기에 충분합니다.");
		} else {
			System.out.println("공룡을 다루기에 불충분합니다.");
		}
		
		int safetyRating = 8;
		int safetyThreshold = 5;
		
		if (safetyThreshold >= safetyRating) {
			System.out.println("이 공원은 안전합니다.");
		} else {
			System.out.println("이 공원은 위험합니다.");
		}
		
		String size = "M";
		switch(size) {
		case "S" :
			System.out.println("Small Herbivore Enclosue");
			break;
		case "M" :
			System.out.println("Medium Herbivore Enclosue");
			break;
		case "L" :
			System.out.println("Large Herbivore Enclosue");
			break;
		case "XL" :
			System.out.println("Carnivore Enclosue");
			break;
			default :
				System.out.println("공룡 사이즈를 정확히 입력하세요 ");
		}
		
		int weight = 300;
		if (weight < 100) {
			System.out.println("먹이를 조금만 주세요");
		} else if (weight >= 100 || weight < 500) {
			System.out.println("먹이를 적당히 주세요.");
		} else 
			System.out.println("먹이를 많이 주세요");
		
		int time = 9;
		safetyRating = 5;
		String role = "feeding";
		
		if (time == 9 || role == "feeding" || safetyRating < 7 || time==12 || time==6) {
			System.out.println("먹이를 주세요");
		} else if (time == 10 || role == "cleaning" || safetyRating < 7) {
			System.out.println("청소를 하세요");
		} else if (time == 10 || role == "tour guiding" || safetyRating < 7) {
			System.out.println("투어 가이드를 하세요.");
		} else {
			System.out.println("쉬세요");
		}

	}

}
