package chap_13;

import java.util.Scanner;

public class _04_ {

	public static void usingString() {
		String input = "Maaike delim vandelim Putten delim 22";
		Scanner sc = new Scanner(input).useDelimiter("\\s*delim\\s*"); // 정규식
		
		 System.out.println(sc.next());
	     System.out.println(sc.next());
	     System.out.println(sc.next());
	     System.out.println(sc.nextInt());
	     sc.close();
	}
	
	public static void main(String[] args) {
		usingString();
	}
	

}
