package chap_13;

public class _05_String {

	
	public static void howManyObjectsString() {
		String s = "The ";
		s += "quick ";
		System.out.println(s);
		
		s.concat("brown fox");
		System.out.println(s);
		s = s.concat("brown fox");
		System.out.println(s);
		}
	
	public static void howManyObjectsSB() {
        StringBuilder sb = new StringBuilder("The ");
        sb.append("quick ");                
        System.out.println(sb);            // The quick
        sb.append("brown fox");
        System.out.println(sb);            // The quick brown fox
		}
	
	public static void whatHappens(String s, StringBuilder sb) {
		s = s.concat("A");
		sb.append("A");
	}
	
	
	
	
	
	public static void main(String[] args) {
		howManyObjectsString();
		howManyObjectsSB();
		
		String s = "s";
		StringBuilder ss = new StringBuilder("s");
		
		whatHappens(s, ss);
		System.out.println(s);
		System.out.println(ss);
	}

}
