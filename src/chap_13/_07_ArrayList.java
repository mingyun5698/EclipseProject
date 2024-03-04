package chap_13;
import java.util.*;

public class _07_ArrayList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("J");
		list.add("A");
		list.add("V");
		list.add("A");
		System.out.println(list);
		
		list.add(1,"0");
		list.add(3,"0");
		System.out.println(list);
		
		list = new ArrayList<>();
		list.add("Joe"); list.add("Mary"); list.add("Joe");
		System.out.println(list.contains("Mary"));
		System.out.println(list.get(0));
		System.out.println(list.indexOf(2));
		System.out.println(list.indexOf("Joe"));
		System.out.println(list.remove("Joe"));
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		list.set(0, "Paul");
		list.add("dd");
		System.out.println(list.remove(1));
		
	}

}
