package chap_05;

public class _05_break {

	public static void main(String[] args) {
		System.out.println("i, j");
		   for(int i = 1; i <= 3; i++) {
		       for(int j = 1; j <= 5; j++) {
		             if(j == 3) {
		                break; // breaks out of inner loop
		             }
		             System.out.println(i + ", " + j);
		        }
		    }
//		   OUTER:for (int i = 1; i <= 3; i++) {
//			      for (int j = 1; j <= 5; j++) {
//
//			   System.out.println("i, j");
//			   OUTERLOOP:
//			   for(i = 1; i <= 3; i++) {
//			       for(j = 1; j <= 5; j++) {
//			           if (j == 3) {
//			                 break OUTERLOOP; // case sensitive
//			           }
//			           System.out.println(i + ", " + j);
//			       }
//			    }
//			    System.out.println("here");
//
//			      
//	}
//		   
//
//		   }
	}
}
