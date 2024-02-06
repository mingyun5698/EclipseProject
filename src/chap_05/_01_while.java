package chap_05;
import java.util.Scanner;

public class _01_while {

	public static void main(String[] args) {
		int sum = 0;
		boolean keepGoing = false;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a number (negative number to exit) -> ");
			int n = sc.nextInt();
			if(n<0) {
				keepGoing = false;
				
			} else {
				sum = sum + n;
			}
			
		} while(keepGoing);
		System.out.println("Sum of number is : " + sum);
		

	}

}
