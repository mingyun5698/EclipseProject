package test;

public class test7 {

	public static void main(String[] args) {
			String a = "a";
			String b = "a";
			String c = new String("a");
			String d = new String("a");
			
			System.out.println(a==b);
			System.out.println(c==d);
			System.out.println(a==c);
			System.out.println(b.equals(c));
			System.out.println(c.equals(d));

			
	}

}
