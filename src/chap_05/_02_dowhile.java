package chap_05;
import java.util.Scanner;

public class _02_dowhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 ->");
		int age = sc.nextInt();
		do {
			System.out.println("당신의 나이는" + age + "세 이상이면 주류를 살 수 있습니다.");
			System.out.print("나이를 입력하세요 ->");
			age = sc.nextInt();
		} while (age>18);

	}

}
