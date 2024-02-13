package chap_07;

public class _03_Calc {

	public static int performCalc(int x, int y, String operation) {
	       int result = switch(operation) {
	          case "+" -> x + y;
	          case "-"  -> x - y;
	          case "*"  -> x * y;
	          case "/"  -> x / y;
	          case "%" -> x % y;
	          default -> {
	              System.out.println("Unknown operation: " + operation);
	              yield -1; // error
	          }
	     };
	     return result;
	}
	
	public static void main(String[] args) {
		int result = performCalc(10, 2, "+");
	      System.out.println(result);
	      System.out.println(performCalc(10, 2, "-"));
	      System.out.println(performCalc(10, 2, "*"));
	      System.out.println(performCalc(10, 2, "/"));
	      System.out.println(performCalc(10, 2, "%"));
	      System.out.println(performCalc(10, 2, "&"));// Unreconized operation: &, -1

	}

}
