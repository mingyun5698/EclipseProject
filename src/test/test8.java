package test;

public class test8 {

	public static void main(String[] args) {
		int[] a = {5,4,3,2,1};
		for (int i=0; i<5; i++) {
			System.out.println(a[(i+1)%5]);
		}
	}

}
