package chap_05;

public class _06_continues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("i, j");
		   for(int i = 1; i <= 3; i++) {
		       for(int j = 1; j <= 5; j++) {
		            if (j == 3) {
		                continue; // next iteration
		            }
		            System.out.println(i + ", " + j);
		       }
		    }

	}

}
