package chap_13.pratice;

public class pratice5 {

	public static void main(String[] args) {
		StringBuilder[] sb = new StringBuilder[10];
		String[] s = new String[10];
		sb[0] = new StringBuilder("디노0");
		sb[1] = new StringBuilder("디노1");
		sb[2] = new StringBuilder("디노2");
		sb[3] = new StringBuilder("디노3");
		sb[4] = new StringBuilder("디노4");
		sb[5] = new StringBuilder("디노5");
		sb[6] = new StringBuilder("디노6");
		sb[7] = new StringBuilder("디노7");
		sb[8] = new StringBuilder("디노8");
		sb[9] = new StringBuilder("디노9");
		
		for (int i=0; i<sb.length; i++) {
			s[i] = new StringBuilder("새로 태어난 ").append(sb[i]).toString();
			System.out.println(s[i]);
			
		}
		
		
		
		
		
		
		
		
	}

}
