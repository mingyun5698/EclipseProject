package chap_13;

import java.util.Scanner;

public class _01_ScannerAPI {

	
	
	public static void usingKeyborad() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter age");
		if(sc.hasNextInt()) {
			int age = sc.nextInt();
			System.out.println(age);
		}
		
	}
	public static void main(String[] args) {
		usingKeyborad();
	}

}
