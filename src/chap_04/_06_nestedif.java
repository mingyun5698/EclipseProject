package chap_04;

public class _06_nestedif {

	public static void main(String[] args) {
		final int JAN = 1; final int FEB = 2; final int MAR = 3; // 상수
		final int APR = 4; final int MAY = 5; final int JUN = 6;
		final int JUL = 7; final int AUG = 8; final int SEP = 9;
		final int OCT = 10; final int NOV = 11; final int DEC = 12; 
		
		
		System.out.println("Enter month -> " + FEB);
		

		int month = 2;
		int numDays;
		if(month == JAN || month == MAR || month == MAY || month  ==JUL || month == OCT || month == DEC) {
		   numDays=31;
		} else if (month == APR || month == JUN || month == SEP || month == NOV) {
		   numDays=30;
		} else if(month== FEB) {
		   System.out.println("Enter year -> " + month);
		}
	}
		  

		   
		

	

}
