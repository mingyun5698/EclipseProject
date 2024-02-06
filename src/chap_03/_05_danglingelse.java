package chap_03;

public class _05_danglingelse {

	public static void main(String[] args) {
		boolean flag=false;
		if (flag)
		if (flag)
		System.out.println("True True");
		else
		System.out.println("True False");

		if (flag) { if (flag) {
		      System.out.println("True True");
		   }
		   else {
		      System.out.println("True True");
		   }
		}

	}

}
