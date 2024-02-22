package chap_10;

public class _01_InitBlock {
	static {System.out.println("1. InitializationBlocks static init block");}
    {System.out.println("InitializationBlocks instance init block"); }
	
	public static void main(String[] args) {
		
		
		System.out.println(" --> Creating first child object..");
		new Child();
		System.out.println("\n--Creating second Child object...");
		new Child();
		
		
		
	
	}

}

class Parent {
	{System.out.println("6. Parent instance init block 1");}
	static { System.out.println("2. Parent static init block 1");}
	Parent() { System.out.println("8. Parent constructor"); }
	{ System.out.println("7. Parent instance init block 2"); }
	static { System.out.println("3. Parent static init block 2");}
}

class Child extends Parent {
	{ System.out.println("9. Child instance init block 1"); }
	static {System.out.println("4. Child static init block 1");}
	Child() { System.out.println("11. Child constructor"); }
	{ System.out.println("10. Child static init block 2");}
	static { System.out.println("5. Child static init block 2\n");}
}
