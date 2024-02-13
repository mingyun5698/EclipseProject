package chap_06;

import java.util.Arrays;

public class Quiz {

	public static void main(String[] args) {

		
		int[] wei = {1020,1435,67373,1425,623,16347,15592,12415};
		int temp=0;
		int i, j;
		
		for (i = 1; i < wei.length; i++ ) {
			for(j = 0; j < wei.length-i; j++) {
				if(wei[j] > wei[j+1]) {
					temp = wei[j];
					wei[j] = wei[j+1];
					wei[j+1] = temp;
				} else 
					continue;
			}
		}
		
		
			System.out.println("가장 몸무게가 큰 공룡의 무게는 " + wei[wei.length-1] + "kg 입니다.");
		 System.out.println(" ");
		

		
		String[][] matrix = new String[5][5];
		
		for(i = 0; i < 1; i++) {
			for (j = 0; j<5; j++) {
				matrix[i][j] = "공룡우리" + j;
			}
		}
		
		for(i = 1; i < 5; i+=2) {
			for (j = 0; j<5; j++) {
				matrix[i][j] = " " ;
			}
		}
		
		matrix[2][0] = " ";
		matrix[2][1] = "햄버거 가게";
		matrix[2][2] = " ";
		matrix[2][3] = " ";
		matrix[2][4] = "           편의점";
		matrix[4][0] = "    버스정류장";
		matrix[4][1] = " ";
		matrix[4][2] = "     매표소";
		matrix[4][3] = " ";
		matrix[4][4] = " ";
		
		for(i=0; i<matrix.length; i++) {
			for(j=0; j<matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			} System.out.println(" ");
		}
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		
		i=0;
		j=0;
		String[][] chair = new String[10][5];
		for(i=0; i<chair.length; i++) {
			for(j=0; j<chair[i].length; j++) {
				if(j!=2) {
					chair[i][j] = "의자 ";
				} else {
					chair[i][j] = "  ";
				}
			}
		}
		
		for(i=0; i<chair.length; i++) {
			for(j=0; j<chair[i].length; j++) {
				System.out.print(chair[i][j]);
			} System.out.println(" ");
		}
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		
		String[] dinoNames = {"dino1","dino2","dino3","dino4","dino5","dino6","dino7","dino8","dino9","dino10"};
		int[] dinoAges = {14,12,16,15,8,14,7,9,10,25};
		String[] dinoSpecies = {"티라노사우르스","렙터","스테고사우루스","프테라노돈","브라키오사우르스","트리케라톱스","메갈로돈","만악룡","안킬로사우르스","바리오닉스"};
		int[] dinoNumbers = {152,526,231,74,18,362,89,901,61,205};
		int[] dinoWeights = {281,656,735,134,1627,7456,8586,6315,2414,326};
		
		for (i=0; i<10; i++) {
			System.out.println(dinoNames[i] + "는 " 
								+ dinoSpecies[i] + "이며 나이는 " 
								+ dinoAges[i] + "살이고 몸무게는 " 
								+ dinoWeights[i] + "kg이고 우리번호는 " 
								+ dinoNumbers[i] + "번 입니다.");
		}
		
		
		int ageAvg=0;
		for (i=0; i<10; i++) {
			ageAvg += dinoAges[i]/dinoAges.length;
		}
		
		int weightAvg=0;
		for (i=0; i<10; i++) {
			weightAvg += dinoWeights[i]/dinoWeights.length;
		}
		
		System.out.println("공룡들의 평균 나이는 " + ageAvg + "살이고 평균 몸무게는 " 
							+ weightAvg + "kg 입니다.");
	}

}
