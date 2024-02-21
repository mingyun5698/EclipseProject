package test;

public class this_ {
	
	String name;
	int price;
	
	this_(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	this_() {
		this("이것", 500);
	}
	
	 String getThis_(String name) {
		return this.name;
	}

	public static void main(String[] args) {
		

	}

}
