package chap_05;

public class _03_for {

	public static void main(String[] args) {
		 for(int i=3; i>=1; i--){
			    System.out.println(i); // 3,2,1
			 }

			  for(int i=1; i<=3; i++); {
			     System.out.println("Looping"); // 한번 만 실행된다.
			  }
			  
			  for(int i=10; i<=50; i+=10){
			     System.out.println(i); // 10, 20, 30, 40, 50
			  }
			  // System.out.println(i); // i는 스코프 밖에 있다.

			  for(int i=0, j=0; i<1 && j <1; i++,j++){
			     System.out.println(i +  " " + j); // 0 0 


	}

	}
}
