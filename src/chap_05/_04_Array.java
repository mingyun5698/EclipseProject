package chap_05;

public class _04_Array {

	public static void main(String[] args) {
		int[] ia = {1,2,3};
		  for(int n : ia) {
		      System.out.println(n); // 1, 2, 3
		  }
		  
		  int[] data = {9, 3, 5, 7};
		  
		  System.out.println("[]\t[n]\tHistogram");
		  for (int i=0; i<data.length; i++){
		      System.out.print(i + "\t" + data[i] + "\t");
		      for(int j=1; j<=data[i]; j++) { // write out data[i] stars
		           System.out.print("*");          // print() not println()
		       }
		      System.out.println();              // go onto next line
		   }


	}

}
