package test;

public class test9 {

	public static void main(String[] args) {
		Parent1 obj = new Child1();
        System.out.print(obj.compute(3));
	}

}

class Parent1 {
    int compute(int num) {
        if(num <= 1)
            return num;
        return compute(num-1) + compute(num-2);
    }
}

class Child1 extends Parent1 {
    int compute(int num) {
        if(num <= 1)
            return num;
        return compute(num-1) + compute(num-3);
    }
}
