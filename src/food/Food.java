package food;

public class Food {
	String nutrient;
	int amount;
	String name;
	
	Food(String name, String nutrient, int amount) {
		this.name = name;
		this.nutrient = nutrient;
		this.amount = amount;
	}
}


class Vegetable extends Food {
	Vegetable(String name, String nutrient, int amount) {
		super(name, nutrient, amount);
	}
}

class Meat extends Food {
	Meat(String name, String nutrient, int amount) {
		super(name, nutrient, amount);
	}
}
