package food;

public class Management {

		Dinasaur[] dino = new Dinasaur[2];
		Food[] food = new Food[2];
	
	
	public static void main(String[] args) {

		Management management = new Management();
		management.creatinstance();
		management.eat();
		
	}
	
		void creatinstance() {
			dino[0] = new herbivorousDino("스티", 25, "스테고사우르스");
			dino[1] = new CarnivorousDino("티노", 15, "티라노사우르스");
			
			food[0] = new Vegetable("나뭇잎", "섬유질", 10);
			food[1] = new Meat("스테이크", "단백질", 100);
		}
		
		
		
		void eat() {
			for(int i=0; i<dino.length; i++) {
				if(dino[i].dinoType() == "초식공룡") {
					System.out.println(dino[i].name + "의 음식이름:" + food[0].name + " 영양소:" + food[0].nutrient + " 무게:" + food[0].amount + "kg");
				}
				
				else if(dino[i].dinoType() == "육식공룡") {
					System.out.println(dino[i].name + "의 음식이름:" + food[1].name + " 영양소:" + food[1].nutrient + " 무게:" + food[1].amount + "kg");
				}
			}
		}

}
