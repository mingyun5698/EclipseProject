package chap_07;
import java.util.Scanner;

public class _02_Methods {

	public static void main(String[] args) {
		 int number = getNumber();
         number = getNumber();
         number = getNumber();
         getNumber();

	}
	  public static int getNumber() {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter a number (1..10) -> ");
          int number = sc.nextInt();
          if(number < 1 || number > 10){
              System.out.println("Invalid number! " + number);
          }
          return number;
      }

}
