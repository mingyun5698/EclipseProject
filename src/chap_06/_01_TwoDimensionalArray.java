package chap_06;

public class _01_TwoDimensionalArray {

	public static void main(String[] args) {
		  int[][] matrix = { {1,2,3,4}, {5,6,7,8},{9,10,11,12}};
		  for(int i = 0; i < matrix.length; i++) {
		     for(int j = 0; j < matrix[i].length; j++){
		        System.out.print(matrix[2-i][3-j] + " ");
		     }
		     System.out.println();
		   }


	}

}
